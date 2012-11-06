/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Vehiculo;
import java.util.List;

/**
 *
 * @author Yeisson Herera C.
 */
public class SimpleVehiculoManager implements VehiculoManager{

    private List<Vehiculo> vehiculos;

    @Override
    public List<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    

}
