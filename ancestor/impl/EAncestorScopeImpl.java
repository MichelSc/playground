/**
 */
package clientserver3.common.impl;

import clientserver3.common.CommonFactory;
import clientserver3.common.CommonPackage;
import clientserver3.common.EAncestorRef;
import clientserver3.common.EAncestorRefIntf;
import clientserver3.common.EAncestorScope;
import clientserver3.common.EBaseObject;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.EFactory;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAncestor Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link clientserver3.common.impl.EAncestorScopeImpl#getERefs <em>ERefs</em>}</li>
 *   <li>{@link clientserver3.common.impl.EAncestorScopeImpl#getEScope <em>EScope</em>}</li>
 *   <li>{@link clientserver3.common.impl.EAncestorScopeImpl#getERootRef <em>ERoot Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EAncestorScopeImpl extends CDOObjectImpl implements EAncestorScope {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAncestorScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.EANCESTOR_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EAncestorRef> getERefs() {
		return (EList<EAncestorRef>)eDynamicGet(CommonPackage.EANCESTOR_SCOPE__EREFS, CommonPackage.Literals.EANCESTOR_SCOPE__EREFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBaseObject getEScope() {
		return (EBaseObject)eDynamicGet(CommonPackage.EANCESTOR_SCOPE__ESCOPE, CommonPackage.Literals.EANCESTOR_SCOPE__ESCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBaseObject basicGetEScope() {
		return (EBaseObject)eDynamicGet(CommonPackage.EANCESTOR_SCOPE__ESCOPE, CommonPackage.Literals.EANCESTOR_SCOPE__ESCOPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEScope(EBaseObject newEScope) {
		eDynamicSet(CommonPackage.EANCESTOR_SCOPE__ESCOPE, CommonPackage.Literals.EANCESTOR_SCOPE__ESCOPE, newEScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAncestorRef getERootRef() {
		return (EAncestorRef)eDynamicGet(CommonPackage.EANCESTOR_SCOPE__EROOT_REF, CommonPackage.Literals.EANCESTOR_SCOPE__EROOT_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAncestorRef basicGetERootRef() {
		return (EAncestorRef)eDynamicGet(CommonPackage.EANCESTOR_SCOPE__EROOT_REF, CommonPackage.Literals.EANCESTOR_SCOPE__EROOT_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERootRef(EAncestorRef newERootRef) {
		eDynamicSet(CommonPackage.EANCESTOR_SCOPE__EROOT_REF, CommonPackage.Literals.EANCESTOR_SCOPE__EROOT_REF, newERootRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void ESetScope(EBaseObject scope) {
		if ( scope != null)
		{
			setEScope(scope);
			EAncestorRef newref = EConstructAncestorRef(null, scope);
			newref.setEScope(this);
			setERootRef(newref);
			EAlign();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void EAlign() {
		EAncestorRef root = getERootRef();
		if ( root != null) {
			EAncestorRefIntf.Util.Align(root);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EAncestorRef EConstructAncestorRef(EAncestorRef parentancestorref, EBaseObject ancestor) {
		EAncestorRef newref = ECreateAncestorRef();
		getERefs().add(newref);
		newref.setEContainer(parentancestorref);
		newref.setEAncestor(ancestor);
		return newref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EAncestorRef ECreateAncestorRef() {
		EAncestorRef newref = CommonFactory.eINSTANCE.createEAncestorRef();
		return newref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.EANCESTOR_SCOPE__EREFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERefs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.EANCESTOR_SCOPE__EREFS:
				return ((InternalEList<?>)getERefs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.EANCESTOR_SCOPE__EREFS:
				return getERefs();
			case CommonPackage.EANCESTOR_SCOPE__ESCOPE:
				if (resolve) return getEScope();
				return basicGetEScope();
			case CommonPackage.EANCESTOR_SCOPE__EROOT_REF:
				if (resolve) return getERootRef();
				return basicGetERootRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.EANCESTOR_SCOPE__EREFS:
				getERefs().clear();
				getERefs().addAll((Collection<? extends EAncestorRef>)newValue);
				return;
			case CommonPackage.EANCESTOR_SCOPE__ESCOPE:
				setEScope((EBaseObject)newValue);
				return;
			case CommonPackage.EANCESTOR_SCOPE__EROOT_REF:
				setERootRef((EAncestorRef)newValue);
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
			case CommonPackage.EANCESTOR_SCOPE__EREFS:
				getERefs().clear();
				return;
			case CommonPackage.EANCESTOR_SCOPE__ESCOPE:
				setEScope((EBaseObject)null);
				return;
			case CommonPackage.EANCESTOR_SCOPE__EROOT_REF:
				setERootRef((EAncestorRef)null);
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
			case CommonPackage.EANCESTOR_SCOPE__EREFS:
				return !getERefs().isEmpty();
			case CommonPackage.EANCESTOR_SCOPE__ESCOPE:
				return basicGetEScope() != null;
			case CommonPackage.EANCESTOR_SCOPE__EROOT_REF:
				return basicGetERootRef() != null;
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
			case CommonPackage.EANCESTOR_SCOPE___ESET_SCOPE__EBASEOBJECT:
				ESetScope((EBaseObject)arguments.get(0));
				return null;
			case CommonPackage.EANCESTOR_SCOPE___EALIGN:
				EAlign();
				return null;
			case CommonPackage.EANCESTOR_SCOPE___ECONSTRUCT_ANCESTOR_REF__EANCESTORREF_EBASEOBJECT:
				return EConstructAncestorRef((EAncestorRef)arguments.get(0), (EBaseObject)arguments.get(1));
			case CommonPackage.EANCESTOR_SCOPE___ECREATE_ANCESTOR_REF:
				return ECreateAncestorRef();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EAncestorScopeImpl
