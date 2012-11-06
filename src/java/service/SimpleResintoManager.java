/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Resinto;
import java.util.List;

/**
 *
 * @author Yeisson Herrera
 */
public class SimpleResintoManager implements ResintoManager{

    //Atributos
  private List<Resinto> resintos;

    @Override
    public List<Resinto> getResintos() {
        return this.resintos;
    }

    public void setResintos(List<Resinto> resintos) {
        this.resintos = resintos;
    }

}
