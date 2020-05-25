import java.util.Scanner;
public class Banco {
    
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        
                Cuenta c1= new CajaAhorro();
                
                System.out.println("Ingrese el nombre de la caja de ahorro:");
                c1.nombre= sc.nextLine();
                System.out.println(" ");
                System.out.println("Ingrese el número de caja de ahorro:");
                c1.numero=sc.nextInt();
                
                
                System.out.println("Para extraer presione 1, para depositar presione 2, para finalizar presione 3");
                int accion;
                accion=sc.nextInt();
                
                while(accion==1||accion==2){
                    
                    if(accion==1){
                        double monto;
                        System.out.println("Ingrese monto a extraer");
                        monto=sc.nextDouble();
                        c1.extraer(monto);
                    }
                    else {
                        double monto;
                        System.out.println("Ingrese monto a depositar");
                        monto=sc.nextDouble();
                        c1.depositar(monto);
                        
                    }
                    System.out.println("Para extraer presione 1, para depositar presione 2, para finalizar presione 3");
                    accion=sc.nextInt();
                }
                System.out.println("Operaciones realizadas con éxito");
                
            
                
                
                Cuenta c2=new CuentaCorriente();
                
                System.out.println("Ingrese el nombre de la cuenta corriente:");
                c2.nombre= sc.nextLine();
                
                System.out.println("Ingrese el número de cuenta corriente:");
                c2.numero=sc.nextInt();
                
                int accion2;
                System.out.println("Para extraer presione 1, para depositar presione 2, para finalizar presione 3");
                accion2=sc.nextInt();
                
                while(accion2==1||accion2==2){
                    
                    if(accion2==1){
                        System.out.println("Ingrese monto a extraer:");
                        double monto= sc.nextInt();
                        c2.setAcuerdo(200);
                        c2.extraer(monto);
                    }
                    else{
                        System.out.println("Ingrese monto a depositar:");
                        double monto= sc.nextInt();
                        c2.depositar(monto);
                    }
                    
                
                
                System.out.println("Operaciones realizadas con éxito");
                accion=sc.nextInt();
            }
        }
}
    
