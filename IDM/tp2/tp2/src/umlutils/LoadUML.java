package umlutils;


import java.util.ArrayList;
import java.util.Vector;

import org.eclipse.emf.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import org.eclipse.uml2.uml.Model;
//import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.impl.StateMachineImpl;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.*;

public class LoadUML {
	private static UMLFactory factory=UMLFactory.eINSTANCE;
	public static void main(String[] args) {

			
		
		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "Model"
		Model umlP = chargerModele("model/model.uml");
		
		
		String nomModele=  umlP.getName();
		
		System.out.println("Ton modèle se nomme: \""+nomModele+"\"");
		

		moveClassToPackage(findClassInPackage("Class1",findPackageInPackage("truc",umlP)),findPackageInPackage("pouet", umlP));
		
		//Modifier le nom du modèle UML
		umlP.setName("NewModelName");
		System.out.println("\""+nomModele+"\" Changé ! Le modèle se nomme: \""+umlP.getName()+"\"");
		
		
		//Sauvegarder le modèle avec son nouveau nom
		sauverModele("model/changerNom.uml", umlP);
		
		
		
		
		//2nd part
		Vector<StateMachine> sms=getStateMachineFromClass(findClassInPackage("aClass",findPackageInPackage("pouet",umlP)));
		for(StateMachine sm: sms){
			System.out.println("Does that StateMachine has only one region?");
			System.out.println(stateMachineHasOnlyOneRegion(sm));
			
			System.out.println("And contains :");
			System.out.println(getStatesFromStateMachine(sm));
			
			System.out.println("which are triggered by methods:");
			System.out.println(getTriggerOperationFromStateMachine(sm));
		}
	}
	
	
	static public void getThatMethodBackUp(Class origin,Class sup,Operation target){
		/*if(!origin.isSub(sup){fail}*/
		/*if(target isn't in origin){fail}*/
		/*if(sup.target()==origin.target(){fail}*/
		
		
		if( !origin.allParents().contains(sup) &&
			!origin.getOperations().contains(target) &&
			sup.getOperations().contains(target)){
			return;
		}
		else{
			sup.getOwnedOperations().add((target));
			/*origin.getOwnedOperations().remove(target);*/
		}
	}
	
	
	//Non testée
	static public void PublicToPrivateAttribute(Property p){
		Class owner=(Class)p.getOwner();
		if(owner!=null && p.getVisibility()==VisibilityKind.PUBLIC_LITERAL){
			p.setVisibility(VisibilityKind.PRIVATE_LITERAL);
			
            Operation set = factory.createOperation();
            set.setName("set"+p.getName());
            set.setType(p.getType());
            Parameter pr=factory.createParameter();
            pr.setType(p.getType());
            pr.setLower(p.getLower());
            pr.setUpper(p.getUpper());
            pr.setDirection(ParameterDirectionKind.IN_LITERAL);
            set.getOwnedParameters().add(pr);
            
            Operation get = factory.createOperation();
            get.setName("get"+p.getName());
            get.setType(p.getType());
            pr=factory.createParameter();
            pr.setType(p.getType());
            pr.setLower(p.getLower());
            pr.setUpper(p.getUpper());
            pr.setDirection(ParameterDirectionKind.RETURN_LITERAL);
            
            owner.getOwnedOperations().add(set);
            owner.getOwnedOperations().add(get);
        }
	}
	
	static public Class findClassInPackage(String name, Package p){
		Class c=null;
		for (PackageableElement pe : p.getPackagedElements()){
			if(pe instanceof Class){
				Class t=(Class) pe;
				if(t.getName().compareTo(name)==0){
					return t;
				}
			}else{
				if (pe instanceof Package){
					Package t=(Package) pe;
					c=findClassInPackage(name, t);
					if(c!=null){
						return c;
					}
				}
			}
		}
		return c;
	}
	
	static public Package findPackageInPackage(String name, Package p){
		Package c=null;
		for (PackageableElement pe : p.getPackagedElements()){
			if(pe instanceof Package){
				Package t=(Package) pe;
				if(t.getName().compareTo(name)==0){
					return t;
				}
				else{
					t=findPackageInPackage(name, t);
					if(t!=null){
						return c;
					}
				}
			}

		}
		return c;
	}
	
	public static void moveClassToPackage(Class c,Package target){
		target.getPackagedElements().add(c);//
	}
	
	public static void sauverModele(String uri, EObject root) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      resource.getContents().add(root);
		      resource.save(null);
		   } catch (Exception e) {
		      System.err.println("ERREUR sauvegarde du modèle : "+e);
		      e.printStackTrace();
		   }
		}

		public static Model chargerModele(String uri) {
		   Resource resource = null;
		   EPackage pack=UMLPackage.eINSTANCE;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		   }
		   catch(Exception e) {
		      System.err.println("ERREUR chargement du modèle : "+e);
		      e.printStackTrace();
		   }
		   return (Model) resource.getContents().get(0);
		}
		
		//2
		public static Vector<StateMachine> getStateMachineFromClass(Class c){
	        Vector<StateMachine> statesMachines = new Vector<StateMachine>();
			if(c==null){
				System.out.println("class doesn't exists");
				return null;
			}
			for(Behavior b : c.getOwnedBehaviors()){
				if (b instanceof StateMachineImpl) {
					statesMachines.add((StateMachine) b);
	            }
			}
	        return statesMachines;
		}
		
		public static boolean stateMachineHasOnlyOneRegion(StateMachine stama){ 
			boolean res = false;
			if(stama.getRegions().size()==1){
				res=true;
			} 
			return res; 
		}

		public static ArrayList<State> getStatesFromStateMachine(StateMachine stama){
			ArrayList<State> arState= new ArrayList<State>();
			if(stateMachineHasOnlyOneRegion(stama)){	
				Region r=stama.getRegions().get(0);

				for(Vertex ver: r.getSubvertices()){
					if(ver instanceof State){
						arState.add((State) ver);
					}
				}
			}
			return arState;
		}

		public static ArrayList<Operation> getTriggerOperationFromStateMachine(StateMachine stama){
            ArrayList<Operation> arOP = new ArrayList<Operation>();
            if(stateMachineHasOnlyOneRegion(stama)){
                Region r=stama.getRegions().get(0);
                for(Transition transition : r.getTransitions()){
                    for(Trigger trigger: transition.getTriggers()){                
                        Event e = trigger.getEvent();
                        if(e instanceof CallEvent){
                            arOP.add(((CallEvent) e).getOperation());        
                        }
                    }
                }
            }
            return arOP;
        }
		
		//q6
		public static Class factoryClass(String name,ArrayList<Operation> op,EList<NamedElement> supers){
			Class c=UMLFactory.eINSTANCE.createClass();
			c.setName(name);
			c.inherit(supers);
			EList<Operation> cop=c.getOwnedOperations();
			for(Operation o: op){
				op.add(o);
			}
			c.setIsAbstract(false);
			
			return c;
		}
		
}

