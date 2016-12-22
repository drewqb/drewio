/**
 */
package com.frantz.txtuml.txtUML.impl;

import com.frantz.txtuml.txtUML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class TxtUMLFactoryImpl extends EFactoryImpl implements TxtUMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TxtUMLFactory init()
  {
    try
    {
      TxtUMLFactory theTxtUMLFactory = (TxtUMLFactory)EPackage.Registry.INSTANCE.getEFactory(TxtUMLPackage.eNS_URI);
      if (theTxtUMLFactory != null)
      {
        return theTxtUMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TxtUMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxtUMLFactoryImpl()
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
      case TxtUMLPackage.MODEL: return createModel();
      case TxtUMLPackage.STATEMENT: return createStatement();
      case TxtUMLPackage.CLASS_DECL: return createClassDecl();
      case TxtUMLPackage.CLASS_MEMBER: return createClassMember();
      case TxtUMLPackage.CLASS_SECTION_DECL: return createClassSectionDecl();
      case TxtUMLPackage.VISIBILITY_DECL: return createVisibilityDecl();
      case TxtUMLPackage.METHOD_DECL: return createMethodDecl();
      case TxtUMLPackage.ATTRIBUTE_DECL: return createAttributeDecl();
      case TxtUMLPackage.ASSOCIATION_DECL: return createAssociationDecl();
      case TxtUMLPackage.SEQUENCE_DECL: return createSequenceDecl();
      case TxtUMLPackage.SEQUENCE_SECTION_DECL: return createSequenceSectionDecl();
      case TxtUMLPackage.ACTOR_SECTION_DECL: return createActorSectionDecl();
      case TxtUMLPackage.MESSAGE_SECTION_DECL: return createMessageSectionDecl();
      case TxtUMLPackage.ACTOR_DECL: return createActorDecl();
      case TxtUMLPackage.MESSAGE_DECL: return createMessageDecl();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TxtUMLPackage.MESSAGE_OPERATOR:
        return createMessageOperatorFromString(eDataType, initialValue);
      case TxtUMLPackage.DATA_TYPE:
        return createDataTypeFromString(eDataType, initialValue);
      case TxtUMLPackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TxtUMLPackage.MESSAGE_OPERATOR:
        return convertMessageOperatorToString(eDataType, instanceValue);
      case TxtUMLPackage.DATA_TYPE:
        return convertDataTypeToString(eDataType, instanceValue);
      case TxtUMLPackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public ClassDecl createClassDecl()
  {
    ClassDeclImpl classDecl = new ClassDeclImpl();
    return classDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassMember createClassMember()
  {
    ClassMemberImpl classMember = new ClassMemberImpl();
    return classMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassSectionDecl createClassSectionDecl()
  {
    ClassSectionDeclImpl classSectionDecl = new ClassSectionDeclImpl();
    return classSectionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityDecl createVisibilityDecl()
  {
    VisibilityDeclImpl visibilityDecl = new VisibilityDeclImpl();
    return visibilityDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDecl createMethodDecl()
  {
    MethodDeclImpl methodDecl = new MethodDeclImpl();
    return methodDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDecl createAttributeDecl()
  {
    AttributeDeclImpl attributeDecl = new AttributeDeclImpl();
    return attributeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssociationDecl createAssociationDecl()
  {
    AssociationDeclImpl associationDecl = new AssociationDeclImpl();
    return associationDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceDecl createSequenceDecl()
  {
    SequenceDeclImpl sequenceDecl = new SequenceDeclImpl();
    return sequenceDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceSectionDecl createSequenceSectionDecl()
  {
    SequenceSectionDeclImpl sequenceSectionDecl = new SequenceSectionDeclImpl();
    return sequenceSectionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorSectionDecl createActorSectionDecl()
  {
    ActorSectionDeclImpl actorSectionDecl = new ActorSectionDeclImpl();
    return actorSectionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageSectionDecl createMessageSectionDecl()
  {
    MessageSectionDeclImpl messageSectionDecl = new MessageSectionDeclImpl();
    return messageSectionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorDecl createActorDecl()
  {
    ActorDeclImpl actorDecl = new ActorDeclImpl();
    return actorDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageDecl createMessageDecl()
  {
    MessageDeclImpl messageDecl = new MessageDeclImpl();
    return messageDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageOperator createMessageOperatorFromString(EDataType eDataType, String initialValue)
  {
    MessageOperator result = MessageOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMessageOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataTypeFromString(EDataType eDataType, String initialValue)
  {
    DataType result = DataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
  {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxtUMLPackage getTxtUMLPackage()
  {
    return (TxtUMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TxtUMLPackage getPackage()
  {
    return TxtUMLPackage.eINSTANCE;
  }

} //TxtUMLFactoryImpl
