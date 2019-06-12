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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class HijoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression ci;
	public final StringExpression nombre;
	
	public HijoDetachedCriteria() {
		super(modelo.Hijo.class, modelo.HijoCriteria.class);
		ci = new StringExpression("ci", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
	}
	
	public HijoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.HijoCriteria.class);
		ci = new StringExpression("ci", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
	}
	
	public Hijo uniqueHijo(PersistentSession session) {
		return (Hijo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hijo[] listHijo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hijo[]) list.toArray(new Hijo[list.size()]);
	}
}

