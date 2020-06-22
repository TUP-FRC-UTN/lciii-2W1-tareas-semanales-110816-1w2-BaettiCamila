package almacen;

public class Principal {
    
    public static void main(String[] args) {
       
        Cliente c1 = new Cliente();
        c1.carga();
        
        System.out.println("\n---- RESULTADOS -----");
        System.out.println("\nCantidad de ventas superiores: " + c1.cantidadVentasSupererioresImporte(100));
        System.out.println("\nDeuda total: $" + c1.deudaTotal());
        System.out.println("\nPromedio general de ventas: $" + c1.promedioGeneralVentas());
    }
    
}
