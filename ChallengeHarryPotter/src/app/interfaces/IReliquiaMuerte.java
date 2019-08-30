package app.interfaces;

import app.artefactos.CapaInvisibilidad;
import app.artefactos.HorrorCrux;
import app.artefactos.PiedraResurreccion;
import app.artefactos.VaritaSauco;

/**
 * IReliquiaMuerte
 */
public interface IReliquiaMuerte {

    void esReliquia(VaritaSauco vSauco, PiedraResurreccion pResurreccion, HorrorCrux hCrux, CapaInvisibilidad cInvisibilidad);
    boolean esReliquia();

    
    
}