/**
 */
package diary;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diary.Picture#getId <em>Id</em>}</li>
 *   <li>{@link diary.Picture#getAufnahmedatumg <em>Aufnahmedatumg</em>}</li>
 *   <li>{@link diary.Picture#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see diary.DiaryPackage#getPicture()
 * @model
 * @generated
 */
public interface Picture extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see diary.DiaryPackage#getPicture_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link diary.Picture#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Aufnahmedatumg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aufnahmedatumg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aufnahmedatumg</em>' attribute.
	 * @see #setAufnahmedatumg(Date)
	 * @see diary.DiaryPackage#getPicture_Aufnahmedatumg()
	 * @model
	 * @generated
	 */
	Date getAufnahmedatumg();

	/**
	 * Sets the value of the '{@link diary.Picture#getAufnahmedatumg <em>Aufnahmedatumg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufnahmedatumg</em>' attribute.
	 * @see #getAufnahmedatumg()
	 * @generated
	 */
	void setAufnahmedatumg(Date value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}&lt;java.lang.String, java.lang.String>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' reference list.
	 * @see diary.DiaryPackage#getPicture_Metadata()
	 * @model mapType="diary.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EList<Map.Entry<String, String>> getMetadata();

} // Picture
