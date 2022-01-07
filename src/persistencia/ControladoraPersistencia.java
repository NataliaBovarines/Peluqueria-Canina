
package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Datos;


public class ControladoraPersistencia {
    DatosJpaController datosJpa = new DatosJpaController();

    //Metodo para crear Datos de cliente
    public void crearDatos(Datos dato){
        try {
            datosJpa.create(dato);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
