/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_java_Yvan;
// import java.util.Scanner;

/**
 *
 * @author Yvan Fotso
 */
public class Mainclass {
    public static void main(String[]Args){
        
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Entrez x");
        int x = sc.nextInt();*/ /* ici moi mm je peux définir x et y */
        
        Point2d p = new Point2d(2,3);
        Vecteur2d v= new Vecteur2d(new Point2d(0,0), new Point2d(3,4));
        Cercle c = new Cercle(new Point2d(0,0), 10);
        p.toString();
        System.out.println(p.toString());
        p.deplacerx(10);
        System.out.println(p.toString());
        p.deplacery(2);
        System.out.println(p.toString());
        p.translate(v);
        System.out.println(p.toString()); 
    }
    
}
