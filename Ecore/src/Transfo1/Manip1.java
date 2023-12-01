package Transfo1;


//import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
      Resource resource = resourceSet.getResource(
              org.eclipse.emf.common.util.URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/InitConfig/InitConfig.ecore"), true);
      EPackage inputMetaModel  = (EPackage) resource.getContents().get(0);
      //charger le metamodele de sortie.
      Resource resource1 = resourceSet.getResource(
              org.eclipse.emf.common.util.URI.createFileURI("C:/Users/zakar/eclipse-workspace/Ecore/model/Jenkins/JenkinsMetamodel.ecore"), true);
      EPackage outputMetaModel  = (EPackage) resource.getContents().get(0);

      
      // Accéder aux éléments du méta-modèle
      for (EClassifier eClassifier : inputMetaModel .getEClassifiers()) {
          if (eClassifier instanceof EClass) {
              EClass eClass = (EClass) eClassifier;
              System.out.println("Classe: " + eClass.getName());

              // Accéder aux attributs de la classe
              for (EAttribute eAttribute : eClass.getEAttributes()) {
                  System.out.println("Attribut: " + eAttribute.getName() + " - Type: " + eAttribute.getEType().getName());
              }
          }
      }
  }
}