/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Section Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.ActorSectionDecl#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getActorSectionDecl()
 * @model
 * @generated
 */
public interface ActorSectionDecl extends SequenceSectionDecl
{
  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link com.frantz.txtuml.txtUML.ActorDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getActorSectionDecl_Actors()
   * @model containment="true"
   * @generated
   */
  EList<ActorDecl> getActors();

} // ActorSectionDecl
