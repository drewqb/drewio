/**
 */
package com.frantz.drewio.drewIO.impl;

import com.frantz.drewio.drewIO.DrewIOPackage;
import com.frantz.drewio.drewIO.OnRecieved;
import com.frantz.drewio.drewIO.OutputStatement;
import com.frantz.drewio.drewIO.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.frantz.drewio.drewIO.impl.OutputStatementImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.frantz.drewio.drewIO.impl.OutputStatementImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputStatementImpl extends StatementImpl implements OutputStatement
{
  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<Statement> inputs;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<OnRecieved> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputStatementImpl()
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
    return DrewIOPackage.Literals.OUTPUT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectResolvingEList<Statement>(Statement.class, this, DrewIOPackage.OUTPUT_STATEMENT__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OnRecieved> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<OnRecieved>(OnRecieved.class, this, DrewIOPackage.OUTPUT_STATEMENT__METHODS);
    }
    return methods;
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
      case DrewIOPackage.OUTPUT_STATEMENT__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case DrewIOPackage.OUTPUT_STATEMENT__INPUTS:
        return getInputs();
      case DrewIOPackage.OUTPUT_STATEMENT__METHODS:
        return getMethods();
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
      case DrewIOPackage.OUTPUT_STATEMENT__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends Statement>)newValue);
        return;
      case DrewIOPackage.OUTPUT_STATEMENT__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends OnRecieved>)newValue);
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
      case DrewIOPackage.OUTPUT_STATEMENT__INPUTS:
        getInputs().clear();
        return;
      case DrewIOPackage.OUTPUT_STATEMENT__METHODS:
        getMethods().clear();
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
      case DrewIOPackage.OUTPUT_STATEMENT__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case DrewIOPackage.OUTPUT_STATEMENT__METHODS:
        return methods != null && !methods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OutputStatementImpl
