/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import domain.Vehiculo;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yeisson Herrera C
 */
public interface VehiculoManager extends Serializable{

    public List<Vehiculo> getVehiculos();

}
