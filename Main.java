import Exercice1.*;

class Main {
  public static void main(String[] args) {
    Point unPoint = new Point();
    PointA unPointA = new PointA();

    unPoint.initialise(2, 7);
    unPointA.initialise(1, 8);

    unPointA.afficher();

    // Si nous n'avons pas les getters dans
    // Point nous ne pouvons pas accéder au valeur de x et y
  }
}