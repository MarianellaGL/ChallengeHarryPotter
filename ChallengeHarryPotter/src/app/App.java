package app;

import app.artefactos.Artefacto;
import app.artefactos.CapaInvisibilidad;
import app.artefactos.VaritaSauco;
import app.hechizos.CaveInimicum;
import app.hechizos.Hechizo;
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
        

        CaveInimicum hechiDefensa = new CaveInimicum();
        hechiDefensa.esOscuro = false;
        hechiDefensa.nivelDaño = 25;
        hechiDefensa.nivelDefensa = 75;

        

        

        //tenemos que hacer que pj1 y pj 2 peleen y que alguno de los dos gane o pierda, por ahora probemos algo tranqui.
        
        JuegoHarryPotter.Atacan.add(hechiAtaque);
        System.out.println("La salud de "+ pj1.nombre + " es de "+ pj1.salud);
        pj2.atacar(pj1, hechiAtaque);
        System.out.println("La salud de " + pj2.nombre + " es de "+ pj2.salud);
    }
  /*
        if(pj1.estaVivo);

        JuegoHarryPotter.Defen.add(hechiDefensa);
        pj2.defenderse(pj1, hechiDefensa);
        if(pj2.estaVivo==false);
        pj1.salud=100;
        pj1 = nivelDaño -= nivelVida

        
/*/
    }




