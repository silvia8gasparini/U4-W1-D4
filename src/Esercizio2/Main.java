package Esercizio2;

public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[4];

        dipendenti[0] = new DipendenteFullTime("FT001", Dipartimento.PRODUZIONE, 2000.00);
        dipendenti[1] = new DipendentePartTime("PT001", Dipartimento.VENDITE, 80, 15.50);
        dipendenti[2] = new Dirigente("DIR001", Dipartimento.AMMINISTRAZIONE, 3000.00, 500.00);
        dipendenti[3] = new DipendentePartTime("PT002", Dipartimento.VENDITE, 60, 12.00);

        double totaleStipendi = 0.0;
        for (Dipendente d : dipendenti) {
            double stipendio = d.calculateSalary();
            totaleStipendi += stipendio;
            System.out.println("Matricola: " + d.getMatricola() + " | Stipendio: €" + stipendio);
        }

        System.out.println("\nTotale stipendi da erogare: €" + totaleStipendi);
    }
}
