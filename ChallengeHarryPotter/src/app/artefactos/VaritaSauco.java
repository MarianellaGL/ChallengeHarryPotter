package app.artefactos;

import java.util.List;

import app.hechizos.Hechizo;
import app.interfaces.IEsMagico;
import app.interfaces.IHacerMagia;
import app.interfaces.IReliquiaMuerte;

import app.personajes.Personaje;

public class VaritaSauco extends Varita implements IReliquiaMuerte, IEsMagico, IHacerMagia {

    public static int dañoAdicional;
    public boolean EsReliquiaMuerte = true;

    @Override
    public int getPoderInicial() {
        return 0;
    }

    @Override
    public void setPoderInicial() {

    }

    @Override
    public void aprender() {

    }

    @Override
    public List<Artefacto> getArtefactos() {
        return null;
    }

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void esReliquia(VaritaSauco vSauco, PiedraResurreccion pResurreccion, HorrorCrux hCrux,
            CapaInvisibilidad cInvisibilidad) {

    }

}