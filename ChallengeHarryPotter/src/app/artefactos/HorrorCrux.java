package app.artefactos;

import app.interfaces.IEsMagico;
import app.interfaces.IReliquiaMuerte;
import app.personajes.Criatura;
import app.transportes.Transporte;

public class HorrorCrux extends Artefacto implements IEsMagico, IReliquiaMuerte {
    public boolean esReliquiaMuerte = true;

    @Override
    public void esReliquia(VaritaSauco vSauco, PiedraResurreccion pResurreccion, HorrorCrux hCrux,
            CapaInvisibilidad cInvisibilidad) {

    }

    @Override
    public void esMagico(Transporte utilizado, Artefacto obtenido, Criatura ayudante) {
		
	}

    
}