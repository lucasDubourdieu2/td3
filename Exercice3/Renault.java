package Exercice3;

public class Renault extends Voiture {

  private int anneFabrication;

  private int reductionConstructeur;

  public Renault(int vmax, double prixvente, String couleur, int anneFabrication, int reductionConstructeur) {

    super(vmax, prixvente, couleur);
    this.anneFabrication = anneFabrication;
    this.reductionConstructeur = reductionConstructeur;
  }


  public double calculerPrixDeVente() {
    return this.calculerPrixDeVente() - reductionConstructeur;
  }

}