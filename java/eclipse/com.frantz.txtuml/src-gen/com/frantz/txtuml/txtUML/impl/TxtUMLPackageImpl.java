/**
 */
package com.frantz.txtuml.txtUML.impl;

import com.frantz.txtuml.txtUML.ActorDecl;
import com.frantz.txtuml.txtUML.ActorSectionDecl;
import com.frantz.txtuml.txtUML.AssociationDecl;
import com.frantz.txtuml.txtUML.AttributeDecl;
import com.frantz.txtuml.txtUML.ClassDecl;
import com.frantz.txtuml.txtUML.ClassMember;
import com.frantz.txtuml.txtUML.ClassSectionDecl;
import com.frantz.txtuml.txtUML.DataType;
import com.frantz.txtuml.txtUML.MessageDecl;
import com.frantz.txtuml.txtUML.MessageOperator;
import com.frantz.txtuml.txtUML.MessageSectionDecl;
import com.frantz.txtuml.txtUML.MethodDecl;
import com.frantz.txtuml.txtUML.Model;
import com.frantz.txtuml.txtUML.SequenceDecl;
import com.frantz.txtuml.txtUML.SequenceSectionDecl;
import com.frantz.txtuml.txtUML.Statement;
import com.frantz.txtuml.txtUML.TxtUMLFactory;
import com.frantz.txtuml.txtUML.TxtUMLPackage;
import com.frantz.txtuml.txtUML.Visibility;
import com.frantz.txtuml.txtUML.VisibilityDecl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TxtUMLPackageImpl extends EPackageImpl implements TxtUMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classSectionDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visibilityDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass associationDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceSectionDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorSectionDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageSectionDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum messageOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dataTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visibilityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.frantz.txtuml.txtUML.TxtUMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TxtUMLPackageImpl()
  {
    super(eNS_URI, TxtUMLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TxtUMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TxtUMLPackage init()
  {
    if (isInited) return (TxtUMLPackage)EPackage.Registry.INSTANCE.getEPackage(TxtUMLPackage.eNS_URI);

    // Obtain or create and register package
    TxtUMLPackageImpl theTxtUMLPackage = (TxtUMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TxtUMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TxtUMLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTxtUMLPackage.createPackageContents();

    // Initialize created meta-data
    theTxtUMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTxtUMLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TxtUMLPackage.eNS_URI, theTxtUMLPackage);
    return theTxtUMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Statements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Name()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDecl()
  {
    return classDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDecl_Inherits()
  {
    return (EReference)classDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDecl_Sections()
  {
    return (EReference)classDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassMember()
  {
    return classMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassMember_Name()
  {
    return (EAttribute)classMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassSectionDecl()
  {
    return classSectionDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassSectionDecl_Visibility()
  {
    return (EReference)classSectionDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassSectionDecl_Members()
  {
    return (EReference)classSectionDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisibilityDecl()
  {
    return visibilityDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisibilityDecl_Visibility()
  {
    return (EAttribute)visibilityDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodDecl()
  {
    return methodDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodDecl_ReturnType()
  {
    return (EAttribute)methodDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeDecl()
  {
    return attributeDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeDecl_Type()
  {
    return (EAttribute)attributeDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssociationDecl()
  {
    return associationDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociationDecl_Type()
  {
    return (EReference)associationDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequenceDecl()
  {
    return sequenceDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceDecl_Sections()
  {
    return (EReference)sequenceDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequenceSectionDecl()
  {
    return sequenceSectionDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorSectionDecl()
  {
    return actorSectionDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorSectionDecl_Actors()
  {
    return (EReference)actorSectionDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageSectionDecl()
  {
    return messageSectionDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageSectionDecl_Messages()
  {
    return (EReference)messageSectionDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorDecl()
  {
    return actorDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorDecl_Name()
  {
    return (EAttribute)actorDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorDecl_ClassRef()
  {
    return (EReference)actorDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageDecl()
  {
    return messageDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageDecl_Name()
  {
    return (EAttribute)messageDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageDecl_LeftOp()
  {
    return (EReference)messageDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageDecl_Operator()
  {
    return (EAttribute)messageDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageDecl_RighOp()
  {
    return (EReference)messageDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageDecl_Method()
  {
    return (EReference)messageDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMessageOperator()
  {
    return messageOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDataType()
  {
    return dataTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisibility()
  {
    return visibilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxtUMLFactory getTxtUMLFactory()
  {
    return (TxtUMLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__STATEMENTS);

    statementEClass = createEClass(STATEMENT);
    createEAttribute(statementEClass, STATEMENT__NAME);

    classDeclEClass = createEClass(CLASS_DECL);
    createEReference(classDeclEClass, CLASS_DECL__INHERITS);
    createEReference(classDeclEClass, CLASS_DECL__SECTIONS);

    classMemberEClass = createEClass(CLASS_MEMBER);
    createEAttribute(classMemberEClass, CLASS_MEMBER__NAME);

    classSectionDeclEClass = createEClass(CLASS_SECTION_DECL);
    createEReference(classSectionDeclEClass, CLASS_SECTION_DECL__VISIBILITY);
    createEReference(classSectionDeclEClass, CLASS_SECTION_DECL__MEMBERS);

    visibilityDeclEClass = createEClass(VISIBILITY_DECL);
    createEAttribute(visibilityDeclEClass, VISIBILITY_DECL__VISIBILITY);

    methodDeclEClass = createEClass(METHOD_DECL);
    createEAttribute(methodDeclEClass, METHOD_DECL__RETURN_TYPE);

    attributeDeclEClass = createEClass(ATTRIBUTE_DECL);
    createEAttribute(attributeDeclEClass, ATTRIBUTE_DECL__TYPE);

    associationDeclEClass = createEClass(ASSOCIATION_DECL);
    createEReference(associationDeclEClass, ASSOCIATION_DECL__TYPE);

    sequenceDeclEClass = createEClass(SEQUENCE_DECL);
    createEReference(sequenceDeclEClass, SEQUENCE_DECL__SECTIONS);

    sequenceSectionDeclEClass = createEClass(SEQUENCE_SECTION_DECL);

    actorSectionDeclEClass = createEClass(ACTOR_SECTION_DECL);
    createEReference(actorSectionDeclEClass, ACTOR_SECTION_DECL__ACTORS);

    messageSectionDeclEClass = createEClass(MESSAGE_SECTION_DECL);
    createEReference(messageSectionDeclEClass, MESSAGE_SECTION_DECL__MESSAGES);

    actorDeclEClass = createEClass(ACTOR_DECL);
    createEAttribute(actorDeclEClass, ACTOR_DECL__NAME);
    createEReference(actorDeclEClass, ACTOR_DECL__CLASS_REF);

    messageDeclEClass = createEClass(MESSAGE_DECL);
    createEAttribute(messageDeclEClass, MESSAGE_DECL__NAME);
    createEReference(messageDeclEClass, MESSAGE_DECL__LEFT_OP);
    createEAttribute(messageDeclEClass, MESSAGE_DECL__OPERATOR);
    createEReference(messageDeclEClass, MESSAGE_DECL__RIGH_OP);
    createEReference(messageDeclEClass, MESSAGE_DECL__METHOD);

    // Create enums
    messageOperatorEEnum = createEEnum(MESSAGE_OPERATOR);
    dataTypeEEnum = createEEnum(DATA_TYPE);
    visibilityEEnum = createEEnum(VISIBILITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    classDeclEClass.getESuperTypes().add(this.getStatement());
    methodDeclEClass.getESuperTypes().add(this.getClassMember());
    attributeDeclEClass.getESuperTypes().add(this.getClassMember());
    associationDeclEClass.getESuperTypes().add(this.getClassMember());
    sequenceDeclEClass.getESuperTypes().add(this.getStatement());
    actorSectionDeclEClass.getESuperTypes().add(this.getSequenceSectionDecl());
    messageSectionDeclEClass.getESuperTypes().add(this.getSequenceSectionDecl());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Statements(), this.getStatement(), null, "statements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDeclEClass, ClassDecl.class, "ClassDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassDecl_Inherits(), this.getClassDecl(), null, "inherits", null, 0, -1, ClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDecl_Sections(), this.getClassSectionDecl(), null, "sections", null, 0, -1, ClassDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classMemberEClass, ClassMember.class, "ClassMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classSectionDeclEClass, ClassSectionDecl.class, "ClassSectionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassSectionDecl_Visibility(), this.getVisibilityDecl(), null, "visibility", null, 0, 1, ClassSectionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassSectionDecl_Members(), this.getClassMember(), null, "members", null, 0, -1, ClassSectionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visibilityDeclEClass, VisibilityDecl.class, "VisibilityDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisibilityDecl_Visibility(), this.getVisibility(), "visibility", null, 0, 1, VisibilityDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodDeclEClass, MethodDecl.class, "MethodDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethodDecl_ReturnType(), this.getDataType(), "returnType", null, 0, 1, MethodDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeDeclEClass, AttributeDecl.class, "AttributeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeDecl_Type(), this.getDataType(), "type", null, 0, 1, AttributeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(associationDeclEClass, AssociationDecl.class, "AssociationDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssociationDecl_Type(), this.getClassDecl(), null, "type", null, 0, 1, AssociationDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceDeclEClass, SequenceDecl.class, "SequenceDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequenceDecl_Sections(), this.getSequenceSectionDecl(), null, "sections", null, 0, -1, SequenceDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceSectionDeclEClass, SequenceSectionDecl.class, "SequenceSectionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actorSectionDeclEClass, ActorSectionDecl.class, "ActorSectionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActorSectionDecl_Actors(), this.getActorDecl(), null, "actors", null, 0, -1, ActorSectionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageSectionDeclEClass, MessageSectionDecl.class, "MessageSectionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMessageSectionDecl_Messages(), this.getMessageDecl(), null, "messages", null, 0, -1, MessageSectionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorDeclEClass, ActorDecl.class, "ActorDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActorDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorDecl_ClassRef(), this.getClassDecl(), null, "classRef", null, 0, 1, ActorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageDeclEClass, MessageDecl.class, "MessageDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageDecl_LeftOp(), this.getActorDecl(), null, "leftOp", null, 0, 1, MessageDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageDecl_Operator(), this.getMessageOperator(), "operator", null, 0, 1, MessageDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageDecl_RighOp(), this.getActorDecl(), null, "righOp", null, 0, 1, MessageDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageDecl_Method(), this.getMethodDecl(), null, "method", null, 0, 1, MessageDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(messageOperatorEEnum, MessageOperator.class, "MessageOperator");
    addEEnumLiteral(messageOperatorEEnum, MessageOperator.RIGHT_MSG);
    addEEnumLiteral(messageOperatorEEnum, MessageOperator.LEFT_MSG);

    initEEnum(dataTypeEEnum, DataType.class, "DataType");
    addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
    addEEnumLiteral(dataTypeEEnum, DataType.STRING);
    addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
    addEEnumLiteral(dataTypeEEnum, DataType.DOUBLE);

    initEEnum(visibilityEEnum, Visibility.class, "Visibility");
    addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
    addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);

    // Create resource
    createResource(eNS_URI);
  }

} //TxtUMLPackageImpl
