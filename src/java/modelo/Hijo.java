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
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_HIJO_MADRE) {
			this.madre = (modelo.Madre) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String ci;
	
	private modelo.Madre madre;
	
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
	
	public void setMadre(modelo.Madre value) {
		if (madre != null) {
			madre.hijos.remove(this);
		}
		if (value != null) {
			value.hijos.add(this);
		}
	}
	
	public modelo.Madre getMadre() {
		return madre;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Madre(modelo.Madre value) {
		this.madre = value;
	}
	
	private modelo.Madre getORM_Madre() {
		return madre;
	}
	
	public String toString() {
		return String.valueOf(getCi());
	}
	
}
