/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.ContentUriParamSegment;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Uri Param Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.ContentUriParamSegmentImpl#isNum <em>Num</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.ContentUriParamSegmentImpl#isText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentUriParamSegmentImpl extends ContentUriSegmentImpl implements ContentUriParamSegment
{
  /**
   * The default value of the '{@link #isNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNum()
   * @generated
   * @ordered
   */
  protected static final boolean NUM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNum()
   * @generated
   * @ordered
   */
  protected boolean num = NUM_EDEFAULT;

  /**
   * The default value of the '{@link #isText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isText()
   * @generated
   * @ordered
   */
  protected static final boolean TEXT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isText()
   * @generated
   * @ordered
   */
  protected boolean text = TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentUriParamSegmentImpl()
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
    return MickeyLangPackage.Literals.CONTENT_URI_PARAM_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(boolean newNum)
  {
    boolean oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__NUM, oldNum, num));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(boolean newText)
  {
    boolean oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__TEXT, oldText, text));
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
      case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__NUM:
        return isNum();
      case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__TEXT:
        return isText();
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
      case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__NUM:
        setNum((Boolean)newValue);
        return;
      case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__TEXT:
        setText((Boolean)newValue);
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
      case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__TEXT:
        setText(TEXT_EDEFAULT);
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
      case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__NUM:
        return num != NUM_EDEFAULT;
      case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT__TEXT:
        return text != TEXT_EDEFAULT;
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
    result.append(" (num: ");
    result.append(num);
    result.append(", text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //ContentUriParamSegmentImpl
