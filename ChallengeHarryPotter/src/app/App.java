package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Mago;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando juego");
        System.out.println("PRESIONE ENTER");
        JuegoHarryPotter.InicializarJuego();

        Teclado.nextLine();

        System.out.println("pulse 1 para elegir a Harry Potter o 2 para elegir a Severus Snape");
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

        // tenemos que hacer que pj1 y pj 2 peleen y que alguno de los dos gane o
        // pierda, por ahora probemos algo tranqui.
        System.out.println("La salud de " + pj1.nombre + " es de " + pj1.salud);
        System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);

        boolean atacapj1 = true;
        int tipoHechizo = 0;
        int artefactos = 0;
        Hechizo hechizoAtacante = null;
        Artefacto nombreArtefacto = null;

        System.out.println(
                "Elegi el artefacto a utilizar: 1= pidra filosofal, 2= horror crux, 3=Guarda pelo, 4= diario tom rider");
        artefactos = Teclado.nextInt();

        Artefacto pFilosofal = (Artefacto) JuegoHarryPotter.ElegirArtefacto("Piedra Filosofal");
        Artefacto hCrux = (Artefacto) JuegoHarryPotter.ElegirArtefacto("Horror crux");
        Artefacto sSlytherin = (Artefacto) JuegoHarryPotter.ElegirArtefacto("Guardapelo de Salazar Slytherin");
        Artefacto tRiddle = (Artefacto) JuegoHarryPotter.ElegirArtefacto("Diario de Tom Riddle");

        Teclado.nextLine();

        switch (artefactos) {
        case 1:
            nombreArtefacto = pFilosofal;
            break;

        case 2:
            nombreArtefacto = hCrux;
            break;
        case 3:
            nombreArtefacto = sSlytherin;
            break;
        case 4:
            nombreArtefacto = tRiddle;
            break;
        }

        while (pj1.salud > 0 && pj2.salud > 0) {

            if (atacapj1) {
                System.out.println(
                        "Elegi el hechizo a utilizar 1 = Sectum Sempra, 2 = Avada Kedabra, 3= Expelliarmus, 4= Cave Inimicun, 5= Maleficio Cruciatus");
                tipoHechizo = Teclado.nextInt();

                Hechizo sempra = (Hechizo) JuegoHarryPotter.ElegirHechizo("Sectum Sempra");
                Hechizo kedabra = (Hechizo) JuegoHarryPotter.ElegirHechizo("Avada Kedabra");
                Hechizo expelliarmus = (Hechizo) JuegoHarryPotter.ElegirHechizo("Expelliarmus");
                Hechizo inimicum = (Hechizo) JuegoHarryPotter.ElegirHechizo("Cave Inimicum");
                Hechizo cruciatus = (Hechizo) JuegoHarryPotter.ElegirHechizo("Maleficio Cruciatus");

                switch (tipoHechizo) {
                case 1:
                    hechizoAtacante = sempra;
                    System.out.println( pj1.nombre + "Ha usado" + hechizoAtacante.nombreHechizo);
                    break;

                case 2:
                    hechizoAtacante = kedabra;
                    System.out.println( pj1.nombre + " Ha usado " + hechizoAtacante.nombreHechizo);
                    break;

                case 3:
                    hechizoAtacante = expelliarmus;
                    System.out.println( pj1.nombre + " Ha usado " + hechizoAtacante.nombreHechizo);
                    break;
                case 4:
                    hechizoAtacante = inimicum;
                    System.out.println( pj1.nombre + " Ha usado " + hechizoAtacante.nombreHechizo);
                    break;
                case 5:
                    hechizoAtacante = cruciatus; 
                    System.out.println( pj1.nombre + " Ha usado " + hechizoAtacante.nombreHechizo);
                    break;
                }

                if (pj1 instanceof IHacerMagia) {

                    IHacerMagia mago1 = (IHacerMagia) pj1;

                    mago1.atacar(pj2, hechizoAtacante);

                    atacapj1 = !atacapj1;
                } 
            }else if (pj2 instanceof IHacerMagia) {

                IHacerMagia mago2 = (IHacerMagia) pj2;
                mago2.atacar(pj1, hechizoAtacante);
            }

        }
        System.out.println("La salud de " + pj1.nombre + " es de " + pj1.salud);
        pj2.atacar(pj1, hechizoAtacante);
        System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);

        if(pj1.salud == 0){
            System.out.println (pj1.nombre + " Ha perdido el duelo. ");
    
        }else if (pj2.salud == 0){

        System.out.println(pj2.nombre + " Ha ganado el duelo.");
        } else{
            System.out.println(pj2.nombre + " Ha perdido el duelo ");
        }
    }
}
