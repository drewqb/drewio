/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.VisibilityDecl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getVisibilityDecl()
 * @model
 * @generated
 */
public interface VisibilityDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link com.frantz.txtuml.txtUML.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see com.frantz.txtuml.txtUML.Visibility
   * @see #setVisibility(Visibility)
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#getVisibilityDecl_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link com.frantz.txtuml.txtUML.VisibilityDecl#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see com.frantz.txtuml.txtUML.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

} // VisibilityDecl
