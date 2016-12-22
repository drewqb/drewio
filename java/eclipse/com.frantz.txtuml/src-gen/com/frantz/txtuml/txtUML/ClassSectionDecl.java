/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Section Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.ClassSectionDecl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.ClassSectionDecl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getClassSectionDecl()
 * @model
 * @generated
 */
public interface ClassSectionDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' containment reference.
   * @see #setVisibility(VisibilityDecl)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getClassSectionDecl_Visibility()
   * @model containment="true"
   * @generated
   */
  VisibilityDecl getVisibility();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.ClassSectionDecl#getVisibility <em>Visibility</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' containment reference.
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityDecl value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link com.frantz.txtuml.txtUML.ClassMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getClassSectionDecl_Members()
   * @model containment="true"
   * @generated
   */
  EList<ClassMember> getMembers();

} // ClassSectionDecl
