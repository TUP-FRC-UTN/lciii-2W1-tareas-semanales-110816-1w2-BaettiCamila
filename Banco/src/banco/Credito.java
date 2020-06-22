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
public class Credito extends Tarjeta{
    private float limite;

    
     public Credito(int numero, float saldo, String titular, float limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.limite= limite;
    }
    
    
    
    
    
    @Override
    public float extraer(float monto) {
        if(limite>monto){
            super.saldo= super.getSaldo()+monto;
        
        }
        else{
        System.out.println("El saldo de su compra es mayor al limite");
        }
        return super.saldo;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + super.numero + ", saldo=" + super.saldo + ", titular=" + super.titular +"Limite="+ limite+ '}';
    }

    

    @Override
    public float depositar(float monto) {
       super.saldo= super.getSaldo()-monto;
       return super.saldo;
    }
    
    
}
