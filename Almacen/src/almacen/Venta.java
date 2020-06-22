package almacen;

public class Venta {
    
    private int cantProd;
    private float importeTotal;
    private float saldoAdeudado;

    public Venta() {
    }
       
    public Venta(int cantProd, float importeTotal, float saldoAdeudado) {
        this.cantProd = cantProd;
        this.importeTotal = importeTotal;
        this.saldoAdeudado = saldoAdeudado;
    }

    public int getCantProd() {
        return cantProd;
    }

    public void setCantProd(int cantProd) {
        this.cantProd = cantProd;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }

    public float getSaldoAdeudado() {
        return saldoAdeudado;
    }

    public void setSaldoAdeudado(float saldoAdeudado) {
        this.saldoAdeudado = saldoAdeudado;
    }
           
}
