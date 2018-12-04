/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.mymix.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.mymix.Cup;
import org.xtext.example.mydsl.mymix.MymixPackage;
import org.xtext.example.mydsl.mymix.PutAll;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Put All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mymix.impl.PutAllImpl#getCup <em>Cup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PutAllImpl extends MinimalEObjectImpl.Container implements PutAll
{
  /**
   * The cached value of the '{@link #getCup() <em>Cup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCup()
   * @generated
   * @ordered
   */
  protected Cup cup;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PutAllImpl()
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
    return MymixPackage.Literals.PUT_ALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cup getCup()
  {
    return cup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCup(Cup newCup, NotificationChain msgs)
  {
    Cup oldCup = cup;
    cup = newCup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MymixPackage.PUT_ALL__CUP, oldCup, newCup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCup(Cup newCup)
  {
    if (newCup != cup)
    {
      NotificationChain msgs = null;
      if (cup != null)
        msgs = ((InternalEObject)cup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MymixPackage.PUT_ALL__CUP, null, msgs);
      if (newCup != null)
        msgs = ((InternalEObject)newCup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MymixPackage.PUT_ALL__CUP, null, msgs);
      msgs = basicSetCup(newCup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MymixPackage.PUT_ALL__CUP, newCup, newCup));
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
      case MymixPackage.PUT_ALL__CUP:
        return basicSetCup(null, msgs);
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
      case MymixPackage.PUT_ALL__CUP:
        return getCup();
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
      case MymixPackage.PUT_ALL__CUP:
        setCup((Cup)newValue);
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
      case MymixPackage.PUT_ALL__CUP:
        setCup((Cup)null);
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
      case MymixPackage.PUT_ALL__CUP:
        return cup != null;
    }
    return super.eIsSet(featureID);
  }

} //PutAllImpl
