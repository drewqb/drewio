/**
 */
package com.frantz.txtuml.txtUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.MethodDecl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMethodDecl()
 * @model
 * @generated
 */
public interface MethodDecl extends ClassMember
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.frantz.txtuml.txtUML.DataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see com.frantz.txtuml.txtUML.DataType
   * @see #setReturnType(DataType)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMethodDecl_ReturnType()
   * @model
   * @generated
   */
  DataType getReturnType();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.MethodDecl#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see com.frantz.txtuml.txtUML.DataType
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(DataType value);

} // MethodDecl
