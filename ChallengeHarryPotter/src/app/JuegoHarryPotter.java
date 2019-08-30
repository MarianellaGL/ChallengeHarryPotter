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
//ihacer magia y lo buscas cuando tenes los dos objetos personajes lo haces atacar
//el objeto personaje no tiene metodo atacar
//while o for van en Juegoharrypotter

    public static void AgregarPersonaje() {

        Mago magoHarry = new Mago();
        magoHarry.nombre = "Harry Potter";
        magoHarry.estaVivo = true;
        magoHarry.esMagoOscuro = false;
        magoHarry.energiaMagica = 40 + 80;
        magoHarry.poderInicial = 80 + 200;
        magoHarry.salud = 100 + 300;

        JuegoHarryPotter.LosMagos.add(magoHarry);
        JuegoHarryPotter.PersonajesJugables.add(magoHarry);

        Mago magoSnape = new Mago();
        magoSnape.nombre = "Severus Snape";
        magoSnape.estaVivo = true;
        magoSnape.esMagoOscuro = false;
        magoSnape.energiaMagica = 40 + 150;
        magoSnape.poderInicial = 80 + 300;
        magoSnape.salud = 100 + 500;

        JuegoHarryPotter.LosMagos.add(magoSnape);
        JuegoHarryPotter.PersonajesJugables.add(magoSnape);

        Elfo elfoDobby = new Elfo();
        elfoDobby.nombreCriatura = "Elfo Dobby";
        elfoDobby.ayudaAlMago = false;
        elfoDobby.estaVivo = true;
        elfoDobby.magiaInicial = 1000;
        elfoDobby.salud = 1800;
        elfoDobby.esDomestico = false;

        JuegoHarryPotter.losBichos.add(elfoDobby);
        JuegoHarryPotter.losElfos.add(elfoDobby);
        JuegoHarryPotter.PersonajesJugables.add(elfoDobby);

    }

    public static void AgregarArtefacto() {
        Artefacto cInvisibilidad= new Artefacto();
        cInvisibilidad.nombreArtefacto = "Capa de Invisibilidad";
        cInvisibilidad.amplificadorDaño = 20 * 0.25;
        cInvisibilidad.amplificadorSalud = 20 * 10;
        JuegoHarryPotter.artefactos.add(cInvisibilidad);

        Artefacto vSauco = new Artefacto();
        vSauco.nombreArtefacto = "Varita de Sauco";
        vSauco.amplificadorDaño = 20 * 0.25;
        vSauco.amplificadorSalud = 20 * 10;
        JuegoHarryPotter.artefactos.add(vSauco);

        Artefacto hPuff = new Artefacto();
        hPuff.nombreArtefacto = "Copa helga Hufflepuff";
        hPuff.amplificadorDaño=20* 0.10;
        hPuff.amplificadorSalud=20*0.50;
        JuegoHarryPotter.artefactos.add(hPuff);

        Artefacto rRevenclaw = new Artefacto();
        rRevenclaw.nombreArtefacto= "Diadema RowenaRevenclaw";
        rRevenclaw.amplificadorDaño=20*0.15;
        rRevenclaw.amplificadorSalud=20*0.10;
        JuegoHarryPotter.artefactos.add(rRevenclaw);

        Artefacto tRiddle = new Artefacto();
        tRiddle.nombre="Diario Tom Riddle";
        tRiddle.amplificadorDaño=20*0.5;
        tRiddle.amplificadorSalud=20*0.7;
        JuegoHarryPotter.artefactos.add(tRiddle);
    
        Artefacto sSlytherin = new Artefacto();
        sSlytherin.nombre= "Guardapelo Salaar Slytherin";
        sSlytherin.amplificadorDaño=0.5;
        sSlytherin.amplificadorSalud=0.3;
        JuegoHarryPotter.artefactos.add(sSlytherin);

        Artefacto hCrux = new Artefacto();
        hCrux.nombre="Horror Crux";
        hCrux.amplificadorDaño=0.25;
        hCrux.amplificadorSalud=0.15;
        JuegoHarryPotter.artefactos.add(hCrux);

        Artefacto pFilosofal = new Artefacto();
        pFilosofal.nombre="Piedra Filosofal";
        pFilosofal.amplificadorDaño=0.75;
        pFilosofal.amplificadorSalud=0.15;
        JuegoHarryPotter.artefactos.add(pFilosofal);

        Artefacto sSeleccionador= new Artefacto();
        sSeleccionador.nombre="Sombrero Seleccionador";
        sSeleccionador.amplificadorDaño=0.5;
        sSeleccionador.amplificadorSalud=0.2;
        JuegoHarryPotter.artefactos.add(sSeleccionador);

        Artefacto varita= new Artefacto();
        varita.nombre= "Varita";
        varita.amplificadorDaño=0.32;
        varita.amplificadorSalud=0.5;
        JuegoHarryPotter.artefactos.add(varita);

      

      }
    }


    