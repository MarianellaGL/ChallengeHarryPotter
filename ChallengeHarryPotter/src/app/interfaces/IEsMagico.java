package app.interfaces;

import app.artefactos.Artefacto;
import app.personajes.Criatura;
import app.transportes.Transporte;

/**
 * IEsMagico
 */
public interface IEsMagico {

    void esMagico(Transporte utilizado, Artefacto obtenido, Criatura ayudante);
}