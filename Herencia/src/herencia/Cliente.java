/*
 1. En un comercio se mantienen los datos de sus clientes, algunos de los
cuales son de confianza suficiente para comprar al fiado. Programar dos clases
llamadas Cliente y ClientePreferencial respectivamente aplicando herencia.
Sobreescribir el método toString e incluir constructores con parámetros en cada una
de ellas.
De cada cliente se conoce su número, nombre y teléfono, mientras que de los
clientes preferenciales se conoce adicionalmente su saldo, límite (saldo máximo) y
su domicilio.
 */
package herencia;
    

public class Cliente {
        protected int numero;
        protected String nombre;
        protected int telefono;

    public Cliente(int numero, String nombre, int telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
        
}
