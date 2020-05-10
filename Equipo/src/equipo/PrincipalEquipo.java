
package equipo;

import java.util.Scanner;

public class PrincipalEquipo {
    
      
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        Equipo equip= new Equipo();
        Partido p= new Partido();
     
        System.out.println("Ingrese nombre del equipo:");
        equip.setNombre(sc.nextLine());
        System.out.println("Ingrese puntos:");
        equip.setPuntos(sc.nextInt());
        
        
        
    }
}
