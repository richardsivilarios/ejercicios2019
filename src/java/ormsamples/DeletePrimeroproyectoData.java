/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeletePrimeroproyectoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = modelo.PrimeroproyectoPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Madre lmodeloMadre = modelo.MadreDAO.loadMadreByQuery(null, null);
			// Delete the persistent object
			modelo.MadreDAO.delete(lmodeloMadre);
			modelo.Hijo lmodeloHijo = modelo.HijoDAO.loadHijoByQuery(null, null);
			// Delete the persistent object
			modelo.HijoDAO.delete(lmodeloHijo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeletePrimeroproyectoData deletePrimeroproyectoData = new DeletePrimeroproyectoData();
			try {
				deletePrimeroproyectoData.deleteTestData();
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
