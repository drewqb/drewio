/**
 */
package com.frantz.drewio.drewIO;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.frantz.drewio.drewIO.InputStatement#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.frantz.drewio.drewIO.DrewIOPackage#getInputStatement()
 * @model
 * @generated
 */
public interface InputStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link com.frantz.drewio.drewIO.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see com.frantz.drewio.drewIO.DrewIOPackage#getInputStatement_Columns()
   * @model containment="true"
   * @generated
   */
  EList<Column> getColumns();

} // InputStatement
