
package herencia;


public class Herencia {

    
    public static void main(String[] args) {
        Cliente c = new Cliente(1,"Juan Pedro",351699539);
        ClientePreferencial cp= new ClientePreferencial ();
        cp.setSaldo(10);
        cp.setSaldoLimite(200);
        cp.setDomicilio("Av. Colon 2343");
        cp.setNombre("Juan Pedro");
        cp.setNumero(1);
        cp.setTelefono(351699880);
        cp.toString();
    }
    
}
