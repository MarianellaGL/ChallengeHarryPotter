package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
import app.hechizos.AvadaKedabra;
import app.hechizos.CaveInimicum;
import app.hechizos.Expelliarmus;
import app.hechizos.Hechizo;
import app.hechizos.MaleficioCruciatus;
import app.hechizos.SectumSempra;
import app.interfaces.IHacerMagia;
import app.personajes.Mago;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando juego");
        System.out.println("PRESIONE ENTER");
        JuegoHarryPotter.InicializarJuego();

        Teclado.nextLine();

        System.out.println("Seleccione 1 o 2 para elegir al personaje");
        Mago pj1 = (Mago) JuegoHarryPotter.ElegirPersonaje("Harry Potter");
        Mago pj2 = (Mago) JuegoHarryPotter.ElegirPersonaje("Severus Snape");
        int opcion = Teclado.nextInt();
        Teclado.nextLine();

        switch (opcion) {
        case 1:
            System.out.println("Elegiste a Harry Potter");

            break;

        case 2:
            System.out.println("Elegiste a Severus Snape");

            break;

        case 3:

            System.out.println("No hay más personajes");
            break;

        }
        {
          
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

            SectumSempra sempra = new SectumSempra();
            sempra.nombreHechizo = "Sectum Sempra";
            sempra.esOscuro = true;
            sempra.nivelDaño = 100;

            JuegoHarryPotter.hechizos.add(sempra);

            CaveInimicum inimicum = new CaveInimicum();
            inimicum.nombreHechizo = " Cave Inimicum";
            inimicum.esOscuro = false;
            inimicum.nivelDaño = 0;
            inimicum.nivelDefensa = 75;

            JuegoHarryPotter.hechizos.add(inimicum);

            AvadaKedabra kedabra = new AvadaKedabra();
            kedabra.nombreHechizo = "Avada Kedabra";
            kedabra.esOscuro = true;
            kedabra.nivelDaño = 100000;

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

            // tenemos que hacer que pj1 y pj 2 peleen y que alguno de los dos gane o
            // pierda, por ahora probemos algo tranqui.
            System.out.println("La salud de " + pj1.nombre + " es de " + pj1.salud);
            pj2.atacar(pj1, sempra);
            System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);

            boolean atacapj1 = true;
            int tipoHechizo = 0;
            Hechizo hechizoAtacante = null;
            Artefacto elArtefacto= null;
            int tipoArtefacto=0;

            while (pj1.salud>0 && pj2.salud>0) {
                System.out.println("Elegi el artefacto a utilizar: 1= pidra filosofal, 2= horror crux, 3=Guarda pelo, 4= diario tom rider");
                tipoArtefacto= Teclado.nextInt();
                switch(tipoArtefacto){
                    case 1:
                    elArtefacto=pFilosofal;
                    break;

                    case 2:
                    elArtefacto= hCrux;
                    break;
                    case 3:
                    elArtefacto=sSlytherin;
                    break;
                    case 4:
                    elArtefacto=tRiddle;
                    break;
                }
                
            }

            while (pj1.salud > 0 && pj2.salud > 0) {
                System.out.println("Elegi el hechizo a utilizar 1 = Sectum Sempra, 2 = Avada Kedabra, 3= Expelliarmus");
                tipoHechizo = Teclado.nextInt();
                switch (tipoHechizo) {
                case 1:
                    hechizoAtacante = sempra;
                    break;

                case 2:
                    hechizoAtacante = kedabra;
                    break;

                case 3:
                    hechizoAtacante = expelliarmus;
                    break;
                case 4:
                    hechizoAtacante = inimicum;
                    break;
                case 5:
                    hechizoAtacante = cruciatus;
                    break;
                }

                if (atacapj1) {

                    if (pj1 instanceof IHacerMagia) {

                        IHacerMagia mago1 = (IHacerMagia) pj1;
                        mago1.atacar(pj2, hechizoAtacante, null);
                    }

                    atacapj1 = false;
                } else if (pj2 instanceof IHacerMagia) {

                    IHacerMagia mago2 = (IHacerMagia) pj2;
                    mago2.atacar(pj1, hechizoAtacante, null);
                }

            }
            System.out.println("La salud de " + pj1.nombre + " es de " + pj1.salud);
            pj2.atacar(pj1, sempra, elArtefacto);
            System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);

        }

    }

    //
}