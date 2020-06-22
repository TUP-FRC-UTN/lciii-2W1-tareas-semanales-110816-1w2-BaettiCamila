
package inmobiliaria;

/**
 *
 * @author Artemidore
 */
public class Casa extends Propiedad {
    private boolean garaje;

    public Casa(String direccion, int cantHabitaciones, int cantInquilinos, float precioBase, boolean uso,boolean garaje) {
        super(direccion, cantHabitaciones, cantInquilinos, precioBase, uso);
        this.garaje = garaje;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public void condicionGaraje(){
        String garajes=" ";
        if(garaje==true){
            garajes="si";
        }
        else{garajes="no";}
        
    }
    
    @Override
    public void calcularPrecio(){
        float precio=0;
        if(super.isUso()==true){
        precio=super.precioBase+ 1000;
        }
        else{precio=super.precioBase;}
        
    }

}

    

    

        
    

