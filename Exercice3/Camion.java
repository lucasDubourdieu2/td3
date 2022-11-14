package Exercice3;

public class Camion extends Voiture {

  private int poids;

  public Camion(int vmax, double prix, String couleur, int poids) {
    super(vmax, prix, couleur);
    this.poids = poids;
    
  }
  

  public double calculerPrixDeVente() {
    double reduction = poids > 2000 ? 0.10 : .020;
    reduction *= this.calculerPrixDeVente();
    return this.calculerPrixDeVente() - reduction;
  }

}