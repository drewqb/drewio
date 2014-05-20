/**
 */
package com.frantz.drewio.drewIO;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.frantz.drewio.drewIO.DrewIOFactory
 * @model kind="package"
 * @generated
 */
public interface DrewIOPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "drewIO";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.frantz.com/drewio/DrewIO";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "drewIO";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DrewIOPackage eINSTANCE = com.frantz.drewio.drewIO.impl.DrewIOPackageImpl.init();

  /**
   * The meta object id for the '{@link com.frantz.drewio.drewIO.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.drewio.drewIO.impl.ModelImpl
   * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.frantz.drewio.drewIO.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.drewio.drewIO.impl.StatementImpl
   * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.frantz.drewio.drewIO.impl.InputStatementImpl <em>Input Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.drewio.drewIO.impl.InputStatementImpl
   * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getInputStatement()
   * @generated
   */
  int INPUT_STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_STATEMENT__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_STATEMENT__COLUMNS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.frantz.drewio.drewIO.impl.OutputStatementImpl <em>Output Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.drewio.drewIO.impl.OutputStatementImpl
   * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getOutputStatement()
   * @generated
   */
  int OUTPUT_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_STATEMENT__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_STATEMENT__INPUTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_STATEMENT__METHODS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Output Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.frantz.drewio.drewIO.impl.OnRecievedImpl <em>On Recieved</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.drewio.drewIO.impl.OnRecievedImpl
   * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getOnRecieved()
   * @generated
   */
  int ON_RECIEVED = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_RECIEVED__NAME = 0;

  /**
   * The number of structural features of the '<em>On Recieved</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_RECIEVED_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.frantz.drewio.drewIO.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.drewio.drewIO.impl.ColumnImpl
   * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__TYPE = 1;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.frantz.drewio.drewIO.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.frantz.drewio.drewIO.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.drewio.drewIO.Model#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.frantz.drewio.drewIO.Model#getStatements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statements();

  /**
   * Returns the meta object for class '{@link com.frantz.drewio.drewIO.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see com.frantz.drewio.drewIO.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.drewio.drewIO.Statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.frantz.drewio.drewIO.Statement#getName()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Name();

  /**
   * Returns the meta object for class '{@link com.frantz.drewio.drewIO.InputStatement <em>Input Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Statement</em>'.
   * @see com.frantz.drewio.drewIO.InputStatement
   * @generated
   */
  EClass getInputStatement();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.drewio.drewIO.InputStatement#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.frantz.drewio.drewIO.InputStatement#getColumns()
   * @see #getInputStatement()
   * @generated
   */
  EReference getInputStatement_Columns();

  /**
   * Returns the meta object for class '{@link com.frantz.drewio.drewIO.OutputStatement <em>Output Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Statement</em>'.
   * @see com.frantz.drewio.drewIO.OutputStatement
   * @generated
   */
  EClass getOutputStatement();

  /**
   * Returns the meta object for the reference list '{@link com.frantz.drewio.drewIO.OutputStatement#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Inputs</em>'.
   * @see com.frantz.drewio.drewIO.OutputStatement#getInputs()
   * @see #getOutputStatement()
   * @generated
   */
  EReference getOutputStatement_Inputs();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.drewio.drewIO.OutputStatement#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see com.frantz.drewio.drewIO.OutputStatement#getMethods()
   * @see #getOutputStatement()
   * @generated
   */
  EReference getOutputStatement_Methods();

  /**
   * Returns the meta object for class '{@link com.frantz.drewio.drewIO.OnRecieved <em>On Recieved</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>On Recieved</em>'.
   * @see com.frantz.drewio.drewIO.OnRecieved
   * @generated
   */
  EClass getOnRecieved();

  /**
   * Returns the meta object for the reference '{@link com.frantz.drewio.drewIO.OnRecieved#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.frantz.drewio.drewIO.OnRecieved#getName()
   * @see #getOnRecieved()
   * @generated
   */
  EReference getOnRecieved_Name();

  /**
   * Returns the meta object for class '{@link com.frantz.drewio.drewIO.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see com.frantz.drewio.drewIO.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.drewio.drewIO.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.frantz.drewio.drewIO.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.drewio.drewIO.Column#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.frantz.drewio.drewIO.Column#getType()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DrewIOFactory getDrewIOFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.frantz.drewio.drewIO.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.drewio.drewIO.impl.ModelImpl
     * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STATEMENTS = eINSTANCE.getModel_Statements();

    /**
     * The meta object literal for the '{@link com.frantz.drewio.drewIO.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.drewio.drewIO.impl.StatementImpl
     * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

    /**
     * The meta object literal for the '{@link com.frantz.drewio.drewIO.impl.InputStatementImpl <em>Input Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.drewio.drewIO.impl.InputStatementImpl
     * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getInputStatement()
     * @generated
     */
    EClass INPUT_STATEMENT = eINSTANCE.getInputStatement();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_STATEMENT__COLUMNS = eINSTANCE.getInputStatement_Columns();

    /**
     * The meta object literal for the '{@link com.frantz.drewio.drewIO.impl.OutputStatementImpl <em>Output Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.drewio.drewIO.impl.OutputStatementImpl
     * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getOutputStatement()
     * @generated
     */
    EClass OUTPUT_STATEMENT = eINSTANCE.getOutputStatement();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_STATEMENT__INPUTS = eINSTANCE.getOutputStatement_Inputs();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_STATEMENT__METHODS = eINSTANCE.getOutputStatement_Methods();

    /**
     * The meta object literal for the '{@link com.frantz.drewio.drewIO.impl.OnRecievedImpl <em>On Recieved</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.drewio.drewIO.impl.OnRecievedImpl
     * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getOnRecieved()
     * @generated
     */
    EClass ON_RECIEVED = eINSTANCE.getOnRecieved();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ON_RECIEVED__NAME = eINSTANCE.getOnRecieved_Name();

    /**
     * The meta object literal for the '{@link com.frantz.drewio.drewIO.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.drewio.drewIO.impl.ColumnImpl
     * @see com.frantz.drewio.drewIO.impl.DrewIOPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

  }

} //DrewIOPackage
