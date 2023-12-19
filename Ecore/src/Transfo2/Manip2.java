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



        	

        	// Set the name of DockerFile
        	EAttribute name = (EAttribute) outputRootClass.getEStructuralFeature("name");
        	outputModelRoot.eSet(name, "DockerFile");

        	// Set the name of DockerFile
        	EAttribute namefrom = (EAttribute) outputRootClass.getEStructuralFeature("name");
        	outputModelRoot.eSet(namefrom, "DockerFile");

        	// Create an instance of "From" class
        	EClass fromClass = (EClass) MMSePackage.getEClassifier("From");
        	EObject fromObject = MMSePackage.getEFactoryInstance().create(fromClass);

        	// Set the name of "From" object
        	EAttribute nameFrom = (EAttribute) fromClass.getEStructuralFeature("name");
        	fromObject.eSet(nameFrom, "FROM");

        	// Get the reference to the "instruction" feature
        	EReference instructionReference = findContainmentReference(outputRootClass, "instruction");

        	// Add "From" object to the "instruction" feature
        	if (outputModelRoot.eIsSet(instructionReference)) {
        	    // If the feature is already set, add to the existing list
        	    ((EList<EObject>) outputModelRoot.eGet(instructionReference)).add(fromObject);
        	} else {
        	    // If the feature is not set, create a new list and set the feature
        	    EList<EObject> fromList = new BasicEList<>();
        	    fromList.add(fromObject);
        	    outputModelRoot.eSet(instructionReference, fromList);
        	}
        	
        	//Create an argument from the 'FROM' Instruction
        	// Get the reference to the "argument" feature in "From" class
        	EReference argumentReference = findContainmentReference(fromClass, "argument");

        	// Create an instance of "Argument" class for the 'FROM' instruction
        	EClass argumentClass = (EClass) MMSePackage.getEClassifier("Argument");
        	EObject argumentObject = MMSePackage.getEFactoryInstance().create(argumentClass);

        	// Set the value of the "Argument" object 
        	//if statement for the gradle or the maven
        	if(buildSoftware.toString().contentEquals("maven")) {
        	EAttribute valueAttribute = (EAttribute) argumentClass.getEStructuralFeature("value");
        	argumentObject.eSet(valueAttribute, "maven:3.8.5-openjdk-17-slim AS build");
        	}
        	
        	else if(buildSoftware.toString().contentEquals("gradle")) {
            	EAttribute valueAttribute = (EAttribute) argumentClass.getEStructuralFeature("value");
            	argumentObject.eSet(valueAttribute, "gradle:7.3-jdk17 AS build");
            	}
        	
        	// Get the existing list of "Argument" objects or create a new one
        	EList<EObject> argumentList = (EList<EObject>) fromObject.eGet(argumentReference);
        	if (argumentList == null) {
        	    argumentList = new BasicEList<>();
        	}

        	// Add "Argument" object to the list
        	argumentList.add(argumentObject);

        	// Set the list to the "argument" feature in "From" class
        	fromObject.eSet(argumentReference,argumentObject);
        	
        	
        	
        	
        	 // Create an instance of "Workdir" class
        	EClass workdirClass = (EClass) MMSePackage.getEClassifier("Workdir");
        	EObject workdirObject = MMSePackage.getEFactoryInstance().create(workdirClass);

        	// Set the name of "Workdir" object
        	EAttribute nameWorkdir = (EAttribute) workdirClass.getEStructuralFeature("name");
        	workdirObject.eSet(nameWorkdir, "WORKDIR");

        	// Get the reference to the "instruction" feature
        	EReference instructionReference1 = findContainmentReference(outputRootClass, "instruction");

        	// Add "From" object to the "instruction" feature
        	if (outputModelRoot.eIsSet(instructionReference1)) {
        	    // If the feature is already set, add to the existing list
        	    ((EList<EObject>) outputModelRoot.eGet(instructionReference1)).add(workdirObject);
        	} else {
        	    // If the feature is not set, create a new list and set the feature
        	    EList<EObject> workdirList = new BasicEList<>();
        	    workdirList.add(fromObject);
        	    outputModelRoot.eSet(instructionReference1, workdirList);
        	}
        	
        	//Create an argument from the 'Workdir' Instruction
        	// Get the reference to the "argument" feature in "Workdir" class
        	EReference argumentReference1 = findContainmentReference(workdirClass, "argument");

        	// Create an instance of "Argument" class for the 'Workdir' instruction
        	EClass argumentClass1 = (EClass) MMSePackage.getEClassifier("Argument");
        	EObject argumentObject1 = MMSePackage.getEFactoryInstance().create(argumentClass1);

        	// Set the value of the "Argument" object 
        
        	EAttribute valueAttribute1 = (EAttribute) argumentClass1.getEStructuralFeature("value");
        	argumentObject1.eSet(valueAttribute1, " /opt/app");

        	// Get the existing list of "Argument" objects or create a new one
        	EList<EObject> argumentList1 = (EList<EObject>) workdirObject.eGet(argumentReference1);
        	if (argumentList1 == null) {
        	    argumentList1 = new BasicEList<>();
        	}

        	// Add "Argument" object to the list
        	argumentList1.add(argumentObject1);

        	// Set the list to the "argument" feature in "Workdir" class
        	workdirObject.eSet(argumentReference1,argumentObject1);
        	
        	
        	
        	
        	// Create an instance of "Run" class
        	EClass runClass = (EClass) MMSePackage.getEClassifier("Run");
        	EObject runObject = MMSePackage.getEFactoryInstance().create(runClass);

        	// Set the name of "Run" object
        	EAttribute nameRun = (EAttribute) runClass.getEStructuralFeature("name");
        	runObject.eSet(nameRun, "RUN");

        	// Get the reference to the "instruction" feature
        	EReference instructionReference2 = findContainmentReference(outputRootClass, "instruction");

        	// Add "Run" object to the "instruction" feature
        	if (outputModelRoot.eIsSet(instructionReference2)) {
        	    // If the feature is already set, add to the existing list
        	    ((EList<EObject>) outputModelRoot.eGet(instructionReference2)).add(runObject);
        	} else {
        	    // If the feature is not set, create a new list and set the feature
        	    EList<EObject> runList = new BasicEList<>();
        	    runList.add(runObject);
        	    outputModelRoot.eSet(instructionReference2, runList);
        	}

        	// Create an argument from the 'Run' Instruction
        	// Get the reference to the "argument" feature in "Run" class
        	EReference argumentReference2 = findContainmentReference(runClass, "argument");

        	// Create an instance of "Argument" class for the 'Run' instruction
        	EClass argumentClass2 = (EClass) MMSePackage.getEClassifier("Argument");
        	EObject argumentObject2 = MMSePackage.getEFactoryInstance().create(argumentClass2);

        	// Set the value of the "Argument" object 
        	if(buildSoftware.toString().contentEquals("maven")) {
        	EAttribute valueAttribute2 = (EAttribute) argumentClass2.getEStructuralFeature("value");
        	argumentObject2.eSet(valueAttribute2, "mvn clean install -DskipTests");
        	}
        	else if(buildSoftware.toString().contentEquals("gradle")) {
        		EAttribute valueAttribute2 = (EAttribute) argumentClass2.getEStructuralFeature("value");
            	argumentObject2.eSet(valueAttribute2, "gradle build --no-daemon");
        	}
        	// Add "Argument" object to the "argument" feature in "Run" class
        	((EList<EObject>) runObject.eGet(argumentReference2)).add(argumentObject2);

        	
        	
        	
        	
        	
        	// Create an instance of "CMD" class
        	EClass cmdClass = (EClass) MMSePackage.getEClassifier("Cmd");
        	EObject cmdObject = MMSePackage.getEFactoryInstance().create(cmdClass);

        	// Set the name of "Cmd" object
        	EAttribute nameCmd = (EAttribute) runClass.getEStructuralFeature("name");
        	cmdObject.eSet(nameCmd, "CMD");

        	// Get the reference to the "instruction" feature
        	EReference instructionReference4 = findContainmentReference(outputRootClass, "instruction");

        	// Add "CMD" object to the "instruction" feature
        	if (outputModelRoot.eIsSet(instructionReference4)) {
        	    // If the feature is already set, add to the existing list
        	    ((EList<EObject>) outputModelRoot.eGet(instructionReference4)).add(cmdObject);
        	} else {
        	    // If the feature is not set, create a new list and set the feature
        	    EList<EObject> cmdList = new BasicEList<>();
        	    cmdList.add(cmdObject);
        	    outputModelRoot.eSet(instructionReference4, cmdList);
        	}

        	// Create an argument from the 'Cmd' Instruction
        	// Get the reference to the "argument" feature in "Cmd" class
        	EReference argumentReference4 = findContainmentReference(cmdClass, "argument");

        	// Create an instance of "Argument" class for the 'Cmd' instruction
        	EClass argumentClass4 = (EClass) MMSePackage.getEClassifier("Argument");
        	EObject argumentObject4 = MMSePackage.getEFactoryInstance().create(argumentClass4);

        	// Set the value of the "Argument" object 
        	EAttribute valueAttribute4 = (EAttribute) argumentClass4.getEStructuralFeature("value");
        	argumentObject4.eSet(valueAttribute4, "[\"java\",\"-jar\",\"-Dserver.port=${PORT}\",\"app.jar\"]");

        	// Add "Argument" object to the "argument" feature in "Cmd" class
        	((EList<EObject>) cmdObject.eGet(argumentReference4)).add(argumentObject4);




        	
        	

        	
       	 // Create an instance of "Copy" class
       	EClass copyClass = (EClass) MMSePackage.getEClassifier("Copy");
       	EObject copyObject = MMSePackage.getEFactoryInstance().create(copyClass);

       	// Set the name of "Copy" object
       	EAttribute nameCopy = (EAttribute) copyClass.getEStructuralFeature("name");
       	copyObject.eSet(nameCopy, "COPY");

       	// Get the reference to the "instruction" feature
       	EReference instructionReference3 = findContainmentReference(outputRootClass, "instruction");

       	// Add "Copy" object to the "instruction" feature
       	if (outputModelRoot.eIsSet(instructionReference3)) {
       	    // If the feature is already set, add to the existing list
       	    ((EList<EObject>) outputModelRoot.eGet(instructionReference3)).add(copyObject);
       	} else {
       	    // If the feature is not set, create a new list and set the feature
       	    EList<EObject> copyList = new BasicEList<>();
       	 copyList.add(fromObject);
       	    outputModelRoot.eSet(instructionReference3, copyList);
       	}
       	
       	//Create an argument from the 'Copy' Instruction
       	// Get the reference to the "argument" feature in "Copy" class
       	EReference argumentReference3 = findContainmentReference(copyClass, "argument");

       	// Create an instance of "Argument" class for the 'Copy' instruction
       	EClass argumentClass3 = (EClass) MMSePackage.getEClassifier("Argument");
       	EObject argumentObject3 = MMSePackage.getEFactoryInstance().create(argumentClass3);

       	// Set the value of the "Argument" object 
       
       	if(buildSoftware.toString().contentEquals("maven")) {
       		EAttribute valueAttribute3 = (EAttribute) argumentClass3.getEStructuralFeature("value");
           	argumentObject3.eSet(valueAttribute3, "--from=build /opt/app/target/*.jar app.jar");
       	}
       	
	if(buildSoftware.toString().contentEquals("gradle")) {
		EAttribute valueAttribute3 = (EAttribute) argumentClass3.getEStructuralFeature("value");
       	argumentObject3.eSet(valueAttribute3, "  --from=build /opt/app/build/libs/*.jar app.jar");
       	}
       

       	// Get the existing list of "Argument" objects or create a new one
       	EList<EObject> argumentList3 = (EList<EObject>) copyObject.eGet(argumentReference3);
       	if (argumentList3 == null) {
       		argumentList3 = new BasicEList<>();
       	}

       	// Add "Argument" object to the list
       	argumentList3.add(argumentObject3);

     // Add "Argument" object to the "argument" feature in "Run" class
    	((EList<EObject>) copyObject.eGet(argumentReference3)).add(argumentObject3);
       	
        	 
        	

            
            // Save Output Model:
            Resource outputModelResource = resourceSet.createResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/Docker.model"));
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
            
    	
    
	

