/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.mymix;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mymix.Wait#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mymix.MymixPackage#getWait()
 * @model
 * @generated
 */
public interface Wait extends Operation
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(Time)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getWait_Time()
   * @model containment="true"
   * @generated
   */
  Time getTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.Wait#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(Time value);

} // Wait
