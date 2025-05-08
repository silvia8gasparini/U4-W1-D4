package Esercizio3;

import Esercizio2.Dipartimento;
import Esercizio2.Dipendente;

public class Dirigente extends Dipendente {
    private final double stipendioFisso;
    private final double bonusMensile;

    public Dirigente(String matricola, Dipartimento dipartimento, double stipendioFisso, double bonusMensile) {
        super(matricola, dipartimento);
        this.stipendioFisso = stipendioFisso;
        this.bonusMensile = bonusMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioFisso + bonusMensile;
    }
}
