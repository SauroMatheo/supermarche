package fr.dampierre;

public class Article {
    private String nom;
    private double prix;
    private Boolean promotion;

    Article(String nom, double prix, Boolean promotion) {
        this.nom = nom;
        this.prix = prix;
        this.promotion = promotion;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public Boolean getPromotion() {
        return promotion;
    }
}
