package app;

import java.util.ArrayList;
import java.util.List;
import app.artefactos.Artefacto;
import app.artefactos.CapaInvisibilidad;
import app.artefactos.CopaHelgaHufflepuff;
import app.artefactos.DiademaRowenaRevenclaw;
import app.artefactos.DiarioTomRiddle;
import app.artefactos.GuardapeloSalazarSlytherin;
import app.artefactos.HorrorCrux;
import app.artefactos.PiedraFilosofal;
import app.artefactos.SombreroSeleccionador;
import app.artefactos.Varita;
import app.artefactos.VaritaSauco;
import app.hechizos.AvadaKedabra;
import app.hechizos.Expelliarmus;
import app.hechizos.Hechizo;
import app.hechizos.HechizoAtaque;
import app.hechizos.MaleficioCruciatus;
import app.hechizos.Parseltongue;
import app.hechizos.PetrificusTotallus;
import app.hechizos.SectumSempra;
import app.personajes.Criatura;
import app.personajes.Elfo;
import app.personajes.Mago;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.transportes.AlfombraVoladora;
import app.transportes.AutobusNoctambulo;
import app.transportes.Escoba;
import app.transportes.ExpresoAHogwarts;
import app.transportes.Giratiempo;
import app.transportes.MotocicletaVoladoraSiriusB;
import app.transportes.Transporte;

public class JuegoHarryPotter {

    public static List<Personaje> personajesJugables = new ArrayList<Personaje>();
    public static List<Elfo> losElfos = new ArrayList<Elfo>();
    public static List<Criatura> losBichos = new ArrayList<Criatura>();
    public static List<Transporte> transportesMagicos = new ArrayList<Transporte>();
    public static List<Mago> losMagos = new ArrayList<Mago>();
    public static List<Muggle> losComunes = new ArrayList<Muggle>();
    public static List<HechizoAtaque> hechizoAtaque = new ArrayList<HechizoAtaque>();
    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public static List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public static Personaje ElegirPersonaje(String nombre) {

        for (Personaje p : JuegoHarryPotter.personajesJugables) {

            if (p.nombre.equals(nombre))

                return p;

        }
        return null;

    }

    public static Artefacto ElegirArtefacto(String nombreArtefacto) {

        for (Artefacto ar : JuegoHarryPotter.artefactos) {

            if (ar.nombreArtefacto.equals(nombreArtefacto))

                return ar;

        }
        return null;

    }

    public static Transporte SubiteAlTransporte(String nombreTransporte) {
        for (Transporte tr : JuegoHarryPotter.transportesMagicos) {

            if (tr.nombreTransporte.equals(nombreTransporte))

                return tr;
        }

        return null;
    }

    public static Hechizo ElegirHechizo(String nombreHechizo) {
        for (Hechizo h : JuegoHarryPotter.hechizos) {

            if (h.nombreHechizo.equals(nombreHechizo))

                return h;

        }
        return null;

    }

    public static void InicializarJuego() {
        AgregarPersonaje();
        AgregarArtefacto();
        SubiteAlTransporte();
        ElegirHechizo();
    }
    // ihacer magia y lo buscas cuando tenes los dos objetos personajes lo haces
    // atacar
    // el objeto personaje no tiene metodo atacar
    // while o for van en Juegoharrypotter

    public static void AgregarPersonaje() {

        Mago magoHarry = new Mago();
        magoHarry.nombre = "Harry Potter";
        magoHarry.estaVivo = true;
        magoHarry.esMagoOscuro = false;
        magoHarry.energiaMagica = 40 + 80;
        magoHarry.poderInicial = 80 + 200;
        magoHarry.salud = +3000;

        JuegoHarryPotter.losMagos.add(magoHarry);
        JuegoHarryPotter.personajesJugables.add(magoHarry);

        Mago magoSnape = new Mago();
        magoSnape.nombre = "Severus Snape";
        magoSnape.estaVivo = true;
        magoSnape.esMagoOscuro = false;
        magoSnape.energiaMagica = 40 + 150;
        magoSnape.poderInicial = 80 + 300;
        magoSnape.salud = +50000;

        JuegoHarryPotter.losMagos.add(magoSnape);
        JuegoHarryPotter.personajesJugables.add(magoSnape);

        Elfo elfoDobby = new Elfo();
        elfoDobby.nombreCriatura = "Elfo Dobby";
        elfoDobby.ayudaAlMago = false;
        elfoDobby.estaVivo = true;
        elfoDobby.magiaInicial = 100000;
        elfoDobby.salud = 180000;
        elfoDobby.esDomestico = false;

        JuegoHarryPotter.losBichos.add(elfoDobby);
        JuegoHarryPotter.losElfos.add(elfoDobby);
        JuegoHarryPotter.personajesJugables.add(elfoDobby);

    }

