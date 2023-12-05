/**
 */
package org.rm2pt.expt2.university.metamodel.university;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.Teacher#getWorkIn <em>Work In</em>}</li>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.Teacher#getTeach <em>Teach</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getTeacher()
 * @model
 * @generated
 */
public interface Teacher extends Person {
	/**
	 * Returns the value of the '<em><b>Work In</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.expt2.university.metamodel.university.School}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work In</em>' reference list.
	 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getTeacher_WorkIn()
	 * @model
	 * @generated
	 */
	EList<School> getWorkIn();

	/**
	 * Returns the value of the '<em><b>Teach</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.expt2.university.metamodel.university.Student}.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.expt2.university.metamodel.university.Student#getFollow <em>Follow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teach</em>' reference list.
	 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getTeacher_Teach()
	 * @see org.rm2pt.expt2.university.metamodel.university.Student#getFollow
	 * @model opposite="follow"
	 * @generated
	 */
	EList<Student> getTeach();

} // Teacher
