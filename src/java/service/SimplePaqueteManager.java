/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Paquete;
import java.util.List;

/**
 *
 * @author Yeisson Herrera C.
 */
public class SimplePaqueteManager implements PaqueteManager{

    private List<Paquete> paquetes;


    @Override
    public List<Paquete> getPaquetes() {
        return this.paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    

}
