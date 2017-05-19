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
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAncestor Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link clientserver3.common.impl.EAncestorRefImpl#getEAncestor <em>EAncestor</em>}</li>
 *   <li>{@link clientserver3.common.impl.EAncestorRefImpl#getEScope <em>EScope</em>}</li>
 *   <li>{@link clientserver3.common.impl.EAncestorRefImpl#getEContainer <em>EContainer</em>}</li>
 *   <li>{@link clientserver3.common.impl.EAncestorRefImpl#getEElements <em>EElements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EAncestorRefImpl extends CDOObjectImpl implements EAncestorRef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAncestorRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.EANCESTOR_REF;
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
	public EBaseObject getEAncestor() {
		return (EBaseObject)eDynamicGet(CommonPackage.EANCESTOR_REF__EANCESTOR, CommonPackage.Literals.EANCESTOR_REF__EANCESTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBaseObject basicGetEAncestor() {
		return (EBaseObject)eDynamicGet(CommonPackage.EANCESTOR_REF__EANCESTOR, CommonPackage.Literals.EANCESTOR_REF__EANCESTOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAncestor(EBaseObject newEAncestor) {
		eDynamicSet(CommonPackage.EANCESTOR_REF__EANCESTOR, CommonPackage.Literals.EANCESTOR_REF__EANCESTOR, newEAncestor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAncestorScope getEScope() {
		return (EAncestorScope)eDynamicGet(CommonPackage.EANCESTOR_REF__ESCOPE, CommonPackage.Literals.EANCESTOR_REF__ESCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEScope(EAncestorScope newEScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEScope, CommonPackage.EANCESTOR_REF__ESCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEScope(EAncestorScope newEScope) {
		eDynamicSet(CommonPackage.EANCESTOR_REF__ESCOPE, CommonPackage.Literals.EANCESTOR_REF__ESCOPE, newEScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAncestorRef getEContainer() {
		return (EAncestorRef)eDynamicGet(CommonPackage.EANCESTOR_REF__ECONTAINER, CommonPackage.Literals.EANCESTOR_REF__ECONTAINER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAncestorRef basicGetEContainer() {
		return (EAncestorRef)eDynamicGet(CommonPackage.EANCESTOR_REF__ECONTAINER, CommonPackage.Literals.EANCESTOR_REF__ECONTAINER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer(EAncestorRef newEContainer, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEContainer, CommonPackage.EANCESTOR_REF__ECONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer(EAncestorRef newEContainer) {
		eDynamicSet(CommonPackage.EANCESTOR_REF__ECONTAINER, CommonPackage.Literals.EANCESTOR_REF__ECONTAINER, newEContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EAncestorRef> getEElements() {
		return (EList<EAncestorRef>)eDynamicGet(CommonPackage.EANCESTOR_REF__EELEMENTS, CommonPackage.Literals.EANCESTOR_REF__EELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List IGetElements() {
		EList<EAncestorRef> elements = getEElements();
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EBaseObject IGetAncestor() {
		EBaseObject ancestor = getEAncestor();
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List IGetAncestorElements() {
		EList<EObject> elements = getEAncestor().eContents();
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EAncestorRefIntf IConstructAncestorRef(EBaseObject ancestor) {
		EAncestorRef newref = getEScope().EConstructAncestorRef(this, ancestor);
		return newref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void IDestruct() {
		EcoreUtil.delete(this, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void IAlignDescendants() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void IDestructDescendants() {
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
			case CommonPackage.EANCESTOR_REF__ESCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEScope((EAncestorScope)otherEnd, msgs);
			case CommonPackage.EANCESTOR_REF__ECONTAINER:
				EAncestorRef eContainer = basicGetEContainer();
				if (eContainer != null)
					msgs = ((InternalEObject)eContainer).eInverseRemove(this, CommonPackage.EANCESTOR_REF__EELEMENTS, EAncestorRef.class, msgs);
				return basicSetEContainer((EAncestorRef)otherEnd, msgs);
			case CommonPackage.EANCESTOR_REF__EELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEElements()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.EANCESTOR_REF__ESCOPE:
				return basicSetEScope(null, msgs);
			case CommonPackage.EANCESTOR_REF__ECONTAINER:
				return basicSetEContainer(null, msgs);
			case CommonPackage.EANCESTOR_REF__EELEMENTS:
				return ((InternalEList<?>)getEElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CommonPackage.EANCESTOR_REF__ESCOPE:
				return eInternalContainer().eInverseRemove(this, CommonPackage.EANCESTOR_SCOPE__EREFS, EAncestorScope.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.EANCESTOR_REF__EANCESTOR:
				if (resolve) return getEAncestor();
				return basicGetEAncestor();
			case CommonPackage.EANCESTOR_REF__ESCOPE:
				return getEScope();
			case CommonPackage.EANCESTOR_REF__ECONTAINER:
				if (resolve) return getEContainer();
				return basicGetEContainer();
			case CommonPackage.EANCESTOR_REF__EELEMENTS:
				return getEElements();
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
			case CommonPackage.EANCESTOR_REF__EANCESTOR:
				setEAncestor((EBaseObject)newValue);
				return;
			case CommonPackage.EANCESTOR_REF__ESCOPE:
				setEScope((EAncestorScope)newValue);
				return;
			case CommonPackage.EANCESTOR_REF__ECONTAINER:
				setEContainer((EAncestorRef)newValue);
				return;
			case CommonPackage.EANCESTOR_REF__EELEMENTS:
				getEElements().clear();
				getEElements().addAll((Collection<? extends EAncestorRef>)newValue);
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
			case CommonPackage.EANCESTOR_REF__EANCESTOR:
				setEAncestor((EBaseObject)null);
				return;
			case CommonPackage.EANCESTOR_REF__ESCOPE:
				setEScope((EAncestorScope)null);
				return;
			case CommonPackage.EANCESTOR_REF__ECONTAINER:
				setEContainer((EAncestorRef)null);
				return;
			case CommonPackage.EANCESTOR_REF__EELEMENTS:
				getEElements().clear();
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
			case CommonPackage.EANCESTOR_REF__EANCESTOR:
				return basicGetEAncestor() != null;
			case CommonPackage.EANCESTOR_REF__ESCOPE:
				return getEScope() != null;
			case CommonPackage.EANCESTOR_REF__ECONTAINER:
				return basicGetEContainer() != null;
			case CommonPackage.EANCESTOR_REF__EELEMENTS:
				return !getEElements().isEmpty();
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
			case CommonPackage.EANCESTOR_REF___IGET_ELEMENTS:
				return IGetElements();
			case CommonPackage.EANCESTOR_REF___IGET_ANCESTOR:
				return IGetAncestor();
			case CommonPackage.EANCESTOR_REF___IGET_ANCESTOR_ELEMENTS:
				return IGetAncestorElements();
			case CommonPackage.EANCESTOR_REF___ICONSTRUCT_ANCESTOR_REF__EBASEOBJECT:
				return IConstructAncestorRef((EBaseObject)arguments.get(0));
			case CommonPackage.EANCESTOR_REF___IDESTRUCT:
				IDestruct();
				return null;
			case CommonPackage.EANCESTOR_REF___IALIGN_DESCENDANTS:
				IAlignDescendants();
				return null;
			case CommonPackage.EANCESTOR_REF___IDESTRUCT_DESCENDANTS:
				IDestructDescendants();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EAncestorRefImpl
