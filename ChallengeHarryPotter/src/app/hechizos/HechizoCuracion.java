package app.hechizos;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

public class HechizoCuracion implements IHacerMagia {

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void aprender() {

    }


    @Override
    public int getPoderInicial() {
        return 0;
    }

    @Override
    public void setPoderInicial() {

    }

    @Override
    public List<Artefacto> getArtefactos() {
        return null;
    }


    
}

