package app.personajes;

import app.artefactos.Artefacto;
import app.interfaces.IEsMagico;
import app.transportes.Transporte;

public class Criatura extends Personaje implements IEsMagico{

    public String tipoCriatura;
    public int magiaInicial;
    public int salud;
    public boolean ayudaAlMago = true;

    @Override
    public void esMagico(Transporte utilizado, Artefacto obtenido, Criatura ayudante) {
		
	}
    


    
}