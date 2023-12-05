/**
 */
package org.rm2pt.expt2.university.metamodel.university;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.Student#getStudyIn <em>Study In</em>}</li>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.Student#getFollow <em>Follow</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends Person {
	/**
	 * Returns the value of the '<em><b>Study In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study In</em>' reference.
	 * @see #setStudyIn(School)
	 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getStudent_StudyIn()
	 * @model required="true"
	 * @generated
	 */
	School getStudyIn();

	/**
	 * Sets the value of the '{@link org.rm2pt.expt2.university.metamodel.university.Student#getStudyIn <em>Study In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study In</em>' reference.
	 * @see #getStudyIn()
	 * @generated
	 */
	void setStudyIn(School value);

	/**
	 * Returns the value of the '<em><b>Follow</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.expt2.university.metamodel.university.Teacher}.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.expt2.university.metamodel.university.Teacher#getTeach <em>Teach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follow</em>' reference list.
	 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getStudent_Follow()
	 * @see org.rm2pt.expt2.university.metamodel.university.Teacher#getTeach
	 * @model opposite="teach" required="true"
	 * @generated
	 */
	EList<Teacher> getFollow();

} // Student
