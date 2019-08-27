package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;

public class Mago extends Personaje implements IHacerMagia {
    public int poderInicial = 80;
    public int energiaMagica = 40;
    public boolean esMagoOscuro = false;

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();



    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

        enemigo.salud-=hechizo.nivelDaño;


    }



    public int getPoderInicial() {
        return poderInicial;
    }

    public void setPoderInicial(int poderInicial) {
        this.poderInicial = poderInicial;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    public boolean isEsMagoOscuro() {
        return esMagoOscuro;
    }

    public void setEsMagoOscuro(boolean esMagoOscuro) {
        this.esMagoOscuro = esMagoOscuro;
    }

    public List<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    public List<Artefacto> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(List<Artefacto> artefactos) {
        this.artefactos = artefactos;
    }
    

public void versus(){


    System.out.println("Se inicia un nuevo duelo" );}}

