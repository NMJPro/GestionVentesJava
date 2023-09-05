/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_java_Yvan;

import java.util.Scanner;

/**
 *
 * @author Yvan Fotso
 */
public class Qoutient_reste {
    public static void main(String[]args){
       Scanner sc= new Scanner(System.in);
       System.out.print("Entrez un nombre ");
       double a=sc.nextDouble();
       System.out.print("Entrez un second nombre ");
       double b=sc.nextDouble();
       if (b>0) {
       double c= (a%b);
       double d=(a/b);
       System.out.println("Le reste de la division entre le premier et le second nnombre est " +c);
       System.out.print("La division entre le premier et le second nombre est " +d);
       }
       else{
       System.out.println("La division est impossible donc le modulo aussi");
               }
   }     
}