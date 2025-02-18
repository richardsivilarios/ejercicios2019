/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreatePrimeroproyectoData {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = modelo.PrimeroproyectoPersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('1', 'maria', 'perez')");
					statement.executeUpdate("INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('2', 'carla', 'suarez')");
					statement.executeUpdate("INSERT INTO Madre(Ci, Nombre, Apellido) VALUES ('3', 'daniela', 'rios')");
					statement.executeUpdate("INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('1', '1', 'filemon')");
					statement.executeUpdate("INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('2', '1', 'ricardo')");
					statement.executeUpdate("INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('3', '2', 'manuel')");
					statement.executeUpdate("INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('4', '2', 'carlos')");
					statement.executeUpdate("INSERT INTO Hijo(Ci, MadreCi, Nombre) VALUES ('5', '2', 'gonzalo')");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = modelo.PrimeroproyectoPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Madre lmodeloMadre = modelo.MadreDAO.createMadre();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hijos, ci
			modelo.MadreDAO.save(lmodeloMadre);
			modelo.Hijo lmodeloHijo = modelo.HijoDAO.createHijo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : madre, ci
			modelo.HijoDAO.save(lmodeloHijo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreatePrimeroproyectoData createPrimeroproyectoData = new CreatePrimeroproyectoData();
			try {
				createPrimeroproyectoData.createTestData();
			}
			finally {
				modelo.PrimeroproyectoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
