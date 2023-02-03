package fr.dampierre;

public class AppSupermache {
    public static void main(String[] args) {

        // Tous les articles vendus dans le supermarché
        // Constructeur :
        // Le premier paramètre est le nom de l'article
        // Le second est le prix de l'article
        // Le troisième indique si l'article est en promotion
        Article choufleur = new Article("Chou-fleur extra", 3.50, false);
        Article roman = new Article("Les malheurs de Sophie", 8.50, true);
        Article camembert = new Article("Cremeux 100%MG", 3.80, false);
        Article livre = new Article("Java pour les Nuls", 28.50, false);
        Article boisson = new Article("Petit-lait", 2.50, true);
        Article petitspois = new Article("Pois surgeles", 4.35, false);
        Article poisson = new Article("Sardines", 6.50, false);
        Article biscuits = new Article("Cookies de grand-mere", 3.20, false);
        Article poires = new Article("Poires Williams", 4.80, false);
        Article cafe = new Article("100% Arabica", 6.90, true);
        Article pain = new Article("Pain d'epautre", 6.90, false);

        // Les caisses du supermarché
        // Constructeur :
        // Le premier paramètre est le numéro de caisse
        // Le second est le montant initial de la caisse

        Caisse caisse1 = new Caisse(1, 0.0);
        Caisse caisse2 = new Caisse(2, 0.0);

        // Les clients font leurs achats
        // La méthode "remplir" prend une quantité en second paramètre

        Caddie caddie1 = new Caddie();

        caddie1.remplir(choufleur, 2);
        caddie1.remplir(livre, 1);
        caddie1.remplir(biscuits, 4);
        caddie1.remplir(boisson, 6);
        caddie1.remplir(poisson, 2);

        Caddie caddie2 = new Caddie();

        caddie2.remplir(roman, 1);
        caddie2.remplir(camembert, 1);
        caddie2.remplir(petitspois, 2);
        caddie2.remplir(poires, 2);

        Caddie caddie3 = new Caddie();

        caddie3.remplir(cafe, 2);
        caddie3.remplir(pain, 1);
        caddie3.remplir(camembert, 2);

        // Les clients passent aux caisses

        caisse1.scanner(caddie1);
        caisse1.scanner(caddie2);
        caisse2.scanner(caddie3);

        // Fin de journée, on affiche les totaux de chaque caisse

        caisse1.totalCaisse();
        caisse2.totalCaisse();
    }
}