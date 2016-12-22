/**
 */
package com.frantz.txtuml.txtUML.impl;

import com.frantz.txtuml.txtUML.ActorDecl;
import com.frantz.txtuml.txtUML.ActorSectionDecl;
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
 * An implementation of the model object '<em><b>Actor Section Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.ActorSectionDeclImpl#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorSectionDeclImpl extends SequenceSectionDeclImpl implements ActorSectionDecl
{
  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected EList<ActorDecl> actors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorSectionDeclImpl()
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
    return TxtUMLPackage.Literals.ACTOR_SECTION_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActorDecl> getActors()
  {
    if (actors == null)
    {
      actors = new EObjectContainmentEList<ActorDecl>(ActorDecl.class, this, TxtUMLPackage.ACTOR_SECTION_DECL__ACTORS);
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
      case TxtUMLPackage.ACTOR_SECTION_DECL__ACTORS:
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
      case TxtUMLPackage.ACTOR_SECTION_DECL__ACTORS:
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
      case TxtUMLPackage.ACTOR_SECTION_DECL__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends ActorDecl>)newValue);
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
      case TxtUMLPackage.ACTOR_SECTION_DECL__ACTORS:
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
      case TxtUMLPackage.ACTOR_SECTION_DECL__ACTORS:
        return actors != null && !actors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActorSectionDeclImpl
