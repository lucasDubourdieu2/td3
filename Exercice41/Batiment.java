package Exercice41;

public class Batiment {

  private String adress;

  private double surface;

  public Batiment(String adress, double surface) {
    this.adress = adress;
    this.surface = surface;
  }

  @Override
  public String toString() {
    return "l'adresse : " + adress + " surface habitable : " + surface;
  }

  public double getSurfaceHabitable() {
    return surface;
  }

}
