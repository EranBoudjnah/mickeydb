/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.Case;
import com.justeat.mickeydb.mickeyLang.Expression;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.CaseImpl#getWhenExpression <em>When Expression</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.CaseImpl#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseImpl extends MinimalEObjectImpl.Container implements Case
{
  /**
   * The cached value of the '{@link #getWhenExpression() <em>When Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhenExpression()
   * @generated
   * @ordered
   */
  protected Expression whenExpression;

  /**
   * The cached value of the '{@link #getThenExpression() <em>Then Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenExpression()
   * @generated
   * @ordered
   */
  protected Expression thenExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseImpl()
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
    return MickeyLangPackage.Literals.CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getWhenExpression()
  {
    return whenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhenExpression(Expression newWhenExpression, NotificationChain msgs)
  {
    Expression oldWhenExpression = whenExpression;
    whenExpression = newWhenExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MickeyLangPackage.CASE__WHEN_EXPRESSION, oldWhenExpression, newWhenExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhenExpression(Expression newWhenExpression)
  {
    if (newWhenExpression != whenExpression)
    {
      NotificationChain msgs = null;
      if (whenExpression != null)
        msgs = ((InternalEObject)whenExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MickeyLangPackage.CASE__WHEN_EXPRESSION, null, msgs);
      if (newWhenExpression != null)
        msgs = ((InternalEObject)newWhenExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MickeyLangPackage.CASE__WHEN_EXPRESSION, null, msgs);
      msgs = basicSetWhenExpression(newWhenExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.CASE__WHEN_EXPRESSION, newWhenExpression, newWhenExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getThenExpression()
  {
    return thenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenExpression(Expression newThenExpression, NotificationChain msgs)
  {
    Expression oldThenExpression = thenExpression;
    thenExpression = newThenExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MickeyLangPackage.CASE__THEN_EXPRESSION, oldThenExpression, newThenExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenExpression(Expression newThenExpression)
  {
    if (newThenExpression != thenExpression)
    {
      NotificationChain msgs = null;
      if (thenExpression != null)
        msgs = ((InternalEObject)thenExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MickeyLangPackage.CASE__THEN_EXPRESSION, null, msgs);
      if (newThenExpression != null)
        msgs = ((InternalEObject)newThenExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MickeyLangPackage.CASE__THEN_EXPRESSION, null, msgs);
      msgs = basicSetThenExpression(newThenExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.CASE__THEN_EXPRESSION, newThenExpression, newThenExpression));
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
      case MickeyLangPackage.CASE__WHEN_EXPRESSION:
        return basicSetWhenExpression(null, msgs);
      case MickeyLangPackage.CASE__THEN_EXPRESSION:
        return basicSetThenExpression(null, msgs);
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
      case MickeyLangPackage.CASE__WHEN_EXPRESSION:
        return getWhenExpression();
      case MickeyLangPackage.CASE__THEN_EXPRESSION:
        return getThenExpression();
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
      case MickeyLangPackage.CASE__WHEN_EXPRESSION:
        setWhenExpression((Expression)newValue);
        return;
      case MickeyLangPackage.CASE__THEN_EXPRESSION:
        setThenExpression((Expression)newValue);
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
      case MickeyLangPackage.CASE__WHEN_EXPRESSION:
        setWhenExpression((Expression)null);
        return;
      case MickeyLangPackage.CASE__THEN_EXPRESSION:
        setThenExpression((Expression)null);
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
      case MickeyLangPackage.CASE__WHEN_EXPRESSION:
        return whenExpression != null;
      case MickeyLangPackage.CASE__THEN_EXPRESSION:
        return thenExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //CaseImpl
