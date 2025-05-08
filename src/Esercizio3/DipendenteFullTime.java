package Esercizio3;

import Esercizio2.Dipartimento;
import Esercizio2.Dipendente;

public class DipendenteFullTime extends Dipendente {
    private final double stipendioMensile;

    public DipendenteFullTime(String matricola, Dipartimento dipartimento, double stipendioMensile) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}
