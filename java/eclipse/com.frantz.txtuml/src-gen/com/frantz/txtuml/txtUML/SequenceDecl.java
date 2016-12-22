/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.SequenceDecl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getSequenceDecl()
 * @model
 * @generated
 */
public interface SequenceDecl extends Statement
{
  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link com.frantz.txtuml.txtUML.SequenceSectionDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getSequenceDecl_Sections()
   * @model containment="true"
   * @generated
   */
  EList<SequenceSectionDecl> getSections();

} // SequenceDecl
