package Exercice41;

public class Maison extends Batiment {

  private int nbPieces;

  private int surfaceJardin;

  public Maison(String adresse, double surfaceH, int surfaceJ, int nbPieces) {
    super(adresse, surfaceH);
    this.nbPieces = nbPieces;
    this.surfaceJardin = surfaceJ;

  }

  @Override
  public String toString() {

    return super.toString()
        + " Maison avec : " + nbPieces
        + " pieces et un jardin de  : "
        + surfaceJardin + " de surface";
  }

  public int getSurfaceJardin() {
    return surfaceJardin;
  }
}
