/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_java_Yvan;

/**
 *
 * @author hp1
 */
public class Vecteur2d {
        private Point2d origine;
    private Point2d extremite;

    public Vecteur2d(Point2d origine, Point2d extremite) {
        this.origine = origine;
        this.extremite = extremite;
    }

    public Point2d getOrigine() {
        return origine;
    }

    public Point2d getExtremite() {
        return extremite;
    }

    public void setOrigine(Point2d origine) {
        this.origine = origine;
    }

    public void setExtremite(Point2d extremite) {
        this.extremite = extremite;
    }

    @Override
    public String toString() {
        return "Vecteur2d{" + "origine = " + origine + ", extremite = " + extremite + '}';
    }
    

}
