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

public class MadreDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression ci;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final CollectionExpression hijos;
	
	public MadreDetachedCriteria() {
		super(modelo.Madre.class, modelo.MadreCriteria.class);
		ci = new StringExpression("ci", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		hijos = new CollectionExpression("ORM_Hijos", this.getDetachedCriteria());
	}
	
	public MadreDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.MadreCriteria.class);
		ci = new StringExpression("ci", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		hijos = new CollectionExpression("ORM_Hijos", this.getDetachedCriteria());
	}
	
	public HijoDetachedCriteria createHijosCriteria() {
		return new HijoDetachedCriteria(createCriteria("ORM_Hijos"));
	}
	
	public Madre uniqueMadre(PersistentSession session) {
		return (Madre) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Madre[] listMadre(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Madre[]) list.toArray(new Madre[list.size()]);
	}
}

