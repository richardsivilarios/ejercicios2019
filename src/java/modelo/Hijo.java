/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package modelo;

import java.io.Serializable;
public class Hijo implements Serializable {
	public Hijo() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Hijo))
			return false;
		Hijo hijo = (Hijo)aObj;
		if ((getCi() != null && !getCi().equals(hijo.getCi())) || (getCi() == null && hijo.getCi() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getCi() == null ? 0 : getCi().hashCode());
		return hashcode;
	}
	
	private String ci;
	
	private String nombre;
	
	public void setCi(String value) {
		this.ci = value;
	}
	
	public String getCi() {
		return ci;
	}
	
	public String getORMID() {
		return getCi();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return String.valueOf(getCi());
	}
	
}
