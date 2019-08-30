package app.interfaces;

import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.personajes.Personaje;

/**
 * IHacerMagia
 */
public interface IHacerMagia {

    

    void getPoderInicial();
    

    void setPoderInicial( Poder P);

    void aprender(Hechizo h);

    List<Artefacto> getArtefactos();

    void atacar(Personaje enemigo, Hechizo hechizo, Artefacto artefacto);
    void atacar(Personaje p, String nombreHechizo);

}