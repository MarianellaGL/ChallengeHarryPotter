package app;

import app.hechizos.SectumSempra;
import app.personajes.Mago;
import app.personajes.Personaje;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando juego");
        JuegoHarryPotter.InicializarJuego();

        Mago pj1 = (Mago) JuegoHarryPotter.ElegirPersonaje("Harry Potter");

        Mago pj2 = (Mago) JuegoHarryPotter.ElegirPersonaje("Severus Snape");

        pj2.atacar(pj1, );

    }

}
