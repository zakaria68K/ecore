package Transfo1;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;


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
       

        // Transformation rules
        
        // Projet.name to Config.name
        setFeatureValue(outputModelRoot, MMSePackage, "config", "name", MRacine, MMePackage, "Projet", "name");

    
     // Projet.branch to Cloning.branch
        EClass cloningClass = (EClass) MMSePackage.getEClassifier("Cloning");
        EObject cloningObject = MMSePackage.getEFactoryInstance().create(cloningClass);
        EAttribute branchFeature = (EAttribute) cloningClass.getEStructuralFeature("branch");
        cloningObject.eSet(branchFeature, MRacine.eGet(((EClass) MMePackage.getEClassifier("Projet")).getEStructuralFeature("branch")));
        ((EList<EObject>) outputModelRoot.eGet(((EClass) MMSePackage.getEClassifier("config")).getEStructuralFeature("stages"))).add(cloningObject);

     // Projet.url to Cloning.url
        EClass cloningClassUrl = (EClass) MMSePackage.getEClassifier("Cloning");
        EObject cloningObjectUrl = MMSePackage.getEFactoryInstance().create(cloningClassUrl);
        EAttribute urlFeature = (EAttribute) cloningClassUrl.getEStructuralFeature("url");
        cloningObjectUrl.eSet(urlFeature, MRacine.eGet(((EClass) MMePackage.getEClassifier("Projet")).getEStructuralFeature("url")));
        ((EList<EObject>) outputModelRoot.eGet(((EClass) MMSePackage.getEClassifier("config")).getEStructuralFeature("stages"))).add(cloningObjectUrl);

        // Testing.cmdtest to Tests.shell



        // Default values

        // Default value for Cloning.credentialID
        EClass cloningClassCredential = (EClass) MMSePackage.getEClassifier("Cloning");
        EObject cloningObjectCredential = MMSePackage.getEFactoryInstance().create(cloningClassCredential);
        EAttribute credentialIDFeature = (EAttribute) cloningClassCredential.getEStructuralFeature("credentialID");
        cloningObjectCredential.eSet(credentialIDFeature, "personal-cloning-key");
        ((EList<EObject>) outputModelRoot.eGet(((EClass) MMSePackage.getEClassifier("config")).getEStructuralFeature("stages"))).add(cloningObjectCredential);

        // Default value for Build.cmd
        EClass buildClassCmd = (EClass) MMSePackage.getEClassifier("Build");
        EObject buildObjectCmd = MMSePackage.getEFactoryInstance().create(buildClassCmd);
        EAttribute cmdFeature = (EAttribute) buildClassCmd.getEStructuralFeature("cmd");
        buildObjectCmd.eSet(cmdFeature, "sh \"docker build -t ${dockerImageTag} .\"");
        ((EList<EObject>) outputModelRoot.eGet(((EClass) MMSePackage.getEClassifier("config")).getEStructuralFeature("stages"))).add(buildObjectCmd);

        // Default value for Deploy.cmd
        EClass deployClassCmd = (EClass) MMSePackage.getEClassifier("Deploy");
        EObject deployObjectCmd = MMSePackage.getEFactoryInstance().create(deployClassCmd);
        EAttribute cmdDeployFeature = (EAttribute) deployClassCmd.getEStructuralFeature("cmd");
        deployObjectCmd.eSet(cmdDeployFeature, "sh \"docker push ${dockerImageTag}\"");
        ((EList<EObject>) outputModelRoot.eGet(((EClass) MMSePackage.getEClassifier("config")).getEStructuralFeature("stages"))).add(deployObjectCmd);


        // Save Output Model:
        Resource outputModelResource = resourceSet.createResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/Output.model"));
        outputModelResource.getContents().add(outputModelRoot);
        try {
            outputModelResource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printEObject(outputModelRoot,0);
    }

    private static void setFeatureValue(EObject targetObject, EPackage targetPackage, String targetClassName, String targetFeatureName,
            EObject sourceObject, EPackage sourcePackage, String sourceClassName, String sourceFeatureName) {
        EClass targetClass = (EClass) targetPackage.getEClassifier(targetClassName);
        EStructuralFeature targetFeature = targetClass.getEStructuralFeature(targetFeatureName);

        EClass sourceClass = (EClass) sourcePackage.getEClassifier(sourceClassName);
        EStructuralFeature sourceFeature = sourceClass.getEStructuralFeature(sourceFeatureName);

        if (targetFeature.isChangeable()) {
            // Check if sourceFeature is an attribute
            if (sourceFeature instanceof EAttribute) {
                targetObject.eSet(targetFeature, sourceObject.eGet(sourceFeature));
            } else {
                // If sourceFeature is a reference, copy its value to the target feature
                EObject referencedObject = (EObject) sourceObject.eGet(sourceFeature);
                if (referencedObject != null) {
                    targetObject.eSet(targetFeature, referencedObject);
                }
            }
        } else {
            System.err.println("Cannot set the value for non-changeable feature: " + targetFeatureName);
        }
    }


    private static void setFeatureValue(EObject targetObject, EPackage targetPackage, String targetClassName, String targetFeatureName, Object value) {
        EClass targetClass = (EClass) targetPackage.getEClassifier(targetClassName);
        EAttribute targetFeature = (EAttribute) targetClass.getEStructuralFeature(targetFeatureName);

        targetObject.eSet(targetFeature, value);
    }

     //printEObject(outputModelRoot, 0);
    

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
