/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Oficina;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Macho
 */
public interface OficinaManager extends Serializable{

    public List<Oficina> getOficinas();

}
