package app;

import java.util.Scanner;

import app.hechizos.AvadaKedabra;
import app.hechizos.CaveInimicum;
import app.hechizos.Expelliarmus;
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

            SectumSempra hechiAtaque = new SectumSempra();
            hechiAtaque.nombreHechizo = "Sectum Sempra";
            hechiAtaque.esOscuro = true;
            hechiAtaque.nivelDaño = 100;

            JuegoHarryPotter.hechizos.add(hechiAtaque);

            CaveInimicum hechiDefensa = new CaveInimicum();
            hechiDefensa.nombreHechizo = " Cave Inimicum";
            hechiDefensa.esOscuro = false;
            hechiDefensa.nivelDaño = 0;
            hechiDefensa.nivelDefensa = 75;

            JuegoHarryPotter.hechizos.add(hechiDefensa);

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
            pj2.atacar(pj1, hechiAtaque);
            System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);

            boolean atacapj1 = true;
            int tipoHechizo = 0;
            Hechizo hechizoAtacante = null;

            while (pj1.salud > 0 && pj2.salud > 0) {
                System.out.println("Elegi el hechizo a utilizar 1 = Sectum Sempra, 2 = Avada Kedabra, 3= Expelliarmus");
                 tipoHechizo = Teclado.nextInt();
                 switch (tipoHechizo) {
                     case 1:
                         hechizoAtacante = hechiAtaque;
                         break;
                 
                     case 2:
                         hechizoAtacante = kedabra;
                         break;

                    case 3:
                    hechizoAtacante= expelliarmus;
                    break;
                 }
                
                
                if (atacapj1) {

                    if (pj1 instanceof IHacerMagia) {

                        IHacerMagia mago1 = (IHacerMagia) pj1;
                        mago1.atacar(pj2, hechizoAtacante);
                    }

                    atacapj1 = false;
                } else if (pj2 instanceof IHacerMagia) {

                    IHacerMagia mago2 = (IHacerMagia) pj2;
                    mago2.atacar(pj1, hechizoAtacante );
                }

            }
            System.out.println("La salud de " + pj1.nombre + " es de " + pj1.salud);
            pj2.atacar(pj1, hechiAtaque);
            System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);

        }

    }


    //
}