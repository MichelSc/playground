/**
 */
package clientserver3.common;

import java.util.List;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAncestor Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link clientserver3.common.EAncestorRef#getEAncestor <em>EAncestor</em>}</li>
 *   <li>{@link clientserver3.common.EAncestorRef#getEScope <em>EScope</em>}</li>
 *   <li>{@link clientserver3.common.EAncestorRef#getEContainer <em>EContainer</em>}</li>
 *   <li>{@link clientserver3.common.EAncestorRef#getEElements <em>EElements</em>}</li>
 * </ul>
 * </p>
 *
 * @see clientserver3.common.CommonPackage#getEAncestorRef()
 * @model
 * @generated
 */
public interface EAncestorRef extends EAncestorRefIntf {
	/**
	 * Returns the value of the '<em><b>EAncestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAncestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAncestor</em>' reference.
	 * @see #setEAncestor(EBaseObject)
	 * @see clientserver3.common.CommonPackage#getEAncestorRef_EAncestor()
	 * @model
	 * @generated
	 */
	EBaseObject getEAncestor();

	/**
	 * Sets the value of the '{@link clientserver3.common.EAncestorRef#getEAncestor <em>EAncestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAncestor</em>' reference.
	 * @see #getEAncestor()
	 * @generated
	 */
	void setEAncestor(EBaseObject value);

	/**
	 * Returns the value of the '<em><b>EScope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link clientserver3.common.EAncestorScope#getERefs <em>ERefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EScope</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EScope</em>' container reference.
	 * @see #setEScope(EAncestorScope)
	 * @see clientserver3.common.CommonPackage#getEAncestorRef_EScope()
	 * @see clientserver3.common.EAncestorScope#getERefs
	 * @model opposite="ERefs" required="true" transient="false"
	 * @generated
	 */
	EAncestorScope getEScope();

	/**
	 * Sets the value of the '{@link clientserver3.common.EAncestorRef#getEScope <em>EScope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EScope</em>' container reference.
	 * @see #getEScope()
	 * @generated
	 */
	void setEScope(EAncestorScope value);

	/**
	 * Returns the value of the '<em><b>EContainer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link clientserver3.common.EAncestorRef#getEElements <em>EElements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer</em>' reference.
	 * @see #setEContainer(EAncestorRef)
	 * @see clientserver3.common.CommonPackage#getEAncestorRef_EContainer()
	 * @see clientserver3.common.EAncestorRef#getEElements
	 * @model opposite="EElements"
	 * @generated
	 */
	EAncestorRef getEContainer();

	/**
	 * Sets the value of the '{@link clientserver3.common.EAncestorRef#getEContainer <em>EContainer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer</em>' reference.
	 * @see #getEContainer()
	 * @generated
	 */
	void setEContainer(EAncestorRef value);

	/**
	 * Returns the value of the '<em><b>EElements</b></em>' reference list.
	 * The list contents are of type {@link clientserver3.common.EAncestorRef}.
	 * It is bidirectional and its opposite is '{@link clientserver3.common.EAncestorRef#getEContainer <em>EContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EElements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EElements</em>' reference list.
	 * @see clientserver3.common.CommonPackage#getEAncestorRef_EElements()
	 * @see clientserver3.common.EAncestorRef#getEContainer
	 * @model opposite="EContainer"
	 * @generated
	 */
	EList<EAncestorRef> getEElements();

} // EAncestorRef
