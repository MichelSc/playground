/**
 */
package clientserver3.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECopy Ancestor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link clientserver3.common.ECopyAncestor#getEDescendant <em>EDescendant</em>}</li>
 * </ul>
 * </p>
 *
 * @see clientserver3.common.CommonPackage#getECopyAncestor()
 * @model
 * @generated
 */
public interface ECopyAncestor extends EAncestorRef {
	/**
	 * Returns the value of the '<em><b>EDescendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDescendant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDescendant</em>' reference.
	 * @see #setEDescendant(EBaseObject)
	 * @see clientserver3.common.CommonPackage#getECopyAncestor_EDescendant()
	 * @model
	 * @generated
	 */
	EBaseObject getEDescendant();

	/**
	 * Sets the value of the '{@link clientserver3.common.ECopyAncestor#getEDescendant <em>EDescendant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDescendant</em>' reference.
	 * @see #getEDescendant()
	 * @generated
	 */
	void setEDescendant(EBaseObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EBaseObject ConstructDescendant();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AlignAttributes();

} // ECopyAncestor
