/**
 */
package com.frantz.drewio.drewIO;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.drewio.drewIO.OutputStatement#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.frantz.drewio.drewIO.OutputStatement#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.drewio.drewIO.DrewIOPackage#getOutputStatement()
 * @model
 * @generated
 */
public interface OutputStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Inputs</b></em>' reference list.
   * The list contents are of type {@link com.frantz.drewio.drewIO.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' reference list.
   * @see com.frantz.drewio.drewIO.DrewIOPackage#getOutputStatement_Inputs()
   * @model
   * @generated
   */
  EList<Statement> getInputs();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link com.frantz.drewio.drewIO.OnRecieved}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see com.frantz.drewio.drewIO.DrewIOPackage#getOutputStatement_Methods()
   * @model containment="true"
   * @generated
   */
  EList<OnRecieved> getMethods();

} // OutputStatement
