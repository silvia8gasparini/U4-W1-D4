package Esercizio2;

public class DipendentePartTime extends Dipendente {
    private final int oreLavorate;
    private final double pagaOraria;

    public DipendentePartTime(String matricola, Dipartimento dipartimento, int oreLavorate, double pagaOraria) {
        super(matricola, dipartimento);
        this.oreLavorate = oreLavorate;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * pagaOraria;
    }
}
