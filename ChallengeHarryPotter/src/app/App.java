package app;

import java.util.Scanner;

import app.hechizos.CaveInimicum;
import app.hechizos.SectumSempra;
import app.interfaces.IHacerMagia;
import app.personajes.Mago;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando juego");
        JuegoHarryPotter.InicializarJuego();

        Mago pj1 = (Mago) JuegoHarryPotter.ElegirPersonaje("Harry Potter");

        Mago pj2 = (Mago) JuegoHarryPotter.ElegirPersonaje("Severus Snape");

        SectumSempra hechiAtaque = new SectumSempra();
        hechiAtaque.esOscuro = true;
        hechiAtaque.nivelDaño = 100;

        JuegoHarryPotter.hechizos.add(hechiAtaque);

        CaveInimicum hechiDefensa = new CaveInimicum();
        hechiDefensa.esOscuro = false;
        hechiDefensa.nivelDaño = 25;
        hechiDefensa.nivelDefensa = 75;

        JuegoHarryPotter.hechizos.add(hechiDefensa);

        // tenemos que hacer que pj1 y pj 2 peleen y que alguno de los dos gane o
        // pierda, por ahora probemos algo tranqui.

        JuegoHarryPotter.hechizos.add(hechiAtaque);
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
