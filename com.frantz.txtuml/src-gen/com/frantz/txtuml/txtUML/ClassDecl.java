/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.ClassDecl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.ClassDecl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getClassDecl()
 * @model
 * @generated
 */
public interface ClassDecl extends Statement
{
  /**
   * Returns the value of the '<em><b>Inherits</b></em>' reference list.
   * The list contents are of type {@link com.frantz.txtuml.txtUML.ClassDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inherits</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inherits</em>' reference list.
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getClassDecl_Inherits()
   * @model
   * @generated
   */
  EList<ClassDecl> getInherits();

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link com.frantz.txtuml.txtUML.ClassSectionDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getClassDecl_Sections()
   * @model containment="true"
   * @generated
   */
  EList<ClassSectionDecl> getSections();

} // ClassDecl
