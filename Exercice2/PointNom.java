package Exercice2.*;

public class PointNom extends Point1 {

 /**
 * Le nom du point
 */
private String nom;

public PointNom(int x, int y, String nom) {
    super(x, y);
    this.nom = nom;
  }

  public PointNom(String nom) {
    super();
    this.nom = nom;
  }

  public void setPointNom(int x, int y, String nom) {
    this.setPoint(x, y);
    this.nom = nom;

  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void affCoordNom() {
    this.afficheCoords();
    System.out.println(" et le nom : " + this.nom);
  }


}

  

  

  

