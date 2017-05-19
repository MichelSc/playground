/**
 */
package clientserver3.common;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.EList;

import java.util.HashSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAncestor Ref Intf</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see clientserver3.common.CommonPackage#getEAncestorRefIntf()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface EAncestorRefIntf extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="clientserver3.common.ECollectionBaseObject" many="false"
	 * @generated
	 */
	List IGetElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EBaseObject IGetAncestor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="clientserver3.common.ECollectionBaseObject" many="false"
	 * @generated
	 */
	List IGetAncestorElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EAncestorRefIntf IConstructAncestorRef(EBaseObject ancestor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void IDestruct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void IAlignDescendants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void IDestructDescendants();


	public class Util
	{
		/**
		 * <!-- begin-user-doc -->
		 * Refresh thisancestorref level of the hierarchy
		 * <!-- end-user-doc -->
		 */
		public static void Align(EAncestorRefIntf thisancestorref) {
			// destruction
			EBaseObject currentancestor = thisancestorref.IGetAncestor();
			if ( currentancestor==null ){
				// the ancestor has been deleted
				thisancestorref.IDestructDescendants();
				thisancestorref.IDestruct();
			}
			else {
				// align the objects itself
				thisancestorref.IAlignDescendants();
				// align the elements object
				List elementstobe = thisancestorref.IGetAncestorElements();
				HashSet<EBaseObject> setelementstobe = new HashSet(elementstobe);
				List<EAncestorRefIntf> elementsasis = new LinkedList<EAncestorRefIntf>(thisancestorref.IGetElements());
				while ( !elementsasis.isEmpty())	{
	  				 EAncestorRefIntf ancestorref = elementsasis.remove(0);
	  				 EBaseObject currentelementancestor = ancestorref.IGetAncestor();
					 if ( setelementstobe.contains(currentelementancestor)) {
						 setelementstobe.remove(currentelementancestor);
					 }
					 else {
						 // the element is no longer an element to be ancestored
						 ancestorref.IDestructDescendants();
						 ancestorref.IDestruct();
					 }
				} // traverse the elements as is
				// traverse the elements to be created
				for (EBaseObject elementtobe : setelementstobe){
					EAncestorRefIntf newref = thisancestorref.IConstructAncestorRef(elementtobe);
				}
				// align the elements, recursive
				for (EAncestorRefIntf anancestorref : (EList<EAncestorRefIntf>) thisancestorref.IGetElements()){
					EAncestorRefIntf.Util.Align(anancestorref);
				}  // traverse the elements ancestored
			}  // there is an ancestor
		} // method Align
	}  // class Util
} // interface EAncestorRefIntf

