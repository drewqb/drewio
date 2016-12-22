/**
 */
package com.frantz.drewio.drewIO;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Recieved</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.drewio.drewIO.OnRecieved#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.drewio.drewIO.DrewIOPackage#getOnRecieved()
 * @model
 * @generated
 */
public interface OnRecieved extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Statement)
   * @see com.frantz.drewio.drewIO.DrewIOPackage#getOnRecieved_Name()
   * @model
   * @generated
   */
  Statement getName();

  /**
   * Sets the value of the '{@link com.frantz.drewio.drewIO.OnRecieved#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Statement value);

} // OnRecieved
