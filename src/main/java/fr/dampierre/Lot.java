package fr.dampierre;

public class Lot {
    private Article article;
    private int quantite;

    Lot(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public double calculePrix(Boolean reductionComprise) {
        if (reductionComprise & article.getPromotion()) {
            return article.getPrix() / 2 * quantite;
        } else {
            return article.getPrix() * quantite;
        }
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantite() {
        return quantite;
    }

    public String ligneTicket() {
        String sortie = article.getNom() + " : ";

        sortie += article.getPrix() + " x " + quantite;
        sortie += " = " + calculePrix(false) + " euros";

        if (article.getPromotion()) {
            sortie += " (remise 50 %) => " + calculePrix(true) + " euros";
        }
        return sortie;
    }
}
