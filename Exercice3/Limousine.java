package Exercice3;
public class Limousine extends Voiture {

  private int longueur;

  public Limousine(int vmax, double prix, String couleur, int longueur) {
    super(vmax, prix, couleur);
    this.longueur = longueur;
  }

  
  public double calculerPrixDeVente() {
    double reduction = longueur > 6 ? 0.95 : 0.90;
    return this.calculerPrixDeVente() * reduction;
  }

}