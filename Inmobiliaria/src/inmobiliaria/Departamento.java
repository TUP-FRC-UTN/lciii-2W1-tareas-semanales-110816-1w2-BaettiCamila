
package inmobiliaria;

/**
 *
 * @author Artemidore
 */
public class Departamento extends Propiedad{
    private float expensas;

    public Departamento(float expensas, String direccion, int cantHabitaciones, int cantInquilinos, float precioBase, boolean uso) {
        super(direccion, cantHabitaciones, cantInquilinos, precioBase, uso);
        this.expensas = expensas;
    }

    public Departamento(float expensas) {
        this.expensas = expensas;
    }

    public float getExpensas() {
        return expensas;
    }

    public void setExpensas(float expensas) {
        this.expensas = expensas;
    }
    
    @Override
    public void calcularPrecio(){
        float precio=0;
        if(super.isUso()==true){
        precio= super.precioBase+ expensas+ 500;
        }
        else{precio= super.precioBase+ expensas;}
        
    }
}
