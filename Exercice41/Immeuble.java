package Exercice41;

public class Immeuble extends Batiment {

  private int nbAppart;

  public Immeuble(String adresse, double surfaceH, int surfaceJ, int nbAppart) {
    super(adresse, surfaceH);
    this.nbAppart = nbAppart;

  }

  @Override
  public String toString() {

    return super.toString()
        + " Immeuble avec : " + nbAppart
        + " appartements";
  }
}
