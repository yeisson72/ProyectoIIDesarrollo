/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import service.OficinaManager;

/**
 *
 * @author Yeisson
 */
public class OficinaController implements Controller{

    //Atributo
 private OficinaManager OficinaManager;
 protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1)
        throws ServletException, IOException, Exception {
	   String now = (new java.util.Date()).toString();
	   logger.info("returning view with " + now);

	   Map<String, Object> myModel = new HashMap<String, Object>();
	   myModel.put("now", now);
	   //Ingresa la lista de Objetos
	   myModel.put("resintos", this.OficinaManager.getOficinas());
								// ****** //
	   return new ModelAndView("resintoView", "model", myModel);
 }

    public void setResintoManager(OficinaManager OficinaManager) {
        this.OficinaManager = OficinaManager;
    }



}
