package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[3];

        dipendenti[0] = new Dipendente("A001", 1500.00, Dipartimento.PRODUZIONE);
        dipendenti[1] = new Dipendente("B002", 1800.50, Dipartimento.AMMINISTRAZIONE);
        dipendenti[2] = new Dipendente("C003", 1600.75, Dipartimento.VENDITE);

        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola());
        }
    }
}
