/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_java_Yvan;

/**
 *
 * @author Yvan  Fotso
 */
public class Point2d {
    private float x;
    private float y;
    public Point2d(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float y){
        this.y = y;
    }
    public float getY(){
        return this.x;
    }
    public void setY(float y){
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2d{" + "x = " + x + ", y = " + y + '}';
    }
    public void deplacerx(float d){
        this.x = this.x + d;
    }
     public void deplacery(float d){
        this.y = this.y + d;
    }
     public void translate(Vecteur2d v){
         deplacerx(v.getExtremite().getX()- v.getOrigine().getX());
         deplacery(v.getExtremite().getY()- v.getOrigine().getY());
     }
}
