package Esercizio3;

public abstract class Dipendente implements CheckInable {
    // codice esistente

    @Override
    public void checkIn() {
        System.out.println("Dipendente " + getMatricola() + " ha iniziato il turno.");
    }
}
