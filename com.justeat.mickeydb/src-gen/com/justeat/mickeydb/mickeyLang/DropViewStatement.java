/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop View Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.DropViewStatement#isIfExists <em>If Exists</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.DropViewStatement#getView <em>View</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getDropViewStatement()
 * @model
 * @generated
 */
public interface DropViewStatement extends DDLStatement
{
  /**
   * Returns the value of the '<em><b>If Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Exists</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Exists</em>' attribute.
   * @see #setIfExists(boolean)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getDropViewStatement_IfExists()
   * @model
   * @generated
   */
  boolean isIfExists();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.DropViewStatement#isIfExists <em>If Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Exists</em>' attribute.
   * @see #isIfExists()
   * @generated
   */
  void setIfExists(boolean value);

  /**
   * Returns the value of the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View</em>' reference.
   * @see #setView(CreateViewStatement)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getDropViewStatement_View()
   * @model
   * @generated
   */
  CreateViewStatement getView();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.DropViewStatement#getView <em>View</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View</em>' reference.
   * @see #getView()
   * @generated
   */
  void setView(CreateViewStatement value);

} // DropViewStatement
