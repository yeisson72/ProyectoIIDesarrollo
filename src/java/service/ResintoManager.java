/*
 * Interfaz para el objeto Resinto
 * me obtiene una lista de registros
 */

package service;

import domain.Resinto;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yeisson Herrera Carmona
 */
public interface ResintoManager extends Serializable{

    public List<Resinto> getResintos();


}
