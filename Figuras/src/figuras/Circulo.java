
package figuras;


public class Circulo extends Figuras{

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
    @Override
    public float CalcularPerimetro() {
        float perimetro;
        perimetro = (float) ((2)*Math.PI*radio);
        return perimetro;
    }

    @Override
    public float CalcularSuperficie() {
        float superficie;
        superficie= (float) Math.pow(Math.PI*radio,2);
        return superficie;
    }
    
}
