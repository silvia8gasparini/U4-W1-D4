package Esercizio3;

public class Volontario implements CheckInable {
    private final String nome;
    private final int eta;
    private final String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + " ha iniziato il servizio.");
    }

    // opzionale: getter se servono altrove
    public String getNome() { return nome; }
    public int getEta() { return eta; }
    public String getCv() { return cv; }
}
