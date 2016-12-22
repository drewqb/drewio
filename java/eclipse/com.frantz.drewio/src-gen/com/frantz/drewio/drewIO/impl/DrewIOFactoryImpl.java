/**
 */
package com.frantz.drewio.drewIO.impl;

import com.frantz.drewio.drewIO.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DrewIOFactoryImpl extends EFactoryImpl implements DrewIOFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DrewIOFactory init()
  {
    try
    {
      DrewIOFactory theDrewIOFactory = (DrewIOFactory)EPackage.Registry.INSTANCE.getEFactory(DrewIOPackage.eNS_URI);
      if (theDrewIOFactory != null)
      {
        return theDrewIOFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DrewIOFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrewIOFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DrewIOPackage.MODEL: return createModel();
      case DrewIOPackage.STATEMENT: return createStatement();
      case DrewIOPackage.INPUT_STATEMENT: return createInputStatement();
      case DrewIOPackage.OUTPUT_STATEMENT: return createOutputStatement();
      case DrewIOPackage.ON_RECIEVED: return createOnRecieved();
      case DrewIOPackage.COLUMN: return createColumn();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputStatement createInputStatement()
  {
    InputStatementImpl inputStatement = new InputStatementImpl();
    return inputStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputStatement createOutputStatement()
  {
    OutputStatementImpl outputStatement = new OutputStatementImpl();
    return outputStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnRecieved createOnRecieved()
  {
    OnRecievedImpl onRecieved = new OnRecievedImpl();
    return onRecieved;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrewIOPackage getDrewIOPackage()
  {
    return (DrewIOPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DrewIOPackage getPackage()
  {
    return DrewIOPackage.eINSTANCE;
  }

} //DrewIOFactoryImpl
