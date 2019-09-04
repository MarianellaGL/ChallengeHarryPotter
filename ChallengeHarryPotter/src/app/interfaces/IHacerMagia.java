package app.interfaces;

import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.personajes.Personaje;
import app.transportes.Transporte;

/**
 * IHacerMagia
 */
public interface IHacerMagia {

    void getPoderInicial();

    void setPoderInicial(Poder P);

    void aprender(Hechizo h);

    List<Hechizo> getHechizos();

    List<Artefacto> getArtefactos();

    void atacar(Personaje enemigo, Hechizo hechizo);

	void atacar(Transporte elTransporte, Artefacto elArtefacto);

}
