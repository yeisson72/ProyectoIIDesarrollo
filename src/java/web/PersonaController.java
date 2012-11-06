/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import java.io.IOException;
import javax.servlet.ServletException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import service.PersonaManager;

/**
 *
 * @author Yeisson Herrera C.
 */
public class PersonaController implements Controller{

    //Atributo
 private PersonaManager PersonaManager;
 protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1)
            throws ServletException, IOException, Exception {
	   String now = (new java.util.Date()).toString();
	   logger.info("returning view with " + now);

	   Map<String, Object> myModel = new HashMap<String, Object>();
	   myModel.put("now", now);
	   //Ingresa la lista de Objetos
	   myModel.put("personas", this.PersonaManager.getPersonas());
								// ****** //
	   return new ModelAndView("personaView", "model", myModel);
    }

    public void setPersonaManager(PersonaManager PersonaManager) {
        this.PersonaManager = PersonaManager;
    }

    

}
