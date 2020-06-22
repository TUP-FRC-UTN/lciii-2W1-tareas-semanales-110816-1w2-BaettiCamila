package almacen;

import java.util.Scanner;

public class Cliente {

    private String nombre;
    private String telefono;
    private Venta[] ventas;
 
    public Cliente() {      
    }
    
    public Cliente(String nombre, String telefono, int cantidadVentas) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ventas = new Venta [cantidadVentas];
    }
             
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void agregarVenta(Venta v){
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] == null) {
                ventas[i] = v;
                break;
            }           
        }
    }
    
    public float promedioGeneralVentas(){
        float prom = 0;
        int cVentas = 0;
        for (Venta v : ventas) {
            if (v != null) {
                cVentas++;
                prom += v.getImporteTotal();
            }
        }
        return prom/cVentas;
    }
    
    public float deudaTotal(){
        float deudaTotal = 0;
        for (Venta v : ventas) {
            if (v != null) {
                deudaTotal+= v.getSaldoAdeudado();
            }
        }
        return deudaTotal;
    }
    
    public int cantidadVentasSupererioresImporte(float importe){
        int cantVentas = 0;
        for (Venta v : ventas) {
            if (v != null) {
                if (v.getImporteTotal() > importe) {
                    cantVentas++;
                }
            }
        }
        return cantVentas;
    }
   
    public void carga(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese su nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("\nIngrese su telefono: ");
        this.telefono = sc.nextLine();
        System.out.print("\nIngrese la cantidad de ventas: ");
        this.ventas = new Venta [sc.nextInt()];    
        for (Venta v : ventas) {
            if (v == null) {
                Venta v1 = new Venta();
                System.out.println("\n----- NUEVA VENTA -----");
                System.out.print("\nIngrese la cantidad de productos comprados: ");
                v1.setCantProd(sc.nextInt());
                System.out.print("\nIngrese el importe total de la compra: ");
                v1.setImporteTotal(sc.nextFloat());
                System.out.print("\nIngrese el saldo adeudado: ");
                v1.setSaldoAdeudado(sc.nextFloat()); 
                agregarVenta(v1);
            }                       
        }
    }     
}
