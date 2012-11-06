/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Persona;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yeisson Herrera C.
 */
public interface PersonaManager extends Serializable{

    public List<Persona> getPersonas();

}
