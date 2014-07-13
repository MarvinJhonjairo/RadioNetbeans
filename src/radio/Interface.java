
package radio;

public interface Interface {
    void cambiarFrecuencia();
    double sacar(int boton);
    boolean freq(int boton);
    void guardar(int boton, double emisora, boolean frecuencia);
    double subirEstacion(boolean frecuencia, double emisora);
    double bajarEstacion(boolean frecuencia, double emisora);    
}
