/**
 */
package com.frantz.txtuml.txtUML.util;

import com.frantz.txtuml.txtUML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.frantz.txtuml.txtUML.TxtUMLPackage
 * @generated
 */
public class TxtUMLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TxtUMLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxtUMLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TxtUMLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TxtUMLSwitch<Adapter> modelSwitch =
    new TxtUMLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseClassDecl(ClassDecl object)
      {
        return createClassDeclAdapter();
      }
      @Override
      public Adapter caseClassMember(ClassMember object)
      {
        return createClassMemberAdapter();
      }
      @Override
      public Adapter caseClassSectionDecl(ClassSectionDecl object)
      {
        return createClassSectionDeclAdapter();
      }
      @Override
      public Adapter caseVisibilityDecl(VisibilityDecl object)
      {
        return createVisibilityDeclAdapter();
      }
      @Override
      public Adapter caseMethodDecl(MethodDecl object)
      {
        return createMethodDeclAdapter();
      }
      @Override
      public Adapter caseAttributeDecl(AttributeDecl object)
      {
        return createAttributeDeclAdapter();
      }
      @Override
      public Adapter caseAssociationDecl(AssociationDecl object)
      {
        return createAssociationDeclAdapter();
      }
      @Override
      public Adapter caseSequenceDecl(SequenceDecl object)
      {
        return createSequenceDeclAdapter();
      }
      @Override
      public Adapter caseSequenceSectionDecl(SequenceSectionDecl object)
      {
        return createSequenceSectionDeclAdapter();
      }
      @Override
      public Adapter caseActorSectionDecl(ActorSectionDecl object)
      {
        return createActorSectionDeclAdapter();
      }
      @Override
      public Adapter caseMessageSectionDecl(MessageSectionDecl object)
      {
        return createMessageSectionDeclAdapter();
      }
      @Override
      public Adapter caseActorDecl(ActorDecl object)
      {
        return createActorDeclAdapter();
      }
      @Override
      public Adapter caseMessageDecl(MessageDecl object)
      {
        return createMessageDeclAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.ClassDecl <em>Class Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.ClassDecl
   * @generated
   */
  public Adapter createClassDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.ClassMember <em>Class Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.ClassMember
   * @generated
   */
  public Adapter createClassMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.ClassSectionDecl <em>Class Section Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.ClassSectionDecl
   * @generated
   */
  public Adapter createClassSectionDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.VisibilityDecl <em>Visibility Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.VisibilityDecl
   * @generated
   */
  public Adapter createVisibilityDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.MethodDecl <em>Method Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.MethodDecl
   * @generated
   */
  public Adapter createMethodDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.AttributeDecl <em>Attribute Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.AttributeDecl
   * @generated
   */
  public Adapter createAttributeDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.AssociationDecl <em>Association Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.AssociationDecl
   * @generated
   */
  public Adapter createAssociationDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.SequenceDecl <em>Sequence Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.SequenceDecl
   * @generated
   */
  public Adapter createSequenceDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.SequenceSectionDecl <em>Sequence Section Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.SequenceSectionDecl
   * @generated
   */
  public Adapter createSequenceSectionDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.ActorSectionDecl <em>Actor Section Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.ActorSectionDecl
   * @generated
   */
  public Adapter createActorSectionDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.MessageSectionDecl <em>Message Section Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.MessageSectionDecl
   * @generated
   */
  public Adapter createMessageSectionDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.ActorDecl <em>Actor Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.ActorDecl
   * @generated
   */
  public Adapter createActorDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.frantz.txtuml.txtUML.MessageDecl <em>Message Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.frantz.txtuml.txtUML.MessageDecl
   * @generated
   */
  public Adapter createMessageDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TxtUMLAdapterFactory
