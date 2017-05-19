/**
 */
package clientserver3.common;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAncestor Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link clientserver3.common.EAncestorScope#getERefs <em>ERefs</em>}</li>
 *   <li>{@link clientserver3.common.EAncestorScope#getEScope <em>EScope</em>}</li>
 *   <li>{@link clientserver3.common.EAncestorScope#getERootRef <em>ERoot Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see clientserver3.common.CommonPackage#getEAncestorScope()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface EAncestorScope extends CDOObject {
	/**
	 * Returns the value of the '<em><b>ERefs</b></em>' containment reference list.
	 * The list contents are of type {@link clientserver3.common.EAncestorRef}.
	 * It is bidirectional and its opposite is '{@link clientserver3.common.EAncestorRef#getEScope <em>EScope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERefs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERefs</em>' containment reference list.
	 * @see clientserver3.common.CommonPackage#getEAncestorScope_ERefs()
	 * @see clientserver3.common.EAncestorRef#getEScope
	 * @model opposite="EScope" containment="true"
	 * @generated
	 */
	EList<EAncestorRef> getERefs();

	/**
	 * Returns the value of the '<em><b>EScope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EScope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EScope</em>' reference.
	 * @see #setEScope(EBaseObject)
	 * @see clientserver3.common.CommonPackage#getEAncestorScope_EScope()
	 * @model
	 * @generated
	 */
	EBaseObject getEScope();

	/**
	 * Sets the value of the '{@link clientserver3.common.EAncestorScope#getEScope <em>EScope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EScope</em>' reference.
	 * @see #getEScope()
	 * @generated
	 */
	void setEScope(EBaseObject value);

	/**
	 * Returns the value of the '<em><b>ERoot Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERoot Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERoot Ref</em>' reference.
	 * @see #setERootRef(EAncestorRef)
	 * @see clientserver3.common.CommonPackage#getEAncestorScope_ERootRef()
	 * @model required="true"
	 * @generated
	 */
	EAncestorRef getERootRef();

	/**
	 * Sets the value of the '{@link clientserver3.common.EAncestorScope#getERootRef <em>ERoot Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERoot Ref</em>' reference.
	 * @see #getERootRef()
	 * @generated
	 */
	void setERootRef(EAncestorRef value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ESetScope(EBaseObject scope);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void EAlign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EAncestorRef EConstructAncestorRef(EAncestorRef parentancestorref, EBaseObject ancestor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EAncestorRef ECreateAncestorRef();

} // EAncestorScope
