
package inmobiliaria;

/**
 *
 * @author Artemidore
 */
public abstract class Propiedad {
    protected String direccion;
    protected int cantHabitaciones, cantInquilinos;
    protected float precioBase;
    protected boolean uso;

    public Propiedad(String direccion, int cantHabitaciones, int cantInquilinos, float precioBase, boolean uso) {
        this.direccion = direccion;
        this.cantHabitaciones = cantHabitaciones;
        this.cantInquilinos = cantInquilinos;
        this.precioBase = precioBase;
        this.uso = uso;
    }

    public Propiedad() {
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public int getCantInquilinos() {
        return cantInquilinos;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public boolean isUso() {
        return uso;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public void setCantInquilinos(int cantInquilinos) {
        this.cantInquilinos = cantInquilinos;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }
    
    public void calcularPrecio(){
        
    }
    public void toStringUso(){
        String usos;
        if(uso==true){
            usos="comercial";
    }
        else{usos="privado";}
    }
}
