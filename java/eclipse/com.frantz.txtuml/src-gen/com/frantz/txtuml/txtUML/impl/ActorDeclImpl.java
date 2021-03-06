/**
 */
package com.frantz.txtuml.txtUML.impl;

import com.frantz.txtuml.txtUML.ActorDecl;
import com.frantz.txtuml.txtUML.ClassDecl;
import com.frantz.txtuml.txtUML.TxtUMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.ActorDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.ActorDeclImpl#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorDeclImpl extends MinimalEObjectImpl.Container implements ActorDecl
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRef()
   * @generated
   * @ordered
   */
  protected ClassDecl classRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorDeclImpl()
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
    return TxtUMLPackage.Literals.ACTOR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TxtUMLPackage.ACTOR_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDecl getClassRef()
  {
    if (classRef != null && classRef.eIsProxy())
    {
      InternalEObject oldClassRef = (InternalEObject)classRef;
      classRef = (ClassDecl)eResolveProxy(oldClassRef);
      if (classRef != oldClassRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TxtUMLPackage.ACTOR_DECL__CLASS_REF, oldClassRef, classRef));
      }
    }
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDecl basicGetClassRef()
  {
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassRef(ClassDecl newClassRef)
  {
    ClassDecl oldClassRef = classRef;
    classRef = newClassRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TxtUMLPackage.ACTOR_DECL__CLASS_REF, oldClassRef, classRef));
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
      case TxtUMLPackage.ACTOR_DECL__NAME:
        return getName();
      case TxtUMLPackage.ACTOR_DECL__CLASS_REF:
        if (resolve) return getClassRef();
        return basicGetClassRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TxtUMLPackage.ACTOR_DECL__NAME:
        setName((String)newValue);
        return;
      case TxtUMLPackage.ACTOR_DECL__CLASS_REF:
        setClassRef((ClassDecl)newValue);
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
      case TxtUMLPackage.ACTOR_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TxtUMLPackage.ACTOR_DECL__CLASS_REF:
        setClassRef((ClassDecl)null);
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
      case TxtUMLPackage.ACTOR_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TxtUMLPackage.ACTOR_DECL__CLASS_REF:
        return classRef != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActorDeclImpl
