/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Section Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.MessageSectionDecl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMessageSectionDecl()
 * @model
 * @generated
 */
public interface MessageSectionDecl extends SequenceSectionDecl
{
  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link com.frantz.txtuml.txtUML.MessageDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getMessageSectionDecl_Messages()
   * @model containment="true"
   * @generated
   */
  EList<MessageDecl> getMessages();

} // MessageSectionDecl
