/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Persona;
import java.util.List;

/**
 *
 * @author Yeisson Herrera C.
 */
public class SimplePersonaManager implements PersonaManager {

    //Atributos
  private List<Persona> personas;

    @Override
    public List<Persona> getPersonas() {
        return this.personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    

}
