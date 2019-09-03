package app.hechizos;

import java.util.ArrayList;
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
    public int nivelDefensa;
    
    public List<HechizoAtaque> hechizoAtaque = new ArrayList<HechizoAtaque>();

  

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
	public void getPoderInicial() {
		
    }
    @Override
    public List<Hechizo> getHechizos() {
        return null;
    }

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }
}