/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Artemidore
 */
public class Debito extends Tarjeta{
    
    
    public Debito(int numero, float saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        
    }
    
    
     @Override
    public float extraer(float monto) {
        if(saldo>=monto){
        super.saldo= super.getSaldo()-monto;
        }
        else{
            System.out.println("No posee saldo suficiente para realizar la operacion");
        }
        return super.saldo;
    }

    @Override
    public float depositar(float monto) {
       super.saldo= super.getSaldo()+monto;
       return super.saldo;
    }
    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + super.numero + ", saldo=" + super.saldo + ", titular=" + super.titular + '}';
    }
}
