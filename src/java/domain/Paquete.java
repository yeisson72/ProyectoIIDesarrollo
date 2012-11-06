/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Yeisson Herrera C.
 */
public class Paquete implements Serializable{

  private String codigo;
  private String remitente;
  private String destinatario;
  private String peso;
  private String cobro;
  private String monto;
  private Resinto resintos;
  private List<Historial> historial;

    public Paquete(String codigo, String remitente, String destinatario, String peso, String cobro, String monto, Resinto resintos, List<Historial> historial) {
        this.codigo = codigo;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.peso = peso;
        this.cobro = cobro;
        this.monto = monto;
        this.resintos = resintos;
        this.historial = historial;
    }

    public Paquete() {
        this.codigo = "";
        this.remitente = "";
        this.destinatario = "";
        this.peso = "";
        this.cobro = "";
        this.monto = "";
        this.resintos = new Resinto();
        this.historial = new List<Historial>() {

            @Override
            public int size() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean isEmpty() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean contains(Object o) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Iterator<Historial> iterator() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Object[] toArray() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public <T> T[] toArray(T[] a) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean add(Historial e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean remove(Object o) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean addAll(Collection<? extends Historial> c) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean addAll(int index, Collection<? extends Historial> c) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Historial get(int index) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Historial set(int index, Historial element) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void add(int index, Historial element) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Historial remove(int index) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int indexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int lastIndexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public ListIterator<Historial> listIterator() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public ListIterator<Historial> listIterator(int index) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public List<Historial> subList(int fromIndex, int toIndex) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };

    }

    public String getCobro() {
        return cobro;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public List<Historial> getHistorial() {
        return historial;
    }

    public String getMonto() {
        return monto;
    }

    public String getPeso() {
        return peso;
    }

    public String getRemitente() {
        return remitente;
    }

    public Resinto getResintos() {
        return resintos;
    }

    public void setCobro(String cobro) {
        this.cobro = cobro;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setHistorial(List<Historial> historial) {
        this.historial = historial;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public void setResintos(Resinto resintos) {
        this.resintos = resintos;
    }



}
