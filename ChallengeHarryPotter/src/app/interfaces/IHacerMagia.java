package app.interfaces;

import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.personajes.Personaje;

/**
 * IHacerMagia
 */
public interface IHacerMagia {

    

    int getPoderInicial();

    void setPoderInicial();

    void aprender();

    List<Artefacto> getArtefactos();

    void atacar(Personaje enemigo, Hechizo hechizo);

}