    public static void AgregarArtefacto() {
        {
            CapaInvisibilidad cInvisibilidad = new CapaInvisibilidad();
            cInvisibilidad.nombreArtefacto = "Capa de Invisibilidad";
            cInvisibilidad.amplificadorDaño = 0.25;
            cInvisibilidad.amplificadorSalud = 10;

            JuegoHarryPotter.artefactos.add(cInvisibilidad);

            VaritaSauco vSauco = new VaritaSauco();
            vSauco.nombreArtefacto = "Varita de Sauco";
            vSauco.amplificadorDaño = 20 * 0.25;
            vSauco.amplificadorSalud = 20 * 10;

            JuegoHarryPotter.artefactos.add(vSauco);

            CopaHelgaHufflepuff hPuff = new CopaHelgaHufflepuff();
            hPuff.nombreArtefacto = "Copa helga Hufflepuff";
            hPuff.amplificadorDaño = 20 * 0.10;
            hPuff.amplificadorSalud = 20 * 0.50;
            JuegoHarryPotter.artefactos.add(hPuff);

            DiademaRowenaRevenclaw rRevenclaw = new DiademaRowenaRevenclaw();
            rRevenclaw.nombreArtefacto = "Diadema RowenaRevenclaw";
            rRevenclaw.amplificadorDaño = 20 * 0.15;
            rRevenclaw.amplificadorSalud = 20 * 0.10;
            JuegoHarryPotter.artefactos.add(rRevenclaw);

            DiarioTomRiddle tRiddle = new DiarioTomRiddle();
            tRiddle.nombreArtefacto = "Diario Tom Riddle";
            tRiddle.amplificadorDaño = 20 * 0.5;
            tRiddle.amplificadorSalud = 20 * 0.7;
            JuegoHarryPotter.artefactos.add(tRiddle);

            GuardapeloSalazarSlytherin sSlytherin = new GuardapeloSalazarSlytherin();
            sSlytherin.nombreArtefacto = "Guardapelo Salaar Slytherin";
            sSlytherin.amplificadorDaño = 0.5;
            sSlytherin.amplificadorSalud = 0.3;
            JuegoHarryPotter.artefactos.add(sSlytherin);

            HorrorCrux hCrux = new HorrorCrux();
            hCrux.nombreArtefacto = "Horror Crux";
            hCrux.amplificadorDaño = 0.25;
            hCrux.amplificadorSalud = 0.15;
            JuegoHarryPotter.artefactos.add(hCrux);

            PiedraFilosofal pFilosofal = new PiedraFilosofal();
            pFilosofal.nombreArtefacto = "Piedra Filosofal";
            pFilosofal.amplificadorDaño = 0.75;
            pFilosofal.amplificadorSalud = 0.15;
            JuegoHarryPotter.artefactos.add(pFilosofal);

            SombreroSeleccionador sSeleccionador = new SombreroSeleccionador();
            sSeleccionador.nombreArtefacto = "Sombrero Seleccionador";
            sSeleccionador.amplificadorDaño = 0.5;
            sSeleccionador.amplificadorSalud = 0.2;
            JuegoHarryPotter.artefactos.add(sSeleccionador);

            Varita varita = new Varita();
            varita.nombreArtefacto = "Varita Pelo de Unicornio";
            varita.amplificadorDaño = 0.32;
            varita.amplificadorSalud = 0.5;
            JuegoHarryPotter.artefactos.add(varita);
        }
    }

    public static void SubiteAlTransporte() {
        {
            AlfombraVoladora alfombraVoladora = new AlfombraVoladora();
            alfombraVoladora.nombreTransporte = "Alfombra Voladora";
            JuegoHarryPotter.transportesMagicos.add(alfombraVoladora);

            MotocicletaVoladoraSiriusB motosirius = new MotocicletaVoladoraSiriusB();
            motosirius.nombreTransporte = "Moto Sirius Black";
            JuegoHarryPotter.transportesMagicos.add(motosirius);

            ExpresoAHogwarts eHogwarts = new ExpresoAHogwarts();
            eHogwarts.nombreTransporte = "Expreso a Hogwarts";
            JuegoHarryPotter.transportesMagicos.add(eHogwarts);

            AutobusNoctambulo aNoctambulo = new AutobusNoctambulo();
            aNoctambulo.nombreTransporte = "Autobús Noctámbulo";
            JuegoHarryPotter.transportesMagicos.add(aNoctambulo);

            Escoba escobaMagica = new Escoba();
            escobaMagica.nombreTransporte = "Nimbus 2000";
            JuegoHarryPotter.transportesMagicos.add(escobaMagica);

            Escoba escobaMagica2 = new Escoba();
            escobaMagica2.nombreTransporte = "Saeta de Fuego";
            JuegoHarryPotter.transportesMagicos.add(escobaMagica);

            Giratiempo giratiempo = new Giratiempo();
            giratiempo.nombreTransporte = "Giratiempo mágico";
            JuegoHarryPotter.transportesMagicos.add(giratiempo);
        }

    }

    public static void ElegirHechizo() {
        {
            SectumSempra sempra = new SectumSempra();
            sempra.nombreHechizo = "Sectum Sempra";
            sempra.esOscuro = true;
            sempra.nivelDaño = 100;

            JuegoHarryPotter.hechizos.add(sempra);

            PetrificusTotallus petrificus = new PetrificusTotallus();
            petrificus.nombreHechizo = " Petrificus Totallus";
            petrificus.esOscuro = false;
            petrificus.nivelDaño = 500;

            JuegoHarryPotter.hechizos.add(petrificus);

            AvadaKedabra kedabra = new AvadaKedabra();
            kedabra.nombreHechizo = "Avada Kedabra";
            kedabra.esOscuro = true;
            kedabra.nivelDaño = 10000;

            JuegoHarryPotter.hechizos.add(kedabra);

            MaleficioCruciatus cruciatus = new MaleficioCruciatus();
            cruciatus.nombreHechizo = "Maleficio Cruciatus";
            cruciatus.esOscuro = true;
            cruciatus.nivelDaño = 300;

            JuegoHarryPotter.hechizos.add(cruciatus);

            Expelliarmus expelliarmus = new Expelliarmus();
            expelliarmus.nombreHechizo = "Expelliarmus";
            expelliarmus.esOscuro = false;
            expelliarmus.nivelDaño = 50;

            JuegoHarryPotter.hechizos.add(expelliarmus);

        }

    }

}
