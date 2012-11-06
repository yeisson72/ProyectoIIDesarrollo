/*
 * Clase Resinto maneja la ubicación fisica
 */

package domain;

import java.io.Serializable;

/**
 *
 * @author Yeisson Hererra C.
 */
public class Resinto implements Serializable{
    //Atributos
  private String codigo;
  private String zona;
  private String calle;
  private String avenida;
  private String distancia;
  private String latitud;
  private String longitud;
  private String razon_social;

    public Resinto(String codigo, String zona, String calle, String avenida, String distancia, String latitud, String longitud, String razon_social) {
        this.codigo = codigo;
        this.zona = zona;
        this.calle = calle;
        this.avenida = avenida;
        this.distancia = distancia;
        this.latitud = latitud;
        this.longitud = longitud;
        this.razon_social = razon_social;
    }

    public Resinto() {
        this.codigo = "";
        this.zona = "";
        this.calle = "";
        this.avenida = "";
        this.distancia = "";
        this.latitud = "";
        this.longitud = "";
        this.razon_social = "";
    }
   //Metodos Obtener
    public String getAvenida() {
        return avenida;
    }

    public String getCalle() {
        return calle;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDistancia() {
        return distancia;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public String getZona() {
        return zona;
    }
    //Metodos Establecer
    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }


}
