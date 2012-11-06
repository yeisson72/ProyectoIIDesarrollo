/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;

/**
 *
 * @author Macho
 */
public class Vehiculo implements Serializable{

    private String ruta;
  private String placa;

  public Vehiculo() {
	this.ruta = "";
    this.placa = "yko404";
  }
  public Vehiculo(String placa, String ruta ) {
        this.ruta = ruta;
        this.placa = placa;
    }
  public void setruta(String ruta) {this.ruta = ruta;}
  public void setplaca(String placa) {this.placa = placa;}
  public String getruta() { return ruta; }
  public String getplaca() { return placa; }
}
