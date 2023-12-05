/**
 */
package org.rm2pt.expt2.university.metamodel.university.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rm2pt.expt2.university.metamodel.university.School;
import org.rm2pt.expt2.university.metamodel.university.Student;
import org.rm2pt.expt2.university.metamodel.university.Teacher;
import org.rm2pt.expt2.university.metamodel.university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.impl.StudentImpl#getStudyIn <em>Study In</em>}</li>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.impl.StudentImpl#getFollow <em>Follow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends PersonImpl implements Student {
	/**
	 * The cached value of the '{@link #getStudyIn() <em>Study In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyIn()
	 * @generated
	 * @ordered
	 */
	protected School studyIn;

	/**
	 * The cached value of the '{@link #getFollow() <em>Follow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollow()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> follow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public School getStudyIn() {
		if (studyIn != null && studyIn.eIsProxy()) {
			InternalEObject oldStudyIn = (InternalEObject) studyIn;
			studyIn = (School) eResolveProxy(oldStudyIn);
			if (studyIn != oldStudyIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityPackage.STUDENT__STUDY_IN,
							oldStudyIn, studyIn));
			}
		}
		return studyIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public School basicGetStudyIn() {
		return studyIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyIn(School newStudyIn) {
		School oldStudyIn = studyIn;
		studyIn = newStudyIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.STUDENT__STUDY_IN, oldStudyIn,
					studyIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Teacher> getFollow() {
		if (follow == null) {
			follow = new EObjectWithInverseResolvingEList.ManyInverse<Teacher>(Teacher.class, this,
					UniversityPackage.STUDENT__FOLLOW, UniversityPackage.TEACHER__TEACH);
		}
		return follow;
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
		case UniversityPackage.STUDENT__FOLLOW:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFollow()).basicAdd(otherEnd, msgs);
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
		case UniversityPackage.STUDENT__FOLLOW:
			return ((InternalEList<?>) getFollow()).basicRemove(otherEnd, msgs);
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
		case UniversityPackage.STUDENT__STUDY_IN:
			if (resolve)
				return getStudyIn();
			return basicGetStudyIn();
		case UniversityPackage.STUDENT__FOLLOW:
			return getFollow();
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
		case UniversityPackage.STUDENT__STUDY_IN:
			setStudyIn((School) newValue);
			return;
		case UniversityPackage.STUDENT__FOLLOW:
			getFollow().clear();
			getFollow().addAll((Collection<? extends Teacher>) newValue);
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
		case UniversityPackage.STUDENT__STUDY_IN:
			setStudyIn((School) null);
			return;
		case UniversityPackage.STUDENT__FOLLOW:
			getFollow().clear();
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
		case UniversityPackage.STUDENT__STUDY_IN:
			return studyIn != null;
		case UniversityPackage.STUDENT__FOLLOW:
			return follow != null && !follow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudentImpl
