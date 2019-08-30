package app.artefactos;

import java.util.List;

import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.interfaces.IEsMagico;
import app.interfaces.IHacerMagia;
import app.interfaces.IReliquiaMuerte;
import app.personajes.Personaje;

public class VaritaSauco extends Varita implements IReliquiaMuerte, IEsMagico, IHacerMagia {

    public static int dañoAdicional;
    public boolean EsReliquiaMuerte = true;

    @Override
    public void getPoderInicial() {

    }

    @Override
    public void setPoderInicial(Poder P) {

    }

    @Override
    public void aprender(Hechizo h) {

    }

    @Override
    public List<Artefacto> getArtefactos() {
        return null;
    }

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

    }
}
  