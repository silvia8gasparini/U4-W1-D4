package Esercizio3;

public class Main {
    public static void main(String[] args) {
        CheckInable[] persone = new CheckInable[5];

        persone[0] = new DipendenteFullTime("FT001", Dipartimento.PRODUZIONE, 2000.0);
        persone[1] = new DipendentePartTime("PT001", Dipartimento.VENDITE, 50, 12.0);
        persone[2] = new Dirigente("DIR001", Dipartimento.AMMINISTRAZIONE, 3000.0, 800.0);
        persone[3] = new Volontario("Alice", 25, "Laurea in Scienze Sociali");
        persone[4] = new Volontario("Marco", 33, "Esperienza in Croce Rossa");

        for (CheckInable persona : persone) {
            persona.checkIn();
        }
    }
}
