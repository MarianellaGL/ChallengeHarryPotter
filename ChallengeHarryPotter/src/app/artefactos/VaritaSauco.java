package app.artefactos;

import app.hechizos.Hechizo;
import app.interfaces.IEsMagico;
import app.interfaces.IHacerMagia;
import app.interfaces.IReliquiaMuerte;
import app.personajes.Criatura;
import app.personajes.Personaje;
import app.transportes.Transporte;

public class VaritaSauco extends Varita implements IReliquiaMuerte, IEsMagico, IHacerMagia {

    public static int dañoAdicional;
	public boolean EsReliquiaMuerte= true;

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void esMagico(Transporte utilizado, Artefacto obtenido, Criatura ayudante) {

    }

    @Override
	public void esReliquia(VaritaSauco vSauco, PiedraResurreccion pResurreccion, HorrorCrux hCrux,
			CapaInvisibilidad cInvisibilidad) {
		
	}

    
}