/**
 */
package org.rm2pt.expt2.university.metamodel.university;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.School#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.School#getSid <em>Sid</em>}</li>
 *   <li>{@link org.rm2pt.expt2.university.metamodel.university.School#getContainPerson <em>Contain Person</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getSchool()
 * @model
 * @generated
 */
public interface School extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getSchool_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rm2pt.expt2.university.metamodel.university.School#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sid</em>' attribute.
	 * @see #setSid(int)
	 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getSchool_Sid()
	 * @model
	 * @generated
	 */
	int getSid();

	/**
	 * Sets the value of the '{@link org.rm2pt.expt2.university.metamodel.university.School#getSid <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getSid()
	 * @generated
	 */
	void setSid(int value);

	/**
	 * Returns the value of the '<em><b>Contain Person</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.expt2.university.metamodel.university.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain Person</em>' containment reference list.
	 * @see org.rm2pt.expt2.university.metamodel.university.UniversityPackage#getSchool_ContainPerson()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getContainPerson();

} // School
