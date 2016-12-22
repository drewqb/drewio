/**
 */
package com.frantz.txtuml.txtUML.impl;

import com.frantz.txtuml.txtUML.ClassMember;
import com.frantz.txtuml.txtUML.ClassSectionDecl;
import com.frantz.txtuml.txtUML.TxtUMLPackage;
import com.frantz.txtuml.txtUML.VisibilityDecl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Section Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.ClassSectionDeclImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.ClassSectionDeclImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassSectionDeclImpl extends MinimalEObjectImpl.Container implements ClassSectionDecl
{
  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected VisibilityDecl visibility;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<ClassMember> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassSectionDeclImpl()
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
    return TxtUMLPackage.Literals.CLASS_SECTION_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityDecl getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVisibility(VisibilityDecl newVisibility, NotificationChain msgs)
  {
    VisibilityDecl oldVisibility = visibility;
    visibility = newVisibility;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TxtUMLPackage.CLASS_SECTION_DECL__VISIBILITY, oldVisibility, newVisibility);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(VisibilityDecl newVisibility)
  {
    if (newVisibility != visibility)
    {
      NotificationChain msgs = null;
      if (visibility != null)
        msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TxtUMLPackage.CLASS_SECTION_DECL__VISIBILITY, null, msgs);
      if (newVisibility != null)
        msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TxtUMLPackage.CLASS_SECTION_DECL__VISIBILITY, null, msgs);
      msgs = basicSetVisibility(newVisibility, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TxtUMLPackage.CLASS_SECTION_DECL__VISIBILITY, newVisibility, newVisibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassMember> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<ClassMember>(ClassMember.class, this, TxtUMLPackage.CLASS_SECTION_DECL__MEMBERS);
    }
    return members;
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
      case TxtUMLPackage.CLASS_SECTION_DECL__VISIBILITY:
        return basicSetVisibility(null, msgs);
      case TxtUMLPackage.CLASS_SECTION_DECL__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case TxtUMLPackage.CLASS_SECTION_DECL__VISIBILITY:
        return getVisibility();
      case TxtUMLPackage.CLASS_SECTION_DECL__MEMBERS:
        return getMembers();
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
      case TxtUMLPackage.CLASS_SECTION_DECL__VISIBILITY:
        setVisibility((VisibilityDecl)newValue);
        return;
      case TxtUMLPackage.CLASS_SECTION_DECL__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends ClassMember>)newValue);
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
      case TxtUMLPackage.CLASS_SECTION_DECL__VISIBILITY:
        setVisibility((VisibilityDecl)null);
        return;
      case TxtUMLPackage.CLASS_SECTION_DECL__MEMBERS:
        getMembers().clear();
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
      case TxtUMLPackage.CLASS_SECTION_DECL__VISIBILITY:
        return visibility != null;
      case TxtUMLPackage.CLASS_SECTION_DECL__MEMBERS:
        return members != null && !members.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassSectionDeclImpl
