
package logica;

import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearDatos(String nroCliente, String nombrePerro, String raza, String color, String alergia, String atencionEsp, String nombreDuenio, String cel, String obs){
        
       Datos dato = new Datos();
        
       dato.setNum_cliente(nroCliente);
       dato.setNombre_perro(nombrePerro);
       dato.setRaza(raza);
       dato.setColor(color);
       dato.setAlergico(alergia);
       dato.setAtencion_especial(atencionEsp);
       dato.setNombre_duenio(nombreDuenio);
       dato.setCelular_duenio(cel);
       dato.setObservaciones(obs);
       
       controlPersis.crearDatos(dato);
    }
}
