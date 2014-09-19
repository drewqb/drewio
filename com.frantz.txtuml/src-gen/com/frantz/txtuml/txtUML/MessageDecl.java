/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.MessageDecl#getName <em>Name</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.MessageDecl#getLeftOp <em>Left Op</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.MessageDecl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.MessageDecl#getRighOp <em>Righ Op</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.MessageDecl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMessageDecl()
 * @model
 * @generated
 */
public interface MessageDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMessageDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.MessageDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Left Op</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Op</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Op</em>' reference.
   * @see #setLeftOp(ActorDecl)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMessageDecl_LeftOp()
   * @model
   * @generated
   */
  ActorDecl getLeftOp();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.MessageDecl#getLeftOp <em>Left Op</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Op</em>' reference.
   * @see #getLeftOp()
   * @generated
   */
  void setLeftOp(ActorDecl value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link com.frantz.txtuml.txtUML.MessageOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see com.frantz.txtuml.txtUML.MessageOperator
   * @see #setOperator(MessageOperator)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMessageDecl_Operator()
   * @model
   * @generated
   */
  MessageOperator getOperator();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.MessageDecl#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see com.frantz.txtuml.txtUML.MessageOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(MessageOperator value);

  /**
   * Returns the value of the '<em><b>Righ Op</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Righ Op</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Righ Op</em>' reference.
   * @see #setRighOp(ActorDecl)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMessageDecl_RighOp()
   * @model
   * @generated
   */
  ActorDecl getRighOp();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.MessageDecl#getRighOp <em>Righ Op</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Righ Op</em>' reference.
   * @see #getRighOp()
   * @generated
   */
  void setRighOp(ActorDecl value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(MethodDecl)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMessageDecl_Method()
   * @model
   * @generated
   */
  MethodDecl getMethod();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.MessageDecl#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(MethodDecl value);

} // MessageDecl
