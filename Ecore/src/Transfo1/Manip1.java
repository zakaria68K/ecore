package Transfo1;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Manip1 {

    public static void main(String[] args) {
        // Register the XMI resource factory for the EMF resource set
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

        // Create an EMF resource set
        ResourceSet resourceSet = new ResourceSetImpl();

        // Load the input metamodel (InitConfig.ecore)
        Resource MMResource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/InitConfig/InitConfig.ecore"), true);
        EObject MMracine = MMResource.getContents().get(0);
        EPackage MMePackage = (EPackage) MMracine;

        // Load the output metamodel (JenkinsMetamodel.ecore)
        Resource MMSResource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/Jenkins/JenkinsMetamodel.ecore"), true);
        EObject MMSracine = MMSResource.getContents().get(0);
        EPackage MMSePackage = (EPackage) MMSracine;

        // Load the input model (InitConfig.model)
        String nsUri = MMePackage.getNsURI();
        resourceSet.getPackageRegistry().put(nsUri, MMePackage);
        Resource load_resource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/InitConfig/InitConfig.model"), true);
        Resource MResource = load_resource;
        EObject MRacine = MResource.getContents().get(0);

        // Create an instance of the root class from the output metamodele
        EClass outputRootClass = (EClass) MMSePackage.getEClassifier("config");
        EObject outputModelRoot = MMSePackage.getEFactoryInstance().create(outputRootClass);
       

        printEObject(outputModelRoot,0);
    }

    private static void setFeatureValue(EObject targetObject, EPackage targetPackage, String targetClassName, String targetFeatureName,
            EObject sourceObject, EPackage sourcePackage, String sourceClassName, String sourceFeatureName) {
        EClass targetClass = (EClass) targetPackage.getEClassifier(targetClassName);
        EAttribute targetFeature = (EAttribute) targetClass.getEStructuralFeature(targetFeatureName);

        EClass sourceClass = (EClass) sourcePackage.getEClassifier(sourceClassName);
        EAttribute sourceFeature = (EAttribute) sourceClass.getEStructuralFeature(sourceFeatureName);

        targetObject.eSet(targetFeature, sourceObject.eGet(sourceFeature));
    }

    private static void setFeatureValue(EObject targetObject, EPackage targetPackage, String targetClassName, String targetFeatureName, Object value) {
        EClass targetClass = (EClass) targetPackage.getEClassifier(targetClassName);
        EAttribute targetFeature = (EAttribute) targetClass.getEStructuralFeature(targetFeatureName);

        targetObject.eSet(targetFeature, value);
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

    
}
