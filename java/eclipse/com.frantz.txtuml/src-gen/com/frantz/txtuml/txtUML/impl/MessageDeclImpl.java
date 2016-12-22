/**
 */
package com.frantz.txtuml.txtUML.impl;

import com.frantz.txtuml.txtUML.ActorDecl;
import com.frantz.txtuml.txtUML.MessageDecl;
import com.frantz.txtuml.txtUML.MessageOperator;
import com.frantz.txtuml.txtUML.MethodDecl;
import com.frantz.txtuml.txtUML.TxtUMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.MessageDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.MessageDeclImpl#getLeftOp <em>Left Op</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.MessageDeclImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.MessageDeclImpl#getRighOp <em>Righ Op</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.MessageDeclImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageDeclImpl extends MinimalEObjectImpl.Container implements MessageDecl
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
   * The cached value of the '{@link #getLeftOp() <em>Left Op</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftOp()
   * @generated
   * @ordered
   */
  protected ActorDecl leftOp;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final MessageOperator OPERATOR_EDEFAULT = MessageOperator.RIGHT_MSG;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected MessageOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRighOp() <em>Righ Op</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRighOp()
   * @generated
   * @ordered
   */
  protected ActorDecl righOp;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected MethodDecl method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageDeclImpl()
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
    return TxtUMLPackage.Literals.MESSAGE_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TxtUMLPackage.MESSAGE_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorDecl getLeftOp()
  {
    if (leftOp != null && leftOp.eIsProxy())
    {
      InternalEObject oldLeftOp = (InternalEObject)leftOp;
      leftOp = (ActorDecl)eResolveProxy(oldLeftOp);
      if (leftOp != oldLeftOp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TxtUMLPackage.MESSAGE_DECL__LEFT_OP, oldLeftOp, leftOp));
      }
    }
    return leftOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorDecl basicGetLeftOp()
  {
    return leftOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftOp(ActorDecl newLeftOp)
  {
    ActorDecl oldLeftOp = leftOp;
    leftOp = newLeftOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TxtUMLPackage.MESSAGE_DECL__LEFT_OP, oldLeftOp, leftOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(MessageOperator newOperator)
  {
    MessageOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TxtUMLPackage.MESSAGE_DECL__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorDecl getRighOp()
  {
    if (righOp != null && righOp.eIsProxy())
    {
      InternalEObject oldRighOp = (InternalEObject)righOp;
      righOp = (ActorDecl)eResolveProxy(oldRighOp);
      if (righOp != oldRighOp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TxtUMLPackage.MESSAGE_DECL__RIGH_OP, oldRighOp, righOp));
      }
    }
    return righOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorDecl basicGetRighOp()
  {
    return righOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRighOp(ActorDecl newRighOp)
  {
    ActorDecl oldRighOp = righOp;
    righOp = newRighOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TxtUMLPackage.MESSAGE_DECL__RIGH_OP, oldRighOp, righOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDecl getMethod()
  {
    if (method != null && method.eIsProxy())
    {
      InternalEObject oldMethod = (InternalEObject)method;
      method = (MethodDecl)eResolveProxy(oldMethod);
      if (method != oldMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TxtUMLPackage.MESSAGE_DECL__METHOD, oldMethod, method));
      }
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDecl basicGetMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(MethodDecl newMethod)
  {
    MethodDecl oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TxtUMLPackage.MESSAGE_DECL__METHOD, oldMethod, method));
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
      case TxtUMLPackage.MESSAGE_DECL__NAME:
        return getName();
      case TxtUMLPackage.MESSAGE_DECL__LEFT_OP:
        if (resolve) return getLeftOp();
        return basicGetLeftOp();
      case TxtUMLPackage.MESSAGE_DECL__OPERATOR:
        return getOperator();
      case TxtUMLPackage.MESSAGE_DECL__RIGH_OP:
        if (resolve) return getRighOp();
        return basicGetRighOp();
      case TxtUMLPackage.MESSAGE_DECL__METHOD:
        if (resolve) return getMethod();
        return basicGetMethod();
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
      case TxtUMLPackage.MESSAGE_DECL__NAME:
        setName((String)newValue);
        return;
      case TxtUMLPackage.MESSAGE_DECL__LEFT_OP:
        setLeftOp((ActorDecl)newValue);
        return;
      case TxtUMLPackage.MESSAGE_DECL__OPERATOR:
        setOperator((MessageOperator)newValue);
        return;
      case TxtUMLPackage.MESSAGE_DECL__RIGH_OP:
        setRighOp((ActorDecl)newValue);
        return;
      case TxtUMLPackage.MESSAGE_DECL__METHOD:
        setMethod((MethodDecl)newValue);
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
      case TxtUMLPackage.MESSAGE_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TxtUMLPackage.MESSAGE_DECL__LEFT_OP:
        setLeftOp((ActorDecl)null);
        return;
      case TxtUMLPackage.MESSAGE_DECL__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case TxtUMLPackage.MESSAGE_DECL__RIGH_OP:
        setRighOp((ActorDecl)null);
        return;
      case TxtUMLPackage.MESSAGE_DECL__METHOD:
        setMethod((MethodDecl)null);
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
      case TxtUMLPackage.MESSAGE_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TxtUMLPackage.MESSAGE_DECL__LEFT_OP:
        return leftOp != null;
      case TxtUMLPackage.MESSAGE_DECL__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case TxtUMLPackage.MESSAGE_DECL__RIGH_OP:
        return righOp != null;
      case TxtUMLPackage.MESSAGE_DECL__METHOD:
        return method != null;
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
    result.append(", operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //MessageDeclImpl
