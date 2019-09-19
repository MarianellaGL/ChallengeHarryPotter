package app.interfaces;

import app.artefactos.CapaInvisibilidad;
import app.artefactos.HorrorCrux;
import app.artefactos.PiedraResurreccion;
import app.artefactos.VaritaSauco;

/**
 * IReliquiaMuerte
 */
public interface IReliquiaMuerte {

    boolean esReliquia(VaritaSauco vSauco, PiedraResurreccion pResurreccion, HorrorCrux hCrux,
            CapaInvisibilidad cInvisibilidad);

    boolean esReliquia = true;
    //estonova
    

}
// Interfaces erroneas
//lista de metodos que van a tener en comun clases.
