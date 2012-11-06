/*
 * Clase persona maneja empleados y clientes
 * Clientes tipo 1, Empleados: normal:3 y jefe: 2
 */

package domain;

import java.io.Serializable;

/**
 *
 * @author Yeisson Herrera C. 
 */
public class Persona implements Serializable{
    //Atributos
  private String cedula;
  private String nombre;
  private String telefono;
  private String opcervacion;
  private String tipo;

    public Persona(String cedula, String nombre, String telefono, String opcervacion, String tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.opcervacion = opcervacion;
        this.tipo = tipo;
    }

    public Persona() {
        this.cedula = "";
        this.nombre = "";
        this.telefono = "";
        this.opcervacion = "";
        this.tipo = "";
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOpcervacion() {
        return opcervacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOpcervacion(String opcervacion) {
        this.opcervacion = opcervacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

}
