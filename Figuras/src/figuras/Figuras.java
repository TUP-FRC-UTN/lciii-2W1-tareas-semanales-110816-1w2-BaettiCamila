

package figuras;
import java.util.Scanner;

public abstract class Figuras {
    protected String nombre;
    protected float superficie;
    protected float perimetro;

    public String getNombre() {
        return nombre;
    }

    public float getSuperficie() {
        return superficie;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Figuras{" + "nombre=" + nombre + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }

    public abstract float CalcularPerimetro();
    public abstract float CalcularSuperficie();
    
    
    public static void main(String[] args) {
        int Asuperficie=0;
        String MayNombre="";
        float MayPerimetro=0;
        boolean flag= false;
        
        Scanner sc= new Scanner(System.in);
        Figuras fig[]= new Figuras[3];
        
        fig[0]= new Triangulo(1f,2f,3f,4f);
        fig[0].nombre="Triangulo 1";
        fig[1]= new Circulo(12f);
        fig[1].nombre="Circulo 1";
        fig[2]= new Triangulo(2f,3f,4f,5f);
        fig[2].nombre="Triangulo 2";
        
        for(Figuras f:fig){
           
            
            
            
            System.out.println(f.toString());
            Asuperficie+= f.CalcularSuperficie();
            
            System.out.println("El perimetro de la figura es:" +f.CalcularPerimetro());
            System.out.println("La superficie de la figura es:"+ f.CalcularSuperficie());
            
            if(f instanceof Triangulo){
            if (flag==false){
                MayNombre= f.nombre;
                MayPerimetro=f.CalcularPerimetro();
                
            }
            else{
                if(MayPerimetro>f.CalcularPerimetro()){
                    MayNombre= f.nombre;
                    MayPerimetro=f.CalcularPerimetro();
                }
            }
            }
        }
        System.out.println("El valor acumulado de los perimetros es:"+ Asuperficie);
        System.out.println("El triangulo con mayor perimetro es:"+ MayNombre);
            
            
        }
    }
    

