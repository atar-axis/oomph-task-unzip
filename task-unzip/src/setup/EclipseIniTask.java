/**
 */
package setup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse Ini Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.EclipseIniTask#getOption <em>Option</em>}</li>
 *   <li>{@link setup.EclipseIniTask#getValue <em>Value</em>}</li>
 *   <li>{@link setup.EclipseIniTask#isVm <em>Vm</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getEclipseIniTask()
 * @model
 * @generated
 */
public interface EclipseIniTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute.
   * @see #setOption(String)
   * @see setup.SetupPackage#getEclipseIniTask_Option()
   * @model required="true"
   * @generated
   */
  String getOption();

  /**
   * Sets the value of the '{@link setup.EclipseIniTask#getOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see #getOption()
   * @generated
   */
  void setOption(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see setup.SetupPackage#getEclipseIniTask_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link setup.EclipseIniTask#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Vm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vm</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vm</em>' attribute.
   * @see #setVm(boolean)
   * @see setup.SetupPackage#getEclipseIniTask_Vm()
   * @model
   * @generated
   */
  boolean isVm();

  /**
   * Sets the value of the '{@link setup.EclipseIniTask#isVm <em>Vm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vm</em>' attribute.
   * @see #isVm()
   * @generated
   */
  void setVm(boolean value);

} // EclipseIniTask
