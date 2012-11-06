/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import service.SimpleResintoManager;

/** 
 *
 * @author Yeisson Herrera C.
 */
public class ResintoController implements Controller {


    //Atributo
 private SimpleResintoManager SimpleResintoManager;
 protected final Log logger = LogFactory.getLog(getClass());
/*
    public ResintoController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(ResintoManager.class);
        setCommandName("resinto");
        setSuccessView("model");
        setFormView("resintoView");
    }
    */
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1)
        throws ServletException, IOException, Exception {
	   String now = (new java.util.Date()).toString();
	   logger.info("returning view with " + now);

	   Map<String, Object> myModel = new HashMap<String, Object>();
	   myModel.put("now", now);
	   //Ingresa la lista de Objetos
	   myModel.put("resintos", this.SimpleResintoManager.getResintos());
								// ****** //
	   return new ModelAndView("resintoView", "model", myModel);
 }

    public void setResintoManager(SimpleResintoManager SimpleResintoManager) {
        this.SimpleResintoManager = SimpleResintoManager;
    }







}