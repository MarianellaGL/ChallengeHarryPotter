package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.HechizoAtaque;
import app.hechizos.SectumSempra;
import app.personajes.Mago;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.transportes.Transporte;

public class JuegoHarryPotter {

    public static List<Personaje> PersonajesJugables = new ArrayList<Personaje>();
    public static List<Artefacto> ArtefactosMagicos = new ArrayList<Artefacto>();
    public static List<Transporte> TransportesMagicos = new ArrayList<Transporte>();
    public static List<Mago> LosMagos = new ArrayList<Mago>();
    public static List<Muggle> LosComunes = new ArrayList<Muggle>();
    public static List<HechizoAtaque> Atacan = new ArrayList<HechizoAtaque>();

    public static Personaje ElegirPersonaje(String nombre) {
        
        for (Personaje p : JuegoHarryPotter.PersonajesJugables) {

            if (p.nombre == nombre )

            return p;
            
        }
        return null;

    }

	public static void InicializarJuego() {
    AgregarPersonaje();
    }
    
    public static void AgregarPersonaje() {

        Mago magoHarry = new Mago();
        magoHarry.nombre = "Harry Potter";
        magoHarry.estaVivo = true;
        magoHarry.energiaMagica = 40 + 80;
        magoHarry.poderInicial = 80 + 200;
        magoHarry.salud = 100 + 300;

        JuegoHarryPotter.LosMagos.add(magoHarry);

        SectumSempra hechiAtaque = new SectumSempra();
        hechiAtaque.esOscuro = true;
        hechiAtaque.nivelDaño = 100;


        JuegoHarryPotter.Atacan.add(hechiAtaque);



        Mago magoSnape =  new Mago();
        magoSnape.nombre = "Severus Snape";
        magoSnape.estaVivo = true;
        magoSnape.energiaMagica = 40 + 150;
        magoSnape.poderInicial = 80 + 300;
        magoSnape.salud = 100 + 500;

        JuegoHarryPotter.LosMagos.add(magoSnape);
    }
}
