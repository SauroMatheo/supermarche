package fr.dampierre;

import java.util.ArrayList;

public class Caddie {
    /*
     * private ArrayList<Object[]> panier = new ArrayList<>();
     * 
     * public void remplir(Article article, int nombre) {
     * Object[] array = new Object[2];
     * array[0] = article;
     * array[1] = nombre;
     * 
     * panier.add(array);
     * }
     * 
     * 
     * public ArrayList<Object[]> getPanier() {
     * return panier;
     * }
     */

    private ArrayList<Lot> panier = new ArrayList<>();

    public void remplir(Article article, int nombre) {
        panier.add(new Lot(article, nombre));
    }

    public ArrayList<Lot> getPanier() {
        return panier;
    }
}
