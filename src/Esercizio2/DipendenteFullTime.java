package Esercizio2;

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
