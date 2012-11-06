/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Paquete;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yeisson Herrera C.
 */
public interface PaqueteManager extends Serializable{

    public List<Paquete> getPaquetes();

}
