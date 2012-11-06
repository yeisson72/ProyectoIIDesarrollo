/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Oficina;
import java.util.List;

/**
 *
 * @author Yeisson Herrera C.
 */
public class SimpleOficinaManager implements OficinaManager{

    //Atributo
    private List<Oficina> oficinas;

    @Override
    public List<Oficina> getOficinas() {
        return this.oficinas;
    }

    public void setOficinas(List<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    

}
