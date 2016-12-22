/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.Model#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link com.frantz.txtuml.txtUML.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getModel_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Model
