/**
 */
package diary.impl;

import diary.DiaryPackage;
import diary.Picture;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import java.util.Map.Entry;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diary.impl.PictureImpl#getId <em>Id</em>}</li>
 *   <li>{@link diary.impl.PictureImpl#getAufnahmedatumg <em>Aufnahmedatumg</em>}</li>
 *   <li>{@link diary.impl.PictureImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PictureImpl extends MinimalEObjectImpl.Container implements Picture {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAufnahmedatumg() <em>Aufnahmedatumg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufnahmedatumg()
	 * @generated
	 * @ordered
	 */
	protected static final Date AUFNAHMEDATUMG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAufnahmedatumg() <em>Aufnahmedatumg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufnahmedatumg()
	 * @generated
	 * @ordered
	 */
	protected Date aufnahmedatumg = AUFNAHMEDATUMG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, String>> metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PictureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiaryPackage.Literals.PICTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaryPackage.PICTURE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAufnahmedatumg() {
		return aufnahmedatumg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAufnahmedatumg(Date newAufnahmedatumg) {
		Date oldAufnahmedatumg = aufnahmedatumg;
		aufnahmedatumg = newAufnahmedatumg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaryPackage.PICTURE__AUFNAHMEDATUMG, oldAufnahmedatumg, aufnahmedatumg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Map.Entry<String, String>> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectResolvingEList<Map.Entry<String, String>>(Entry.class, this, DiaryPackage.PICTURE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiaryPackage.PICTURE__ID:
				return getId();
			case DiaryPackage.PICTURE__AUFNAHMEDATUMG:
				return getAufnahmedatumg();
			case DiaryPackage.PICTURE__METADATA:
				return getMetadata();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiaryPackage.PICTURE__ID:
				setId((String)newValue);
				return;
			case DiaryPackage.PICTURE__AUFNAHMEDATUMG:
				setAufnahmedatumg((Date)newValue);
				return;
			case DiaryPackage.PICTURE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Map.Entry<String, String>>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiaryPackage.PICTURE__ID:
				setId(ID_EDEFAULT);
				return;
			case DiaryPackage.PICTURE__AUFNAHMEDATUMG:
				setAufnahmedatumg(AUFNAHMEDATUMG_EDEFAULT);
				return;
			case DiaryPackage.PICTURE__METADATA:
				getMetadata().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiaryPackage.PICTURE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DiaryPackage.PICTURE__AUFNAHMEDATUMG:
				return AUFNAHMEDATUMG_EDEFAULT == null ? aufnahmedatumg != null : !AUFNAHMEDATUMG_EDEFAULT.equals(aufnahmedatumg);
			case DiaryPackage.PICTURE__METADATA:
				return metadata != null && !metadata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", aufnahmedatumg: ");
		result.append(aufnahmedatumg);
		result.append(')');
		return result.toString();
	}

} //PictureImpl
