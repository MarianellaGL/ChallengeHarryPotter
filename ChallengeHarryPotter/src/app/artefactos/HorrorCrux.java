package app.artefactos;

import app.interfaces.IEsMagico;
import app.interfaces.IReliquiaMuerte;
import app.personajes.Criatura;
import app.transportes.Transporte;

public class HorrorCrux extends Artefacto implements IEsMagico, IReliquiaMuerte {

   

    @Override
    public void esMagico(Transporte utilizado, Artefacto obtenido, Criatura ayudante) {
        super.esMagico(utilizado, obtenido, ayudante);
    }

    @Override
    public boolean esReliquia(VaritaSauco vSauco, PiedraResurreccion pResurreccion, HorrorCrux hCrux,
            CapaInvisibilidad cInvisibilidad) {
        return super.esReliquia(vSauco, pResurreccion, hCrux, cInvisibilidad);
    }

    
}