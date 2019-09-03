package app.artefactos;

import app.interfaces.IEsMagico;
import app.interfaces.IReliquiaMuerte;
import app.personajes.Criatura;
import app.transportes.Transporte;

public class Artefacto implements IEsMagico, IReliquiaMuerte{

    public double amplificadorDaño = 200;
    public double amplificadorSalud = 200;
    public String nombreArtefacto;

    @Override
    public void esMagico(Transporte utilizado, Artefacto obtenido, Criatura ayudante) {

        if (Artefacto.esReliquia){

       amplificadorDaño *= 2;}




}

    @Override
	public boolean esReliquia(VaritaSauco vSauco, PiedraResurreccion pResurreccion, HorrorCrux hCrux,
			CapaInvisibilidad cInvisibilidad) {
        return true;
     
    
            }
        
        }