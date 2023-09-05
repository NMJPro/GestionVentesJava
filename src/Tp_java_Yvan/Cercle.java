/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_java_Yvan;

/**
 *
 * @author Yvan Fotso
 */
public class Cercle { 
  private Point2d Centre;
  private float rayon;

    public Cercle(Point2d Centre, float rayon) {
        this.Centre = Centre;
        this.rayon = rayon;
    }
  

    public Point2d getCentre() {
        return Centre;
    }

    public void setCentre(Point2d Centre) {
        this.Centre = Centre;
    }

    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" + "Centre=" + Centre + ", rayon=" + rayon + '}';
    }
  

  public void deplacerx(float d){
      Centre.deplacerx(d);
  }
    public void deplacery(float d){
      Centre.deplacery(d);
  }
}
