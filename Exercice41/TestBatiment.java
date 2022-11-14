package Exercice41;

public class TestBatiment {

  public static void main(String[] args) {

    Maison maison = new Maison("adresse maison", 125.50, 70, 5);
    Immeuble immeuble = new Immeuble("adresse immeuble", 125.50, 70, 5);
    Batiment batiment = new Batiment("adresse Batiment", 125.50);

    Batiment[] batimentTab = new Batiment[10];

    System.out.println(maison);
    System.out.println(immeuble);
    System.out.println(batiment);

    batimentTab[0] = immeuble;
    batimentTab[1] = maison;

    System.out.println("Affichage tableau : ");
    for (Batiment i : batimentTab) {
      System.out.println(i);
    }

    System.out.println(surfaceHabitableTotale(batimentTab));

  }

  public static double surfaceHabitableTotale(Batiment[] tabBat) {
    double surfaceTotale = 0;
    for (Batiment i : tabBat) {
      surfaceTotale += i.getSurfaceHabitable();
    }

    return surfaceTotale;
  }

  public static int surfaceJardinTotale(Batiment[] tabBat) {
    int surfaceJardinTotale = 0;
    for (Batiment i : tabBat) {
      if (i instanceOf Maison) {
        surfaceJardinTotale += i.getSurfaceHabitable();
      }
    }
    return surfaceJardinTotale;

  }

}