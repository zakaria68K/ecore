package Transfo1;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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
       // Resource inputModelResource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/InitConfig/InitConfig.model"), true);
        //EObject inputModelRoot = inputModelResource.getContents().get(0);
        String nsUri = ((EPackage) MMracine).getNsURI();
        resourceSet.getPackageRegistry().put(nsUri, MMePackage);
        Resource load_resource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/InitConfig/InitConfig.model"), true);
        Resource MResource = load_resource;
        EObject MRacine = MResource.getContents().get(0);

        // Create an instance of the root class from the output metamodel
        EClass outputRootClass = (EClass) MMSePackage.getEClassifier("config");
        EObject outputModelRoot = MMSePackage.getEFactoryInstance().create(outputRootClass);

        // Transformation rules

        // Projet.name to Config.name
        EAttribute inputProjetNameAttribute = (EAttribute) ((EClass) MMePackage.getEClassifier("Projet"))
                .getEStructuralFeature("name");
        EAttribute outputConfigNameAttribute = (EAttribute) ((EClass) MMSePackage.getEClassifier("config"))
                .getEStructuralFeature("name");
        outputModelRoot.eSet(outputConfigNameAttribute, MRacine.eGet(inputProjetNameAttribute));
       
        

        // Projet.branch to Cloning.branch
        EAttribute inputProjetBranchAttribute = (EAttribute) ((EClass) MMePackage.getEClassifier("Projet"))
                .getEStructuralFeature("branch");
        EAttribute outputCloningBranchAttribute = (EAttribute) ((EClass) MMSePackage.getEClassifier("Cloning"))
                .getEStructuralFeature("branch");
        outputModelRoot.eSet(outputCloningBranchAttribute, MRacine.eGet(inputProjetBranchAttribute));

        // Projet.url to Cloning.url
        EAttribute inputProjetUrlAttribute = (EAttribute) ((EClass) MMePackage.getEClassifier("Projet"))
                .getEStructuralFeature("url");
        EAttribute outputCloningUrlAttribute = (EAttribute) ((EClass) MMSePackage.getEClassifier("Cloning"))
                .getEStructuralFeature("url");
        outputModelRoot.eSet(outputCloningUrlAttribute,
        		MRacine.eGet(inputProjetUrlAttribute) + "git");

        // Testing.cmdtest to Tests.shell
        EAttribute inputTestingCmdTestAttribute = (EAttribute) ((EClass) MMePackage.getEClassifier("Testing"))
                .getEStructuralFeature("cmdtest");
        EAttribute outputTestsShellAttribute = (EAttribute) ((EClass) MMSePackage.getEClassifier("Tests"))
                .getEStructuralFeature("shell");
        outputModelRoot.eSet(outputTestsShellAttribute, MRacine.eGet(inputTestingCmdTestAttribute));

        // Default values

        // Default value for Cloning.credentialID
        EAttribute outputCloningCredentialIdAttribute = (EAttribute) ((EClass) MMSePackage.getEClassifier("Cloning"))
                .getEStructuralFeature("credentialID");
        outputModelRoot.eSet(outputCloningCredentialIdAttribute, "personal-cloning-key");

        // Default value for Build.cmd
        EAttribute outputBuildCmdAttribute = (EAttribute) ((EClass) MMSePackage.getEClassifier("Build"))
                .getEStructuralFeature("cmd");
        outputModelRoot.eSet(outputBuildCmdAttribute, "sh \"docker build -t ${dockerImageTag} .\"");

        // Default value for Deploy.cmd
        EAttribute outputDeployCmdAttribute = (EAttribute) ((EClass) MMSePackage.getEClassifier("Deploy"))
                .getEStructuralFeature("cmd");
        outputModelRoot.eSet(outputDeployCmdAttribute, "sh \"docker push ${dockerImageTag}\"");

        // Save Output Model:
        Resource outputModelResource = resourceSet.createResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/Output.model"));
        outputModelResource.getContents().add(outputModelRoot);
        try {
            outputModelResource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
