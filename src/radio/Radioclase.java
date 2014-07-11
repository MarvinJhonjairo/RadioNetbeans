
package radio;

public class Radioclase {
    protected boolean frecuencia;
    protected boolean encendido;
    protected double estacionAM;
    protected double getEstacionFM;
    protected double bajarEstacion;
    protected double subirEstacion;
    protected double sacar;
    protected int boton;
            
    public Radioclase(){//-----añadir parametros
 
    }
    public void cambiarFrecuencia(boolean frecuencia){ //Cambiar a fm o am}
        //this.frecuencia = frecuencia;
    }
    public double sacar(int boton){ //Obtener la estacion de un boton favorito
        return ;
    }
    public void apagar(){ //Apagar la radio

    }
    public void encender(){ //Encender la radio
        
    }
    public void guardar(int boton, double estacion){  //Guardar una radio

    }
    public double subirEstacion(){ //Subir de estacion
        return ;    
    }
    public double bajarEstacion(){ //Bajar de estacion
        return ;
    }
    public boolean getFrecuencia(){ //Obtener la frecuencia actual de la radio
        return ;    
    }
    public boolean getEncendido(){ //Obtener el estado de la radio (encendido o apagado)
        return ;
    }
    public double getEstacionAM(){ //Obtener el estado de la estacion am (la estacion  actual del contador de am)
        return ;
    }
    public double getEstacionFM(){ //Obtener el estado de la estacion fm (la estacion actual del contador de fm)
        return ;
    }
    
}
