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
public class tableau_semaine {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String tableauSemaine[] = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" };
        System.out.print("Entrez un chiffre corresponfdant à un jour de la semaine  ");
        int jour = sc.nextInt();
         if (jour == 1){
             System.out.println(tableauSemaine[0]);
         }
         else if (jour == 2){
            System.out.println(tableauSemaine[1]); 
         }
         else if (jour == 3){
            System.out.println(tableauSemaine[2]); 
         }
        else if (jour == 4){
            System.out.println(tableauSemaine[3]); 
         }
         else if (jour == 5){
            System.out.println(tableauSemaine[4]); 
         }
         else if (jour == 6){
            System.out.println(tableauSemaine[5]); 
         }
         else if (jour == 7){
            System.out.println(tableauSemaine[6]); 
         }
         else {
            System.out.println("Entrez un jour correct"); 
         }
    }
    
}
