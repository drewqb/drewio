/**
 */
package com.frantz.txtuml.txtUML.util;

import com.frantz.txtuml.txtUML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage
 * @generated
 */
public class TxtUMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TxtUMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxtUMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TxtUMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TxtUMLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.CLASS_DECL:
      {
        ClassDecl classDecl = (ClassDecl)theEObject;
        T result = caseClassDecl(classDecl);
        if (result == null) result = caseStatement(classDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.CLASS_MEMBER:
      {
        ClassMember classMember = (ClassMember)theEObject;
        T result = caseClassMember(classMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.CLASS_SECTION_DECL:
      {
        ClassSectionDecl classSectionDecl = (ClassSectionDecl)theEObject;
        T result = caseClassSectionDecl(classSectionDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.VISIBILITY_DECL:
      {
        VisibilityDecl visibilityDecl = (VisibilityDecl)theEObject;
        T result = caseVisibilityDecl(visibilityDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.METHOD_DECL:
      {
        MethodDecl methodDecl = (MethodDecl)theEObject;
        T result = caseMethodDecl(methodDecl);
        if (result == null) result = caseClassMember(methodDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.ATTRIBUTE_DECL:
      {
        AttributeDecl attributeDecl = (AttributeDecl)theEObject;
        T result = caseAttributeDecl(attributeDecl);
        if (result == null) result = caseClassMember(attributeDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.ASSOCIATION_DECL:
      {
        AssociationDecl associationDecl = (AssociationDecl)theEObject;
        T result = caseAssociationDecl(associationDecl);
        if (result == null) result = caseClassMember(associationDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.SEQUENCE_DECL:
      {
        SequenceDecl sequenceDecl = (SequenceDecl)theEObject;
        T result = caseSequenceDecl(sequenceDecl);
        if (result == null) result = caseStatement(sequenceDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.SEQUENCE_SECTION_DECL:
      {
        SequenceSectionDecl sequenceSectionDecl = (SequenceSectionDecl)theEObject;
        T result = caseSequenceSectionDecl(sequenceSectionDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.ACTOR_SECTION_DECL:
      {
        ActorSectionDecl actorSectionDecl = (ActorSectionDecl)theEObject;
        T result = caseActorSectionDecl(actorSectionDecl);
        if (result == null) result = caseSequenceSectionDecl(actorSectionDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.MESSAGE_SECTION_DECL:
      {
        MessageSectionDecl messageSectionDecl = (MessageSectionDecl)theEObject;
        T result = caseMessageSectionDecl(messageSectionDecl);
        if (result == null) result = caseSequenceSectionDecl(messageSectionDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.ACTOR_DECL:
      {
        ActorDecl actorDecl = (ActorDecl)theEObject;
        T result = caseActorDecl(actorDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TxtUMLPackage.MESSAGE_DECL:
      {
        MessageDecl messageDecl = (MessageDecl)theEObject;
        T result = caseMessageDecl(messageDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDecl(ClassDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassMember(ClassMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Section Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Section Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassSectionDecl(ClassSectionDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visibility Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visibility Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisibilityDecl(VisibilityDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodDecl(MethodDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeDecl(AttributeDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Association Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociationDecl(AssociationDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceDecl(SequenceDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Section Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Section Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceSectionDecl(SequenceSectionDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Section Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Section Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorSectionDecl(ActorSectionDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Section Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Section Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageSectionDecl(MessageSectionDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorDecl(ActorDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageDecl(MessageDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TxtUMLSwitch
