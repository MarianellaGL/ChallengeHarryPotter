package app;

import java.util.Scanner;

import app.hechizos.AvadaKedabra;
import app.hechizos.CaveInimicum;
import app.hechizos.MaleficioCruciatus;
import app.hechizos.SectumSempra;
import app.interfaces.IHacerMagia;
import app.personajes.Mago;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando juego");
        
        JuegoHarryPotter.InicializarJuego();

        Teclado.nextLine();


        Mago pj1 = (Mago) JuegoHarryPotter.ElegirPersonaje("Harry Potter");

        System.out.println("Seleccione letra para elegir al personaje");
        

        Mago pj2 = (Mago) JuegoHarryPotter.ElegirPersonaje("Severus Snape");

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

        // tenemos que hacer que pj1 y pj 2 peleen y que alguno de los dos gane o
        // pierda, por ahora probemos algo tranqui.
        System.out.println("La salud de " + pj1.nombre + " es de " + pj1.salud);
        pj2.atacar(pj1, hechiAtaque);
        System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);
    
        boolean atacapj1 = true;

    while (pj1.salud > 0 && pj2.salud >0){


        if(atacapj1){

            if(pj1 instanceof IHacerMagia){

                IHacerMagia mago1 = (IHacerMagia)pj1;
                mago1.atacar(pj2, hechiAtaque);
            }

        atacapj1 = false;
        }else if (pj2 instanceof IHacerMagia){

            IHacerMagia mago2 = (IHacerMagia)pj2;
            mago2.atacar(pj2, hechiAtaque);
        }


        }
        System.out.println("La salud de " + pj1.nombre + " es de " + pj1.salud);
        pj2.atacar(pj1, hechiAtaque);
        System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);
    
    }      



}
