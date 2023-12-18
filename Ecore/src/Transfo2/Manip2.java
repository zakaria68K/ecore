package Transfo2;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Manip2 {

    public static void main(String[] args) {



        // Register the XMI resource factory for the EMF resource set
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

        // Create an EMF resource set
        ResourceSet resourceSet = new ResourceSetImpl();

        // Load the input metamodel (InitConfig.ecore)
        Resource MMResource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/InitConfig/InitConfig.ecore"), true);
        EObject MMracine = MMResource.getContents().get(0);
        EPackage MMePackage = (EPackage) MMracine;

        // Load the output metamodel DockerMetamodel.ecore)
        Resource MMSResource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/Docker/DockerMetamodel.ecore"), true);
        EObject MMSracine = MMSResource.getContents().get(0);
        EPackage MMSePackage = (EPackage) MMSracine;

        // Load the input model (InitConfig.model)
        String nsUri = MMePackage.getNsURI();
        resourceSet.getPackageRegistry().put(nsUri, MMePackage);
        Resource load_resource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/InitConfig/InitConfig.model"), true);
        Resource MResource = load_resource;
        EObject MRacine = MResource.getContents().get(0);

 
        //Iterate through all elements to extract the value of the project type 
        
        EObject rootObject = MRacine;
        TreeIterator<Object> iterator = EcoreUtil.getAllContents(Collections.singletonList(rootObject));
        EObject eObject= null;
        Object language=  null ;
        Object buildSoftware = null;
        while (iterator.hasNext()) {
            Object obj = iterator.next();

            if (obj instanceof EObject) {
                 eObject = (EObject) obj;
                for (EStructuralFeature feature : eObject.eClass().getEAllStructuralFeatures()) {
                    
                    if ("cmd".equals(feature.getName())) {
                    	language = eObject.eGet(feature);                    	
                    	}
                    if ("description".equals(feature.getName())) {
                        
                    	buildSoftware = eObject.eGet(feature);
                    	}
                    
                	}	
              	}
        	}
        
        //we will proceed by cases (1:java laguage/maven, 2:Java language/gradle, 3:Javascript language

    	// Create an instance of the root class from the output metamodele
        EClass outputRootClass = (EClass) MMSePackage.getEClassifier("Dockerfile");
        EObject outputModelRoot = MMSePackage.getEFactoryInstance().create(outputRootClass);
        
        
        
        
        //This case is for the Java : Gradle & Maven
        
        if(language.toString().contentEquals("java")) {
    	//traitement pour la création d'un modèle de sortie DockerFile 



        	
            //le nom du DockerFile
            EAttribute name = (EAttribute) outputRootClass.getEStructuralFeature("name");
            outputModelRoot.eSet(name, "DockerFile");
            
            //Image de base settings
            
            //Creating the conform cloning child of stages 'first attribute'
            EClass fromClass = (EClass) MMSePackage.getEClassifier("From");
            EObject fromObject = MMSePackage.getEFactoryInstance().create(fromClass);

            EAttribute nameFrom = (EAttribute) fromClass.getEStructuralFeature("name");
            fromObject.eSet(nameFrom, "FROM");
            
            EReference fromReference = findContainmentReference(outputRootClass, "instruction");

         // Initialize the "FROM" feature if it's null
            EList<EObject> fromList = (EList<EObject>) outputModelRoot.eGet(fromReference);
            if (fromList == null) {
            	fromList = new BasicEList<>();
            }

            // Add cloningObject to cloningList
            fromList.add(fromObject);

            // Set cloningList to the "cloning" feature
            outputModelRoot.eSet(fromReference, fromList);
            
            
            // Save Output Model:
            Resource outputModelResource = resourceSet.createResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/Jenkins.model"));
            outputModelResource.getContents().add(outputModelRoot);
            try {
                outputModelResource.save(null);
            } catch (IOException e) {
                e.printStackTrace();
            }
            printEObject(outputModelRoot,0);

            
            
            
            
            
            

        }
        
       

   
    
    
    
    
    
    
    
    
    
    
    
    }
    private static void printEObject(EObject eObject, int indent) {
        for (EStructuralFeature feature : eObject.eClass().getEStructuralFeatures()) {
            Object value = eObject.eGet(feature);
            
            // Print feature name and value
            System.out.print(getIndent(indent) + feature.getName() + ": ");
            if (feature.isMany()) {
                System.out.println();
                for (Object element : (Iterable<?>) value) {
                    if (element instanceof EObject) {
                        printEObject((EObject) element, indent + 1);
                    } else {
                        System.out.println(getIndent(indent + 1) + element);
                    }
                }
            } else {
                if (value instanceof EObject) {
                    System.out.println();
                    printEObject((EObject) value, indent + 1);
                } else {
                    System.out.println(value);
                }  
            }
        }
    }

    private static String getIndent(int count) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < count; i++) {
            indent.append("  "); // Adjust the number of spaces as needed
        }
        return indent.toString();
    }
    
    private static EReference findContainmentReference(EClass eClass, String featureName) {
        for (EReference reference : eClass.getEAllReferences()) {
            if (reference.isContainment() && reference.getName().equals(featureName)) {
                return reference;
            }
        }
        throw new IllegalArgumentException("Containment reference not found: " + featureName);
    }

}
            
    	
    
	

