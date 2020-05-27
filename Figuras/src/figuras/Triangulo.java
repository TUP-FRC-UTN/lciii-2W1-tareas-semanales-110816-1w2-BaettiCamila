
package figuras;

public class Triangulo extends Figuras {
    private float lado1;
    private float lado2;
    private float base;
    private float altura;

    public Triangulo(float lado1, float lado2, float base, float altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }
    
    

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public void setbase(float lado3) {
        this.base = lado3;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + base + ", altura=" + altura + '}';
    }
    
    @Override
    public float CalcularPerimetro() {
    float perimetro;
    perimetro=lado1+lado2+base;
    return perimetro;
    }

    @Override
    public float CalcularSuperficie() {
        float superficie;
        superficie=(base*altura)/2;
        return superficie;
    }
    
}
