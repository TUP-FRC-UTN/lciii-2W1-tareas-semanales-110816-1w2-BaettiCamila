

public class CajaAhorro extends Cuenta {
    
    
    @Override
    public void depositar(double monto) {
        super.saldo+= monto;
        System.out.println("Usted a depositado:"+" "+monto);
        System.out.println("Su saldo actual es de:"+" "+super.saldo);
    }
    
    @Override
    public void extraer(double monto) {
        if((super.saldo-monto)>=0){
           super.saldo-=monto;
           System.out.println("Usted extrajo:"+" "+monto);
        }
        else System.out.println("No puede extraer, no tiene saldo suficiente");
        
    }
    
}
