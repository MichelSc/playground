/**
 */
package clientserver3.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECopy Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link clientserver3.common.ECopyScope#getEDescendantFactory <em>EDescendant Factory</em>}</li>
 * </ul>
 * </p>
 *
 * @see clientserver3.common.CommonPackage#getECopyScope()
 * @model
 * @generated
 */
public interface ECopyScope extends EAncestorScope {
	/**
	 * Returns the value of the '<em><b>EDescendant Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDescendant Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDescendant Factory</em>' attribute.
	 * @see #setEDescendantFactory(EFactory)
	 * @see clientserver3.common.CommonPackage#getECopyScope_EDescendantFactory()
	 * @model dataType="clientserver3.common.EDescendantFactory"
	 * @generated
	 */
	EFactory getEDescendantFactory();

	/**
	 * Sets the value of the '{@link clientserver3.common.ECopyScope#getEDescendantFactory <em>EDescendant Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDescendant Factory</em>' attribute.
	 * @see #getEDescendantFactory()
	 * @generated
	 */
	void setEDescendantFactory(EFactory value);

} // ECopyScope
