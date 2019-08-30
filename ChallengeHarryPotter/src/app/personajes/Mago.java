package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.interfaces.IHacerMagia;

public class Mago extends Personaje implements IHacerMagia {
    public int poderInicial = 80;
    public int energiaMagica = 40;
    public boolean esMagoOscuro = false;
    public int nivelVida = 100;

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Poder> losPoderes = new ArrayList<Poder>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public boolean esReliquia;
    public int amplificadorDaño;

    public Poder getPoder() {

        for (Poder p : losPoderes) {
            if (p.nombrePoder.equals(nombre)) {

                return p;
            }
        }

        return null;

    }

    public void setPoderInicial(int poderInicial) {
        this.poderInicial = poderInicial;
    }

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

        enemigo.salud -= hechizo.nivelDaño;

    }

    @Override
    public void aprender(Hechizo h) {

    }

    @Override
    public List<Artefacto> getArtefactos() {
        return artefactos;
    }

    @Override
    public void getPoderInicial() {
        
    
            //amplificar daño si vale uno devuelve si no te toma es porque hay que casteado 

    }

    @Override
	public void setPoderInicial( Poder p) {
		
	}

    @Override
	public void atacar(Personaje p, String nombreHechizo) {
        
    }
	}
