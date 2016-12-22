/**
 */
package com.frantz.txtuml.txtUML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.frantz.txtuml.txtUML.TxtUMLFactory
 * @model kind="package"
 * @generated
 */
public interface TxtUMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "txtUML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.frantz.com/txtuml/TxtUML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "txtUML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TxtUMLPackage eINSTANCE = com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.ModelImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getModel()
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
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.StatementImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getStatement()
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
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.ClassDeclImpl <em>Class Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.ClassDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getClassDecl()
   * @generated
   */
  int CLASS_DECL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Inherits</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__INHERITS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__SECTIONS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.ClassMemberImpl <em>Class Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.ClassMemberImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getClassMember()
   * @generated
   */
  int CLASS_MEMBER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER__NAME = 0;

  /**
   * The number of structural features of the '<em>Class Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.ClassSectionDeclImpl <em>Class Section Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.ClassSectionDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getClassSectionDecl()
   * @generated
   */
  int CLASS_SECTION_DECL = 4;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SECTION_DECL__VISIBILITY = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SECTION_DECL__MEMBERS = 1;

  /**
   * The number of structural features of the '<em>Class Section Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SECTION_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.VisibilityDeclImpl <em>Visibility Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.VisibilityDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getVisibilityDecl()
   * @generated
   */
  int VISIBILITY_DECL = 5;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_DECL__VISIBILITY = 0;

  /**
   * The number of structural features of the '<em>Visibility Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.MethodDeclImpl <em>Method Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.MethodDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getMethodDecl()
   * @generated
   */
  int METHOD_DECL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__NAME = CLASS_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__RETURN_TYPE = CLASS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Method Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL_FEATURE_COUNT = CLASS_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.AttributeDeclImpl <em>Attribute Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.AttributeDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getAttributeDecl()
   * @generated
   */
  int ATTRIBUTE_DECL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DECL__NAME = CLASS_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DECL__TYPE = CLASS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DECL_FEATURE_COUNT = CLASS_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.AssociationDeclImpl <em>Association Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.AssociationDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getAssociationDecl()
   * @generated
   */
  int ASSOCIATION_DECL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DECL__NAME = CLASS_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DECL__TYPE = CLASS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Association Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DECL_FEATURE_COUNT = CLASS_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.SequenceDeclImpl <em>Sequence Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.SequenceDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getSequenceDecl()
   * @generated
   */
  int SEQUENCE_DECL = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_DECL__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_DECL__SECTIONS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequence Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.SequenceSectionDeclImpl <em>Sequence Section Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.SequenceSectionDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getSequenceSectionDecl()
   * @generated
   */
  int SEQUENCE_SECTION_DECL = 10;

  /**
   * The number of structural features of the '<em>Sequence Section Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_SECTION_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.ActorSectionDeclImpl <em>Actor Section Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.ActorSectionDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getActorSectionDecl()
   * @generated
   */
  int ACTOR_SECTION_DECL = 11;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_SECTION_DECL__ACTORS = SEQUENCE_SECTION_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Actor Section Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_SECTION_DECL_FEATURE_COUNT = SEQUENCE_SECTION_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.MessageSectionDeclImpl <em>Message Section Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.MessageSectionDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getMessageSectionDecl()
   * @generated
   */
  int MESSAGE_SECTION_DECL = 12;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_SECTION_DECL__MESSAGES = SEQUENCE_SECTION_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_SECTION_DECL__ACTORS = SEQUENCE_SECTION_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Message Section Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_SECTION_DECL_FEATURE_COUNT = SEQUENCE_SECTION_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.ActorDeclImpl <em>Actor Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.ActorDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getActorDecl()
   * @generated
   */
  int ACTOR_DECL = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Class Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_DECL__CLASS_REF = 1;

  /**
   * The number of structural features of the '<em>Actor Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.impl.MessageDeclImpl <em>Message Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.impl.MessageDeclImpl
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getMessageDecl()
   * @generated
   */
  int MESSAGE_DECL = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_DECL__LEFT_OP = 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_DECL__OPERATOR = 2;

  /**
   * The feature id for the '<em><b>Righ Op</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_DECL__RIGH_OP = 3;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_DECL__METHOD = 4;

  /**
   * The number of structural features of the '<em>Message Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_DECL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.MessageOperator <em>Message Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.MessageOperator
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getMessageOperator()
   * @generated
   */
  int MESSAGE_OPERATOR = 15;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.DataType <em>Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.DataType
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 16;

  /**
   * The meta object id for the '{@link com.frantz.txtuml.txtUML.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.frantz.txtuml.txtUML.Visibility
   * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 17;


  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.frantz.txtuml.txtUML.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.txtuml.txtUML.Model#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.frantz.txtuml.txtUML.Model#getStatements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statements();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see com.frantz.txtuml.txtUML.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.txtuml.txtUML.Statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.frantz.txtuml.txtUML.Statement#getName()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Name();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.ClassDecl <em>Class Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Decl</em>'.
   * @see com.frantz.txtuml.txtUML.ClassDecl
   * @generated
   */
  EClass getClassDecl();

  /**
   * Returns the meta object for the reference list '{@link com.frantz.txtuml.txtUML.ClassDecl#getInherits <em>Inherits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Inherits</em>'.
   * @see com.frantz.txtuml.txtUML.ClassDecl#getInherits()
   * @see #getClassDecl()
   * @generated
   */
  EReference getClassDecl_Inherits();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.txtuml.txtUML.ClassDecl#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see com.frantz.txtuml.txtUML.ClassDecl#getSections()
   * @see #getClassDecl()
   * @generated
   */
  EReference getClassDecl_Sections();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.ClassMember <em>Class Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Member</em>'.
   * @see com.frantz.txtuml.txtUML.ClassMember
   * @generated
   */
  EClass getClassMember();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.txtuml.txtUML.ClassMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.frantz.txtuml.txtUML.ClassMember#getName()
   * @see #getClassMember()
   * @generated
   */
  EAttribute getClassMember_Name();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.ClassSectionDecl <em>Class Section Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Section Decl</em>'.
   * @see com.frantz.txtuml.txtUML.ClassSectionDecl
   * @generated
   */
  EClass getClassSectionDecl();

  /**
   * Returns the meta object for the containment reference '{@link com.frantz.txtuml.txtUML.ClassSectionDecl#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility</em>'.
   * @see com.frantz.txtuml.txtUML.ClassSectionDecl#getVisibility()
   * @see #getClassSectionDecl()
   * @generated
   */
  EReference getClassSectionDecl_Visibility();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.txtuml.txtUML.ClassSectionDecl#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.frantz.txtuml.txtUML.ClassSectionDecl#getMembers()
   * @see #getClassSectionDecl()
   * @generated
   */
  EReference getClassSectionDecl_Members();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.VisibilityDecl <em>Visibility Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visibility Decl</em>'.
   * @see com.frantz.txtuml.txtUML.VisibilityDecl
   * @generated
   */
  EClass getVisibilityDecl();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.txtuml.txtUML.VisibilityDecl#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see com.frantz.txtuml.txtUML.VisibilityDecl#getVisibility()
   * @see #getVisibilityDecl()
   * @generated
   */
  EAttribute getVisibilityDecl_Visibility();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.MethodDecl <em>Method Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Decl</em>'.
   * @see com.frantz.txtuml.txtUML.MethodDecl
   * @generated
   */
  EClass getMethodDecl();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.txtuml.txtUML.MethodDecl#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see com.frantz.txtuml.txtUML.MethodDecl#getReturnType()
   * @see #getMethodDecl()
   * @generated
   */
  EAttribute getMethodDecl_ReturnType();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.AttributeDecl <em>Attribute Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Decl</em>'.
   * @see com.frantz.txtuml.txtUML.AttributeDecl
   * @generated
   */
  EClass getAttributeDecl();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.txtuml.txtUML.AttributeDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.frantz.txtuml.txtUML.AttributeDecl#getType()
   * @see #getAttributeDecl()
   * @generated
   */
  EAttribute getAttributeDecl_Type();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.AssociationDecl <em>Association Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association Decl</em>'.
   * @see com.frantz.txtuml.txtUML.AssociationDecl
   * @generated
   */
  EClass getAssociationDecl();

  /**
   * Returns the meta object for the reference '{@link com.frantz.txtuml.txtUML.AssociationDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.frantz.txtuml.txtUML.AssociationDecl#getType()
   * @see #getAssociationDecl()
   * @generated
   */
  EReference getAssociationDecl_Type();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.SequenceDecl <em>Sequence Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Decl</em>'.
   * @see com.frantz.txtuml.txtUML.SequenceDecl
   * @generated
   */
  EClass getSequenceDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.txtuml.txtUML.SequenceDecl#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see com.frantz.txtuml.txtUML.SequenceDecl#getSections()
   * @see #getSequenceDecl()
   * @generated
   */
  EReference getSequenceDecl_Sections();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.SequenceSectionDecl <em>Sequence Section Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Section Decl</em>'.
   * @see com.frantz.txtuml.txtUML.SequenceSectionDecl
   * @generated
   */
  EClass getSequenceSectionDecl();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.ActorSectionDecl <em>Actor Section Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Section Decl</em>'.
   * @see com.frantz.txtuml.txtUML.ActorSectionDecl
   * @generated
   */
  EClass getActorSectionDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.txtuml.txtUML.ActorSectionDecl#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see com.frantz.txtuml.txtUML.ActorSectionDecl#getActors()
   * @see #getActorSectionDecl()
   * @generated
   */
  EReference getActorSectionDecl_Actors();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.MessageSectionDecl <em>Message Section Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Section Decl</em>'.
   * @see com.frantz.txtuml.txtUML.MessageSectionDecl
   * @generated
   */
  EClass getMessageSectionDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.txtuml.txtUML.MessageSectionDecl#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see com.frantz.txtuml.txtUML.MessageSectionDecl#getMessages()
   * @see #getMessageSectionDecl()
   * @generated
   */
  EReference getMessageSectionDecl_Messages();

  /**
   * Returns the meta object for the containment reference list '{@link com.frantz.txtuml.txtUML.MessageSectionDecl#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see com.frantz.txtuml.txtUML.MessageSectionDecl#getActors()
   * @see #getMessageSectionDecl()
   * @generated
   */
  EReference getMessageSectionDecl_Actors();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.ActorDecl <em>Actor Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Decl</em>'.
   * @see com.frantz.txtuml.txtUML.ActorDecl
   * @generated
   */
  EClass getActorDecl();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.txtuml.txtUML.ActorDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.frantz.txtuml.txtUML.ActorDecl#getName()
   * @see #getActorDecl()
   * @generated
   */
  EAttribute getActorDecl_Name();

  /**
   * Returns the meta object for the reference '{@link com.frantz.txtuml.txtUML.ActorDecl#getClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class Ref</em>'.
   * @see com.frantz.txtuml.txtUML.ActorDecl#getClassRef()
   * @see #getActorDecl()
   * @generated
   */
  EReference getActorDecl_ClassRef();

  /**
   * Returns the meta object for class '{@link com.frantz.txtuml.txtUML.MessageDecl <em>Message Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Decl</em>'.
   * @see com.frantz.txtuml.txtUML.MessageDecl
   * @generated
   */
  EClass getMessageDecl();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.txtuml.txtUML.MessageDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.frantz.txtuml.txtUML.MessageDecl#getName()
   * @see #getMessageDecl()
   * @generated
   */
  EAttribute getMessageDecl_Name();

  /**
   * Returns the meta object for the reference '{@link com.frantz.txtuml.txtUML.MessageDecl#getLeftOp <em>Left Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left Op</em>'.
   * @see com.frantz.txtuml.txtUML.MessageDecl#getLeftOp()
   * @see #getMessageDecl()
   * @generated
   */
  EReference getMessageDecl_LeftOp();

  /**
   * Returns the meta object for the attribute '{@link com.frantz.txtuml.txtUML.MessageDecl#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see com.frantz.txtuml.txtUML.MessageDecl#getOperator()
   * @see #getMessageDecl()
   * @generated
   */
  EAttribute getMessageDecl_Operator();

  /**
   * Returns the meta object for the reference '{@link com.frantz.txtuml.txtUML.MessageDecl#getRighOp <em>Righ Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Righ Op</em>'.
   * @see com.frantz.txtuml.txtUML.MessageDecl#getRighOp()
   * @see #getMessageDecl()
   * @generated
   */
  EReference getMessageDecl_RighOp();

  /**
   * Returns the meta object for the reference '{@link com.frantz.txtuml.txtUML.MessageDecl#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see com.frantz.txtuml.txtUML.MessageDecl#getMethod()
   * @see #getMessageDecl()
   * @generated
   */
  EReference getMessageDecl_Method();

  /**
   * Returns the meta object for enum '{@link com.frantz.txtuml.txtUML.MessageOperator <em>Message Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Message Operator</em>'.
   * @see com.frantz.txtuml.txtUML.MessageOperator
   * @generated
   */
  EEnum getMessageOperator();

  /**
   * Returns the meta object for enum '{@link com.frantz.txtuml.txtUML.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type</em>'.
   * @see com.frantz.txtuml.txtUML.DataType
   * @generated
   */
  EEnum getDataType();

  /**
   * Returns the meta object for enum '{@link com.frantz.txtuml.txtUML.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see com.frantz.txtuml.txtUML.Visibility
   * @generated
   */
  EEnum getVisibility();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TxtUMLFactory getTxtUMLFactory();

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
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.ModelImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getModel()
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
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.StatementImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getStatement()
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
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.ClassDeclImpl <em>Class Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.ClassDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getClassDecl()
     * @generated
     */
    EClass CLASS_DECL = eINSTANCE.getClassDecl();

    /**
     * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__INHERITS = eINSTANCE.getClassDecl_Inherits();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__SECTIONS = eINSTANCE.getClassDecl_Sections();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.ClassMemberImpl <em>Class Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.ClassMemberImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getClassMember()
     * @generated
     */
    EClass CLASS_MEMBER = eINSTANCE.getClassMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_MEMBER__NAME = eINSTANCE.getClassMember_Name();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.ClassSectionDeclImpl <em>Class Section Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.ClassSectionDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getClassSectionDecl()
     * @generated
     */
    EClass CLASS_SECTION_DECL = eINSTANCE.getClassSectionDecl();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_SECTION_DECL__VISIBILITY = eINSTANCE.getClassSectionDecl_Visibility();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_SECTION_DECL__MEMBERS = eINSTANCE.getClassSectionDecl_Members();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.VisibilityDeclImpl <em>Visibility Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.VisibilityDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getVisibilityDecl()
     * @generated
     */
    EClass VISIBILITY_DECL = eINSTANCE.getVisibilityDecl();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISIBILITY_DECL__VISIBILITY = eINSTANCE.getVisibilityDecl_Visibility();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.MethodDeclImpl <em>Method Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.MethodDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getMethodDecl()
     * @generated
     */
    EClass METHOD_DECL = eINSTANCE.getMethodDecl();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__RETURN_TYPE = eINSTANCE.getMethodDecl_ReturnType();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.AttributeDeclImpl <em>Attribute Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.AttributeDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getAttributeDecl()
     * @generated
     */
    EClass ATTRIBUTE_DECL = eINSTANCE.getAttributeDecl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_DECL__TYPE = eINSTANCE.getAttributeDecl_Type();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.AssociationDeclImpl <em>Association Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.AssociationDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getAssociationDecl()
     * @generated
     */
    EClass ASSOCIATION_DECL = eINSTANCE.getAssociationDecl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION_DECL__TYPE = eINSTANCE.getAssociationDecl_Type();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.SequenceDeclImpl <em>Sequence Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.SequenceDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getSequenceDecl()
     * @generated
     */
    EClass SEQUENCE_DECL = eINSTANCE.getSequenceDecl();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_DECL__SECTIONS = eINSTANCE.getSequenceDecl_Sections();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.SequenceSectionDeclImpl <em>Sequence Section Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.SequenceSectionDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getSequenceSectionDecl()
     * @generated
     */
    EClass SEQUENCE_SECTION_DECL = eINSTANCE.getSequenceSectionDecl();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.ActorSectionDeclImpl <em>Actor Section Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.ActorSectionDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getActorSectionDecl()
     * @generated
     */
    EClass ACTOR_SECTION_DECL = eINSTANCE.getActorSectionDecl();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_SECTION_DECL__ACTORS = eINSTANCE.getActorSectionDecl_Actors();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.MessageSectionDeclImpl <em>Message Section Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.MessageSectionDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getMessageSectionDecl()
     * @generated
     */
    EClass MESSAGE_SECTION_DECL = eINSTANCE.getMessageSectionDecl();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_SECTION_DECL__MESSAGES = eINSTANCE.getMessageSectionDecl_Messages();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_SECTION_DECL__ACTORS = eINSTANCE.getMessageSectionDecl_Actors();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.ActorDeclImpl <em>Actor Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.ActorDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getActorDecl()
     * @generated
     */
    EClass ACTOR_DECL = eINSTANCE.getActorDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR_DECL__NAME = eINSTANCE.getActorDecl_Name();

    /**
     * The meta object literal for the '<em><b>Class Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_DECL__CLASS_REF = eINSTANCE.getActorDecl_ClassRef();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.impl.MessageDeclImpl <em>Message Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.impl.MessageDeclImpl
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getMessageDecl()
     * @generated
     */
    EClass MESSAGE_DECL = eINSTANCE.getMessageDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_DECL__NAME = eINSTANCE.getMessageDecl_Name();

    /**
     * The meta object literal for the '<em><b>Left Op</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_DECL__LEFT_OP = eINSTANCE.getMessageDecl_LeftOp();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_DECL__OPERATOR = eINSTANCE.getMessageDecl_Operator();

    /**
     * The meta object literal for the '<em><b>Righ Op</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_DECL__RIGH_OP = eINSTANCE.getMessageDecl_RighOp();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_DECL__METHOD = eINSTANCE.getMessageDecl_Method();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.MessageOperator <em>Message Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.MessageOperator
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getMessageOperator()
     * @generated
     */
    EEnum MESSAGE_OPERATOR = eINSTANCE.getMessageOperator();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.DataType
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getDataType()
     * @generated
     */
    EEnum DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link com.frantz.txtuml.txtUML.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.frantz.txtuml.txtUML.Visibility
     * @see com.frantz.txtuml.txtUML.impl.TxtUMLPackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

  }

} //TxtUMLPackage
