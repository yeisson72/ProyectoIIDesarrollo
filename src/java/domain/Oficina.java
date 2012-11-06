/*
 * Clase Oficina maneja los datos importantes de una oficina
 * de correo
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
public class Oficina implements Serializable{
    private String codigo;
  private String telefono;
  private Resinto resinto;
  private Persona persona;
  private List<Vehiculo> vehiculo;

    public Oficina(String codigo, String telefono, Resinto resinto, Persona persona, List<Vehiculo> vehiculo) {
        this.codigo = codigo;
        this.telefono = telefono;
        this.resinto = resinto;
        this.persona = persona;
        this.vehiculo = vehiculo;
    }


    

    public Oficina() {
        this.codigo = "";
        this.telefono = "";
        this.resinto = new Resinto();
        this.persona = new Persona();
        this.vehiculo = new List<Vehiculo>() {

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
            public Iterator<Vehiculo> iterator() {
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
            public boolean add(Vehiculo e) {
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
            public boolean addAll(Collection<? extends Vehiculo> c) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public boolean addAll(int index, Collection<? extends Vehiculo> c) {
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
            public Vehiculo get(int index) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Vehiculo set(int index, Vehiculo element) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void add(int index, Vehiculo element) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Vehiculo remove(int index) {
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
            public ListIterator<Vehiculo> listIterator() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public ListIterator<Vehiculo> listIterator(int index) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public List<Vehiculo> subList(int fromIndex, int toIndex) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }

    public String getCodigo() {
        return codigo;
    }

    public Persona getPersona() {
        return persona;
    }

    public Resinto getResinto() {
        return resinto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setResinto(Resinto resinto) {
        this.resinto = resinto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(List<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }



    


}
