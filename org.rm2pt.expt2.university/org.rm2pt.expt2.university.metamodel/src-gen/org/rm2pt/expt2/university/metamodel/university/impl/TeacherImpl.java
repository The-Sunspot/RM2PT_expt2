/**
 */
package org.rm2pt.expt2.university.metamodel.university.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rm2pt.expt2.university.metamodel.university.School;
import org.rm2pt.expt2.university.metamodel.university.Student;
import org.rm2pt.expt2.university.metamodel.university.Teacher;
import org.rm2pt.expt2.university.metamodel.university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.impl.TeacherImpl#getWorkIn <em>Work In</em>}</li>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.impl.TeacherImpl#getTeach <em>Teach</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeacherImpl extends PersonImpl implements Teacher {
	/**
	 * The cached value of the '{@link #getWorkIn() <em>Work In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkIn()
	 * @generated
	 * @ordered
	 */
	protected EList<School> workIn;

	/**
	 * The cached value of the '{@link #getTeach() <em>Teach</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeach()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> teach;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeacherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.TEACHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<School> getWorkIn() {
		if (workIn == null) {
			workIn = new EObjectResolvingEList<School>(School.class, this, UniversityPackage.TEACHER__WORK_IN);
		}
		return workIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getTeach() {
		if (teach == null) {
			teach = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this,
					UniversityPackage.TEACHER__TEACH, UniversityPackage.STUDENT__FOLLOW);
		}
		return teach;
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
		case UniversityPackage.TEACHER__TEACH:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTeach()).basicAdd(otherEnd, msgs);
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
		case UniversityPackage.TEACHER__TEACH:
			return ((InternalEList<?>) getTeach()).basicRemove(otherEnd, msgs);
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
		case UniversityPackage.TEACHER__WORK_IN:
			return getWorkIn();
		case UniversityPackage.TEACHER__TEACH:
			return getTeach();
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
		case UniversityPackage.TEACHER__WORK_IN:
			getWorkIn().clear();
			getWorkIn().addAll((Collection<? extends School>) newValue);
			return;
		case UniversityPackage.TEACHER__TEACH:
			getTeach().clear();
			getTeach().addAll((Collection<? extends Student>) newValue);
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
		case UniversityPackage.TEACHER__WORK_IN:
			getWorkIn().clear();
			return;
		case UniversityPackage.TEACHER__TEACH:
			getTeach().clear();
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
		case UniversityPackage.TEACHER__WORK_IN:
			return workIn != null && !workIn.isEmpty();
		case UniversityPackage.TEACHER__TEACH:
			return teach != null && !teach.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TeacherImpl
