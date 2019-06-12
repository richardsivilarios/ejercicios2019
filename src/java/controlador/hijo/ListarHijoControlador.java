/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.hijo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import modelo.HijoDAO;
import modelo.Hijo;
import org.orm.PersistentException;
/**
 *
 * @author alumno
 */
@Controller
@RequestMapping("listarhijo")

public class ListarHijoControlador {
      @RequestMapping(method=RequestMethod.GET)
      public ModelAndView listarhijo(Model modelo){
          ModelAndView model = new ModelAndView();
          Hijo[]  hijos = null;
          try {
              hijos= HijoDAO.listHijoByQuery(null,null);
          } catch (PersistentException ex) {
              Logger.getLogger(ListarHijoControlador.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          modelo.addAttribute("mivariable",hijos);
          
      
         return model;
      }
      

}
