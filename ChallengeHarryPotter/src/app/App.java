package app;

import app.hechizos.SectumSempra;
import app.personajes.Mago;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando juego");
        JuegoHarryPotter.InicializarJuego();

        Mago pj1 = (Mago) JuegoHarryPotter.ElegirPersonaje("Harry Potter");

        Mago pj2 = (Mago) JuegoHarryPotter.ElegirPersonaje("Severus Snape");

        SectumSempra hechiAtaque = new SectumSempra();
        hechiAtaque.esOscuro = true;
        hechiAtaque.nivelDaño = 100;

        //tenemos que hacer que pj1 y pj 2 peleen y que alguno de los dos gane o pierda, por ahora probemos algo tranqui.


        JuegoHarryPotter.Atacan.add(hechiAtaque);

        pj2.atacar(pj1, hechiAtaque);

        if(pj1.estaVivo)
        


    }

}



