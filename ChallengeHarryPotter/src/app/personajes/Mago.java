package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.artefactos.VaritaSauco;
import app.hechizos.CaveInimicum;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;

public class Mago extends Personaje implements IHacerMagia {
    public int poderInicial = 80;
    public int energiaMagica = 40;
    public boolean esMagoOscuro = false;
    public int nivelVida = 100;


    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public boolean esReliquia;
    public int amplificadorDaño;



    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

        enemigo.salud-=hechizo.nivelDaño+VaritaSauco.dañoAdicional;
        if(hechizo.esOscuro)
        this.esMagoOscuro=true;

    
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


    public void setArtefactos(List<Artefacto> artefactos) {
        this.artefactos = artefactos;
    }
    

public void versus(){


    System.out.println("Se inicia un nuevo duelo" );}



public void defenderse(Mago pj1, CaveInimicum hechiDefensa) {
}

    @Override
    public void setPoderInicial() {

    }

    @Override
    public void aprender() {

    }

    @Override
    public List<Artefacto> getArtefactos() {

        return this.artefactos;

    }
}

