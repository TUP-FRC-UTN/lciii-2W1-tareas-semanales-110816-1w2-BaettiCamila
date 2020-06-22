
package banco;

/**
 *
 * @author Artemidore
 */
public abstract class Tarjeta {
    protected int numero;
    protected float saldo;
    protected String titular;

   

    
    
    
    
    
    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    
    
public abstract float extraer(float monto);
public abstract float depositar(float monto);


}
