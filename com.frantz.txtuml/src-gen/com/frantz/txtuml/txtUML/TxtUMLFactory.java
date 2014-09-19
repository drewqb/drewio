/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage
 * @generated
 */
public interface TxtUMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TxtUMLFactory eINSTANCE = com.frantz.txtuml.txtUML.impl.TxtUMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Class Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Decl</em>'.
   * @generated
   */
  ClassDecl createClassDecl();

  /**
   * Returns a new object of class '<em>Class Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Member</em>'.
   * @generated
   */
  ClassMember createClassMember();

  /**
   * Returns a new object of class '<em>Class Section Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Section Decl</em>'.
   * @generated
   */
  ClassSectionDecl createClassSectionDecl();

  /**
   * Returns a new object of class '<em>Visibility Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visibility Decl</em>'.
   * @generated
   */
  VisibilityDecl createVisibilityDecl();

  /**
   * Returns a new object of class '<em>Method Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Decl</em>'.
   * @generated
   */
  MethodDecl createMethodDecl();

  /**
   * Returns a new object of class '<em>Attribute Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Decl</em>'.
   * @generated
   */
  AttributeDecl createAttributeDecl();

  /**
   * Returns a new object of class '<em>Association Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Association Decl</em>'.
   * @generated
   */
  AssociationDecl createAssociationDecl();

  /**
   * Returns a new object of class '<em>Sequence Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Decl</em>'.
   * @generated
   */
  SequenceDecl createSequenceDecl();

  /**
   * Returns a new object of class '<em>Sequence Section Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Section Decl</em>'.
   * @generated
   */
  SequenceSectionDecl createSequenceSectionDecl();

  /**
   * Returns a new object of class '<em>Actor Section Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Section Decl</em>'.
   * @generated
   */
  ActorSectionDecl createActorSectionDecl();

  /**
   * Returns a new object of class '<em>Message Section Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Section Decl</em>'.
   * @generated
   */
  MessageSectionDecl createMessageSectionDecl();

  /**
   * Returns a new object of class '<em>Actor Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Decl</em>'.
   * @generated
   */
  ActorDecl createActorDecl();

  /**
   * Returns a new object of class '<em>Message Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Decl</em>'.
   * @generated
   */
  MessageDecl createMessageDecl();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TxtUMLPackage getTxtUMLPackage();

} //TxtUMLFactory
