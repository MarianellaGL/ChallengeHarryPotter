package app.personajes;

import static app.interfaces.IReliquiaMuerte.esReliquia;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.interfaces.IHacerMagia;
import app.transportes.Transporte;

public class Mago extends Personaje implements IHacerMagia {
    public int poderInicial = 80;
    public int energiaMagica = 40;
    public boolean esMagoOscuro = false;
    public int nivelVida = 100;
    public String nombrePoderInicial;
    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Poder> losPoderes = new ArrayList<Poder>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Transporte> transportesMagicos = new ArrayList<Transporte>();

    public Poder getPoder() {

        for (Poder p : losPoderes) {
            if (p.nombrePoder.equals(nombre)) {

                return p;
            }
        }

        return null;

    }

    public Transporte getTransporte() {

        for (Transporte t : transportesMagicos)
            if (t.nombreTransporte.equals(nombre)) {
                return t;
            }

        return null;
    }

    public void setPoderInicial(int poderInicial) {
        this.poderInicial = poderInicial;
    }

    @Override
    public void aprender(Hechizo h) {

    }

    public List<Hechizo> getHechizos() {

        return hechizos;
    }

    @Override
    public List<Artefacto> getArtefactos() {
        return artefactos;

    }

    @Override
    public void getPoderInicial() {

        // amplificar daño si vale uno devuelve si no te toma es porque hay que casteado

    }

    @Override
    public void setPoderInicial(Poder p) {

    }

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

        enemigo.salud -= hechizo.nivelDaño;

        for (Artefacto ar : this.artefactos) {

            enemigo.salud -= (energiaMagica *= ar.amplificadorDaño);

            if (esReliquia) {

                enemigo.salud -= (hechizo.nivelDaño * ar.amplificadorDaño) + (energiaMagica *= 2);

            }
        }

        if (hechizo.esOscuro) {
            hechizo.nivelDaño *= 2;

            this.esMagoOscuro = true;

            System.out.println(nombre + " se ha mostrado como mago oscuro");
        }

    }

    @Override
    public void atacar(Transporte elTransporte, Artefacto elArtefacto) {
      

    }
}

// niv daño 50 ampl daño 1.2 = dño total
// if(h.esoscuro) dañotot *=2
// this.magooscuro= true;

// if(this.energia>h.energia)
// this.energia = h.energia;