/**
 */
package clientserver3.common.impl;

import clientserver3.common.CommonFactory;
import clientserver3.common.CommonPackage;
import clientserver3.common.EAncestorRef;
import clientserver3.common.EBaseObject;
import clientserver3.common.ECopyScope;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECopy Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link clientserver3.common.impl.ECopyScopeImpl#getEDescendantFactory <em>EDescendant Factory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECopyScopeImpl extends EAncestorScopeImpl implements ECopyScope {
	/**
	 * The default value of the '{@link #getEDescendantFactory() <em>EDescendant Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDescendantFactory()
	 * @generated
	 * @ordered
	 */
	protected static final EFactory EDESCENDANT_FACTORY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECopyScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ECOPY_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory getEDescendantFactory() {
		return (EFactory)eDynamicGet(CommonPackage.ECOPY_SCOPE__EDESCENDANT_FACTORY, CommonPackage.Literals.ECOPY_SCOPE__EDESCENDANT_FACTORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDescendantFactory(EFactory newEDescendantFactory) {
		eDynamicSet(CommonPackage.ECOPY_SCOPE__EDESCENDANT_FACTORY, CommonPackage.Literals.ECOPY_SCOPE__EDESCENDANT_FACTORY, newEDescendantFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.ECOPY_SCOPE__EDESCENDANT_FACTORY:
				return getEDescendantFactory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.ECOPY_SCOPE__EDESCENDANT_FACTORY:
				setEDescendantFactory((EFactory)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommonPackage.ECOPY_SCOPE__EDESCENDANT_FACTORY:
				setEDescendantFactory(EDESCENDANT_FACTORY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommonPackage.ECOPY_SCOPE__EDESCENDANT_FACTORY:
				return EDESCENDANT_FACTORY_EDEFAULT == null ? getEDescendantFactory() != null : !EDESCENDANT_FACTORY_EDEFAULT.equals(getEDescendantFactory());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EAncestorRef ECreateAncestorRef() {
		EAncestorRef newref = CommonFactory.eINSTANCE.createECopyAncestor();
		return newref;
	}

} //ECopyScopeImpl
