package app.hechizos;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

/**
 * Hechizo
 */
public class Hechizo implements IHacerMagia {

    public boolean esOscuro = false;
    public int nivelCuracion;
    public int nivelEnergia;
    public int nivelDaño;

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void aprender() {

    }

    @Override
    public List<Artefacto> getArtefactos() {
        return null;
    }

    @Override
    public int getPoderInicial() {
        return 0;
    }

    @Override
    public void setPoderInicial() {

    }
}