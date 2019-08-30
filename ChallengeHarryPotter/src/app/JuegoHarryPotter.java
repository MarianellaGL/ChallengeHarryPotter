package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.hechizos.HechizoAtaque;
import app.personajes.Criatura;
import app.personajes.Elfo;
import app.personajes.Mago;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.transportes.Transporte;

public class JuegoHarryPotter {


    public static List<Personaje> PersonajesJugables = new ArrayList<Personaje>();
    public static List<Elfo> losElfos = new ArrayList<Elfo>();
    public static List<Criatura> losBichos = new ArrayList<Criatura>();
    public static List<Transporte> TransportesMagicos = new ArrayList<Transporte>();
    public static List<Mago> LosMagos = new ArrayList<Mago>();
    public static List<Muggle> LosComunes = new ArrayList<Muggle>();
    public static List<HechizoAtaque> Atacan = new ArrayList<HechizoAtaque>();
    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public static List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public static Personaje ElegirPersonaje(String nombre) {

        for (Personaje p : JuegoHarryPotter.PersonajesJugables) {

            if (p.nombre.equals(nombre))

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
        JuegoHarryPotter.PersonajesJugables.add(magoHarry);
        


        Mago magoSnape = new Mago();
        magoSnape.nombre = "Severus Snape";
        magoSnape.estaVivo = true;
        magoSnape.energiaMagica = 40 + 150;
        magoSnape.poderInicial = 80 + 300;
        magoSnape.salud = 100 + 500;

        JuegoHarryPotter.LosMagos.add(magoSnape);
        JuegoHarryPotter.PersonajesJugables.add(magoSnape);

        Elfo elfoDobby = new Elfo();
        elfoDobby.nombreCriatura = "Elfo Dobby";
        elfoDobby.ayudaAlMago = false;
        elfoDobby.estaVivo = true;
        elfoDobby.magiaInicial= 1000;
        elfoDobby.salud= 1800;
        elfoDobby.esDomestico= false;


       
        JuegoHarryPotter.losBichos.add(elfoDobby);
        JuegoHarryPotter.losElfos.add(elfoDobby);
        JuegoHarryPotter.PersonajesJugables.add(elfoDobby);

    }
    public static void AgregarArtefacto(){
        Artefacto CapaInvisibilidad= new Artefacto();
        CapaInvisibilidad.nombreArtefacto= "Capa de Invisibilidad";
        CapaInvisibilidad.amplificadorDaño = 20 * 0.25;
        CapaInvisibilidad.amplificadorSalud = 20*10;
        JuegoHarryPotter.artefactos.add(CapaInvisibilidad);

        Artefacto VaritaSauco = new Artefacto();
        VaritaSauco.nombreArtefacto="Varita de Sauco";
        VaritaSauco.amplificadorDaño= 20*0.25;
        VaritaSauco.amplificadorSalud=20*10;
        JuegoHarryPotter.artefactos.add(VaritaSauco);
    }
    
   

}
       


