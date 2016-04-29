/**
 */
package setup.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import base.impl.ModelElementImpl;
import setup.SetupPackage;
import setup.SetupTask;
import setup.SetupTaskContainer;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.SetupTaskContainerImpl#getSetupTasks <em>Setup Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SetupTaskContainerImpl extends ModelElementImpl implements SetupTaskContainer
{
  /**
   * The cached value of the '{@link #getSetupTasks() <em>Setup Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetupTasks()
   * @generated
   * @ordered
   */
  protected EList<SetupTask> setupTasks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetupTaskContainerImpl()
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
    return SetupPackage.Literals.SETUP_TASK_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SetupTask> getSetupTasks()
  {
    if (setupTasks == null)
    {
      setupTasks = new EObjectContainmentEList<SetupTask>(SetupTask.class, this, SetupPackage.SETUP_TASK_CONTAINER__SETUP_TASKS);
    }
    return setupTasks;
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
    case SetupPackage.SETUP_TASK_CONTAINER__SETUP_TASKS:
      return ((InternalEList<?>)getSetupTasks()).basicRemove(otherEnd, msgs);
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
    case SetupPackage.SETUP_TASK_CONTAINER__SETUP_TASKS:
      return getSetupTasks();
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
    case SetupPackage.SETUP_TASK_CONTAINER__SETUP_TASKS:
      getSetupTasks().clear();
      getSetupTasks().addAll((Collection<? extends SetupTask>)newValue);
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
    case SetupPackage.SETUP_TASK_CONTAINER__SETUP_TASKS:
      getSetupTasks().clear();
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
    case SetupPackage.SETUP_TASK_CONTAINER__SETUP_TASKS:
      return setupTasks != null && !setupTasks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // SetupTaskContainerImpl
