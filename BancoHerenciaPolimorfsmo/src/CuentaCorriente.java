
public class CuentaCorriente extends Cuenta {
    public double acuerdo;

    public void setAcuerdo(double acuerdo) {
        this.acuerdo = acuerdo;
    }

    public double getAcuerdo() {
        return acuerdo;
    }
    
    
    @Override
    public void depositar(double monto) {
        super.saldo+=monto;
    }
    
    @Override
    public void extraer(double monto) {
        
        if((super.saldo-monto)>this.acuerdo){
            super.saldo-=monto;
        }
        else System.out.println("El monto que desea extraer es mayor al acuerdo");
    }
    
}
