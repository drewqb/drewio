/**
 */
package com.frantz.txtuml.txtUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.AssociationDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getAssociationDecl()
 * @model
 * @generated
 */
public interface AssociationDecl extends ClassMember
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ClassDecl)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getAssociationDecl_Type()
   * @model
   * @generated
   */
  ClassDecl getType();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.AssociationDecl#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ClassDecl value);

} // AssociationDecl
