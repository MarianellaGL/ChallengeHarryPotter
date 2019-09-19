package app.personajes;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
    public String nombre;
    public boolean estaVivo = true;
    public int salud = 100;

    //un personaje no maneja una lista, 
    //sacar las listas de aca

    public List<Mago> LosMagos = new ArrayList<Mago>();
    public static List<Muggle> LosComunes = new ArrayList<Muggle>();
    public List<Elfo> losElfos = new ArrayList<Elfo>();
    public List<Criatura> losBichos = new ArrayList<Criatura>();

    public Mago getMago() {

        for (Mago ma : this.LosMagos)
            if (ma.nombre == nombre) {

                return ma;
            }

        return null;
    }

    public Criatura getCriatura(String nombreCriatura) {
        for (Criatura cr : this.losBichos)
            if (cr.nombreCriatura == nombre) {

                return cr;
            }

        return null;

    }

    public Elfo getElfo(String nombre) {

        for (Elfo ef : this.losElfos)

            if (ef.nombreCriatura == nombre) {

                return ef;
            }
        return null;
    }

    public boolean estaVivo() {
        if (salud > 0)
            return true;

        return false;

    }

}