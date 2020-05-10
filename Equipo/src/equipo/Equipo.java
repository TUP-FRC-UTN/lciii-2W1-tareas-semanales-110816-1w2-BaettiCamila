
package equipo;
/*3. Programar una clase Equipo que represente a un equipo de fútbol. Incluir
en la misma atributos para almacenar el nombre del equipo y los datos relativos a un
campeonato con forma de liga: puntos, cantidad de partidos ganados, empatados y
perdidos, cantidad de goles realizados y recibidos y posición.*/

public class Equipo {
   private String nombre;
   private int puntos;
   private int partidosG;
   private int partidosE;
   private int partidosP;
  private  int golesRealizados;
  private  int golesPerdidos;
  private  int posicion;

     Equipo(String nombre, int puntos, int partidosG, int partidosE, int partidosP, int golesRealizados, int golesPerdidos, int posicion) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.partidosG = partidosG;
        this.partidosE = partidosE;
        this.partidosP = partidosP;
        this.golesRealizados = golesRealizados;
        this.golesPerdidos = golesPerdidos;
        this.posicion = posicion;
    }

    Equipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidosG() {
        return partidosG;
    }

    public int getPartidosE() {
        return partidosE;
    }

    public int getPartidosP() {
        return partidosP;
    }

    public int getGolesRealizados() {
        return golesRealizados;
    }

    public int getGolesPerdidos() {
        return golesPerdidos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setPartidosG(int partidosG) {
        this.partidosG = partidosG;
    }

    public void setPartidosE(int partidosE) {
        this.partidosE = partidosE;
    }

    public void setPartidosP(int partidosP) {
        this.partidosP = partidosP;
    }

    public void setGolesRealizados(int golesRealizados) {
        this.golesRealizados = golesRealizados;
    }

    public void setGolesPerdidos(int golesPerdidos) {
        this.golesPerdidos = golesPerdidos;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    void getPuntos(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}  

