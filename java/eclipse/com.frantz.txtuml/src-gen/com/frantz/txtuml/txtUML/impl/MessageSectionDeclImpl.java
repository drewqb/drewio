/**
 */
package com.frantz.txtuml.txtUML.impl;

import com.frantz.txtuml.txtUML.MessageDecl;
import com.frantz.txtuml.txtUML.MessageSectionDecl;
import com.frantz.txtuml.txtUML.TxtUMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Section Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.MessageSectionDeclImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.MessageSectionDeclImpl#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageSectionDeclImpl extends SequenceSectionDeclImpl implements MessageSectionDecl
{
  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<MessageDecl> messages;

  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected EList<MessageDecl> actors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageSectionDeclImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TxtUMLPackage.Literals.MESSAGE_SECTION_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageDecl> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<MessageDecl>(MessageDecl.class, this, TxtUMLPackage.MESSAGE_SECTION_DECL__MESSAGES);
    }
    return messages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageDecl> getActors()
  {
    if (actors == null)
    {
      actors = new EObjectContainmentEList<MessageDecl>(MessageDecl.class, this, TxtUMLPackage.MESSAGE_SECTION_DECL__ACTORS);
    }
    return actors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TxtUMLPackage.MESSAGE_SECTION_DECL__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
      case TxtUMLPackage.MESSAGE_SECTION_DECL__ACTORS:
        return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TxtUMLPackage.MESSAGE_SECTION_DECL__MESSAGES:
        return getMessages();
      case TxtUMLPackage.MESSAGE_SECTION_DECL__ACTORS:
        return getActors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TxtUMLPackage.MESSAGE_SECTION_DECL__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends MessageDecl>)newValue);
        return;
      case TxtUMLPackage.MESSAGE_SECTION_DECL__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends MessageDecl>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TxtUMLPackage.MESSAGE_SECTION_DECL__MESSAGES:
        getMessages().clear();
        return;
      case TxtUMLPackage.MESSAGE_SECTION_DECL__ACTORS:
        getActors().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TxtUMLPackage.MESSAGE_SECTION_DECL__MESSAGES:
        return messages != null && !messages.isEmpty();
      case TxtUMLPackage.MESSAGE_SECTION_DECL__ACTORS:
        return actors != null && !actors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MessageSectionDeclImpl
