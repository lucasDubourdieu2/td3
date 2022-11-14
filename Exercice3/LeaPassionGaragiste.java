package Exercice3;
public class LeaPassionGaragiste {

  public static void main(String[] args) {
    Renault renault1 = new Renault(240, 42000.05, "bleu", 2019, 500);
    Renault renault2 = new Renault(240, 42000.05, "bleu", 2019, 500);

    Limousine limousine = new Limousine(150, 50000.89, "blanc", 10);

    System.out.println("prix voiture1 : " + renault1.calculerPrixDeVente());
    System.out.println("prix voiture2 : " + renault2.calculerPrixDeVente());
    System.out.println("prix limousine : " + limousine.calculerPrixDeVente());
  }

}