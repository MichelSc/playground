/**
 */
package clientserver3.common.impl;

import clientserver3.common.CommonFactory;
import clientserver3.common.CommonPackage;
import clientserver3.common.EAncestorRef;
import clientserver3.common.EBaseObject;
import clientserver3.common.ECopyAncestor;
import java.lang.reflect.InvocationTargetException;
import clientserver3.common.ECopyScope;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECopy Ancestor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link clientserver3.common.impl.ECopyAncestorImpl#getEDescendant <em>EDescendant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECopyAncestorImpl extends EAncestorRefImpl implements ECopyAncestor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECopyAncestorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ECOPY_ANCESTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBaseObject getEDescendant() {
		return (EBaseObject)eDynamicGet(CommonPackage.ECOPY_ANCESTOR__EDESCENDANT, CommonPackage.Literals.ECOPY_ANCESTOR__EDESCENDANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBaseObject basicGetEDescendant() {
		return (EBaseObject)eDynamicGet(CommonPackage.ECOPY_ANCESTOR__EDESCENDANT, CommonPackage.Literals.ECOPY_ANCESTOR__EDESCENDANT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDescendant(EBaseObject newEDescendant) {
		eDynamicSet(CommonPackage.ECOPY_ANCESTOR__EDESCENDANT, CommonPackage.Literals.ECOPY_ANCESTOR__EDESCENDANT, newEDescendant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EBaseObject ConstructDescendant() {
		ECopyScope copyscope = (ECopyScope)getEScope();
		EBaseObject newdescendant = (EBaseObject) copyscope.getEDescendantFactory().create(getEAncestor().eClass());
		return newdescendant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void AlignAttributes() {
		EBaseObject descendant = getEDescendant();
		EBaseObject ancestor   = getEAncestor();
		for ( EAttribute attribute : descendant.eClass().getEAllAttributes()) {
			descendant.eSet(attribute, ancestor.eGet(attribute));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.ECOPY_ANCESTOR__EDESCENDANT:
				if (resolve) return getEDescendant();
				return basicGetEDescendant();
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
			case CommonPackage.ECOPY_ANCESTOR__EDESCENDANT:
				setEDescendant((EBaseObject)newValue);
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
			case CommonPackage.ECOPY_ANCESTOR__EDESCENDANT:
				setEDescendant((EBaseObject)null);
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
			case CommonPackage.ECOPY_ANCESTOR__EDESCENDANT:
				return basicGetEDescendant() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CommonPackage.ECOPY_ANCESTOR___CONSTRUCT_DESCENDANT:
				return ConstructDescendant();
			case CommonPackage.ECOPY_ANCESTOR___ALIGN_ATTRIBUTES:
				AlignAttributes();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void IAlignDescendants() {
		// construct the descendant
		EBaseObject descendant = getEDescendant();
		EBaseObject ancestor = getEAncestor();
		if ( descendant == null)
		{
			descendant = ConstructDescendant();
			setEDescendant(descendant);
			// own the object
			if ( getEContainer()!=null) {
				ECopyAncestor thiscontainer = (ECopyAncestor)getEContainer(); 
				EBaseObject descendantparent = thiscontainer.getEDescendant();
				EStructuralFeature containingfeature = ancestor.eContainingFeature();
				if ( containingfeature.isMany()) {
					((EList)descendantparent.eGet(containingfeature)).add(descendant);
				} else {
					descendantparent.eSet(containingfeature, descendant);
				}
			}
		}
		// align the content of the descendant
		AlignAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void IDestructDescendants() {
		EBaseObject descendant = getEDescendant();
		if ( descendant != null)  {
			EcoreUtil.delete(descendant, true);
		}
	}

} //ECopyAncestorImpl
