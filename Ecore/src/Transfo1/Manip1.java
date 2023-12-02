package Transfo1;


import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class  Manip1{
  
	public static void main(String[] args) {
      // Enregistrez la factory de ressource XMI pour les fichiers Ecore
      

      // Créer un ensemble de ressources EMF
      ResourceSet resourceSet = new ResourceSetImpl();
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

      // Charger le méta-modèle depuis le fichier Ecore

      Resource MMResource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/InitConfig/InitConfig.ecore"), true);
      EObject MMracine = MMResource.getContents().get(0);
      EPackage MMePackage = (EPackage) MMracine;
 

      //chargement du model
      
      String nsUri = ((EPackage) MMracine).getNsURI();
      resourceSet.getPackageRegistry().put(nsUri, MMePackage);
      Resource load_resource = resourceSet.getResource(URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/InitConfig/InitConfig.model"), true);
      Resource MResource = load_resource;
      EObject MRacine = MResource.getContents().get(0);
      // Print "Hello, World!"
      System.out.println("Hello, World!");
      
      
 

  }
//	 public String getnsURI(EObject eObject) {
//	    return eObject.getNsURI();
//	}
}