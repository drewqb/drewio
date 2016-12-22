/**
 */
package com.frantz.txtuml.txtUML.impl;

import com.frantz.txtuml.txtUML.ClassDecl;
import com.frantz.txtuml.txtUML.ClassSectionDecl;
import com.frantz.txtuml.txtUML.TxtUMLPackage;

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
 * An implementation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.ClassDeclImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link com.frantz.txtuml.txtUML.impl.ClassDeclImpl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDeclImpl extends StatementImpl implements ClassDecl
{
  /**
   * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInherits()
   * @generated
   * @ordered
   */
  protected EList<ClassDecl> inherits;

  /**
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<ClassSectionDecl> sections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassDeclImpl()
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
    return TxtUMLPackage.Literals.CLASS_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassDecl> getInherits()
  {
    if (inherits == null)
    {
      inherits = new EObjectResolvingEList<ClassDecl>(ClassDecl.class, this, TxtUMLPackage.CLASS_DECL__INHERITS);
    }
    return inherits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassSectionDecl> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<ClassSectionDecl>(ClassSectionDecl.class, this, TxtUMLPackage.CLASS_DECL__SECTIONS);
    }
    return sections;
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
      case TxtUMLPackage.CLASS_DECL__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
      case TxtUMLPackage.CLASS_DECL__INHERITS:
        return getInherits();
      case TxtUMLPackage.CLASS_DECL__SECTIONS:
        return getSections();
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
      case TxtUMLPackage.CLASS_DECL__INHERITS:
        getInherits().clear();
        getInherits().addAll((Collection<? extends ClassDecl>)newValue);
        return;
      case TxtUMLPackage.CLASS_DECL__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends ClassSectionDecl>)newValue);
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
      case TxtUMLPackage.CLASS_DECL__INHERITS:
        getInherits().clear();
        return;
      case TxtUMLPackage.CLASS_DECL__SECTIONS:
        getSections().clear();
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
      case TxtUMLPackage.CLASS_DECL__INHERITS:
        return inherits != null && !inherits.isEmpty();
      case TxtUMLPackage.CLASS_DECL__SECTIONS:
        return sections != null && !sections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassDeclImpl
