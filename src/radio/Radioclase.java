
package radio;

public class Radioclase implements Interface{
    private double mostrar;
    private boolean mostrar2;
    private int boton;
    private Double[] estaciones = new Double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
    private Boolean[] frecuencias = new Boolean[] {false,false,false,false,false,false,false,false,false,false,false,false};
    
    public Radioclase(){
    }
    
    public void cambiarFrecuencia(){ //Cambiar a fm o am}
        //this.frecuencia = frecuencia;
    }
    public double sacar(int boton){ //Obtener la estacion de un boton favorito
        mostrar=Double.parseDouble(estaciones[boton].toString());
        return mostrar;
    }
    public boolean freq(int boton){ //Obtener la estacion de un boton favorito
        mostrar2=frecuencias[boton];
        return mostrar2;
    }
    public void guardar(int boton, double emisora, boolean frecuencia){  //Guardar una radio
        estaciones[boton]=emisora;
        frecuencias[boton]=frecuencia;
    }
    public double subirEstacion(boolean frecuencia, double emisora){ //Subir de estacion
        if(frecuencia==false){
            if(emisora==1610){
                emisora=520;
            }
            emisora = emisora + 10;
            
        }else{
            if(emisora==107.9){
                emisora=87.7;
            }
            emisora = emisora + 0.2;
        }
        return emisora;    
    }
    public double bajarEstacion(boolean frecuencia, double emisora){ //Bajar de estacion
        if(frecuencia==false){
            if(emisora==530){
                emisora=1620;
            }
            emisora = emisora - 10;
            
        }else{
            if(emisora==87.9){
                emisora=108.1;
            }
            emisora = emisora - 0.2;
        }
        return emisora;
    }    
}
