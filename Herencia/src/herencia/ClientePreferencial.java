
package herencia;


public class ClientePreferencial extends Cliente {
    float saldo;
    float saldoLimite;
    String domicilio;

    public ClientePreferencial(int numero, String nombre, int telefono) {
        super(numero, nombre, telefono);
    }

    ClientePreferencial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getSaldo() {
        return saldo;
    }

    public float getSaldoLimite() {
        return saldoLimite;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setSaldoLimite(float saldoLimite) {
        this.saldoLimite = saldoLimite;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "ClientePreferencial{" + "saldo=" + saldo + ", saldoLimite=" + saldoLimite + ", domicilio=" + domicilio + '}';
    }

    
    
}
