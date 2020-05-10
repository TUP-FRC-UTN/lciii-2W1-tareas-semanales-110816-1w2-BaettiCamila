/*4. Programar una clase Partido que represente a un partido de futbol. La
misma debe contener dos atributos de tipo Equipo que indiquen los equipos
contendientes y atributos necesarios para indicar el resultado del mismo.*/
package equipo;


public class Partido {
  private  Equipo equipoLocal;
  private  Equipo equipoVisitante;
  private int puntosPartido;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int puntosPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.puntosPartido = puntosPartido;
    }

    Partido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getPuntosPartido() {
        return puntosPartido;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public void setPuntosPartido(int puntosPartido) {
        this.puntosPartido = puntosPartido;
    }
    
    public void meterGol(Equipo e){
    e.setGolesRealizados(+1);
    }
    
}
