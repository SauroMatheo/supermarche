package fr.dampierre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Caisse {
    private int numero;
    private double totalCaisse;

    Caisse(int numero, double montantTotal) {
        this.numero = numero;
        this.totalCaisse = montantTotal;
    }

    public int getNumero() {
        return numero;
    }

    public void resetCaisse() {
        totalCaisse = 0;
    }

    public void totalCaisse() {
        System.out.println(String.format("La caisse numéro %d a encaissé %.2f euros aujourd'hui", numero,
                totalCaisse));
    }

    public String date() {
        Date dateDuJour = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");
        String dateFormatée = formatDate.format(dateDuJour); // exemple : 18/02/2027

        return dateFormatée;
    }

    public void scanner(Caddie caddie) {
        double total = 0;
        String separateur = "=========================================";

        System.out.println(separateur);
        System.out.println(date());
        System.out.println("Caisse numéro " + numero + "\n");

        System.out.println("");
        for (Lot lot : caddie.getPanier()) {
            total += lot.calculePrix(true);
            System.out.println(lot.ligneTicket());
        }

        System.out.println("\nMontant à payer : " + total + " euros");
        System.out.println(separateur);
        totalCaisse += total;
    }
}
