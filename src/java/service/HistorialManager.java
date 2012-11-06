/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Historial;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yeisson Herrera C.
 */
public interface HistorialManager extends Serializable{

    public List<Historial> getHistoriales();

}
