package app.hechizos;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

/**
 * Hechizo
 */
public class Hechizo extends Poder implements IHacerMagia {

    public boolean esOscuro = false;
    public int nivelCuracion;
    public int nivelEnergia;
    public int nivelDaño;
    public String nombreHechizo;

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public List<Artefacto> getArtefactos() {
        return null;
    }


    @Override
    public void setPoderInicial(Poder P) {

    }

    @Override
    public void aprender(Hechizo h) {

    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

}

    @Override
	public void getPoderInicial() {
		
    }
}