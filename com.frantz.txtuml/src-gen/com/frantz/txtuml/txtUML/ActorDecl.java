/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.ActorDecl#getName <em>Name</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.ActorDecl#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getActorDecl()
 * @model
 * @generated
 */
public interface ActorDecl extends EObject
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
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getActorDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.ActorDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Class Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Ref</em>' reference.
   * @see #setClassRef(ClassDecl)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getActorDecl_ClassRef()
   * @model
   * @generated
   */
  ClassDecl getClassRef();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.ActorDecl#getClassRef <em>Class Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Ref</em>' reference.
   * @see #getClassRef()
   * @generated
   */
  void setClassRef(ClassDecl value);

} // ActorDecl
