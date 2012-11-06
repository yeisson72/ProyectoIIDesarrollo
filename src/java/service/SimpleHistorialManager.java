/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Historial;
import java.util.List;

/**
 *
 * @author Macho
 */
public class SimpleHistorialManager implements HistorialManager{

    private List<Historial> histriales;

    @Override
    public List<Historial> getHistoriales() {
        return this.histriales;
    }

    public void setHistriales(List<Historial> histriales) {
        this.histriales = histriales;
    }

}
