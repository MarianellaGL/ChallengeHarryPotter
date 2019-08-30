package app.hechizos;

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
}