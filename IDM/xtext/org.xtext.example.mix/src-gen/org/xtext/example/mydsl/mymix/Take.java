/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.mymix;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Take</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mymix.Take#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mymix.Take#getCup <em>Cup</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mymix.Take#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mymix.MymixPackage#getTake()
 * @model
 * @generated
 */
public interface Take extends EObject
{
  /**
   * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity</em>' containment reference.
   * @see #setQuantity(Quantity)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getTake_Quantity()
   * @model containment="true"
   * @generated
   */
  Quantity getQuantity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.Take#getQuantity <em>Quantity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity</em>' containment reference.
   * @see #getQuantity()
   * @generated
   */
  void setQuantity(Quantity value);

  /**
   * Returns the value of the '<em><b>Cup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cup</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cup</em>' containment reference.
   * @see #setCup(Cup)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getTake_Cup()
   * @model containment="true"
   * @generated
   */
  Cup getCup();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.Take#getCup <em>Cup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cup</em>' containment reference.
   * @see #getCup()
   * @generated
   */
  void setCup(Cup value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(Filter)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getTake_Filter()
   * @model containment="true"
   * @generated
   */
  Filter getFilter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.Take#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(Filter value);

} // Take
