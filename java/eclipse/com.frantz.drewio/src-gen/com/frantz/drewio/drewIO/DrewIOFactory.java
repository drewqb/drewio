/**
 */
package com.frantz.drewio.drewIO;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.frantz.drewio.drewIO.DrewIOPackage
 * @generated
 */
public interface DrewIOFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DrewIOFactory eINSTANCE = com.frantz.drewio.drewIO.impl.DrewIOFactoryImpl.init();

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
   * Returns a new object of class '<em>Input Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Statement</em>'.
   * @generated
   */
  InputStatement createInputStatement();

  /**
   * Returns a new object of class '<em>Output Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Statement</em>'.
   * @generated
   */
  OutputStatement createOutputStatement();

  /**
   * Returns a new object of class '<em>On Recieved</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>On Recieved</em>'.
   * @generated
   */
  OnRecieved createOnRecieved();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DrewIOPackage getDrewIOPackage();

} //DrewIOFactory
