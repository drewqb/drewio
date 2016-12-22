/**
 */
package com.frantz.txtuml.txtUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.AttributeDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getAttributeDecl()
 * @model
 * @generated
 */
public interface AttributeDecl extends ClassMember
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.frantz.txtuml.txtUML.DataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.frantz.txtuml.txtUML.DataType
   * @see #setType(DataType)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getAttributeDecl_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.AttributeDecl#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.frantz.txtuml.txtUML.DataType
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

} // AttributeDecl
