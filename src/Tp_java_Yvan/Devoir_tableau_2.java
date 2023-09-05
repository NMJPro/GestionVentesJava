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
public class Devoir_tableau_2 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a ;
    System.out.print(" Entrez le nombre d'éléments nombre du tableau ");
    a = sc.nextInt();
    int TableauNombre[] = new int[a]; // Création d'un tableau de réels à a valeurs  
    int somme = 0, valpos = 0, valneg = 0, moyval, pgval = 0, ppval = 0; // Déclaration des vbariables locales à utiliser
    for(int index = 0; index!= a; index++){ // Cette boucle nous permet d'entrer les valeurs du tableau en fonction de la position 'index 
        System.out.print(" Entrez un nombre du tableau ");
        TableauNombre[index] = sc.nextInt(); 
        somme = somme + TableauNombre[index];
          pgval = TableauNombre[0];
          ppval = TableauNombre[0];
        if (TableauNombre[index] > pgval){
            pgval = TableauNombre[index];
        }
        
        else {
            ppval = TableauNombre[index];
        }
        
        if (TableauNombre[index] > 0){
            valpos++;
        }
        else{
          valneg++;  
        }
    }
        
    moyval = somme/a;
    System.out.println("La somme est :" +somme);
    System.out.println("Le nombre de valeurs positifs est :" +valpos);
    System.out.println("La nombre de valeurs négatives est :" +valneg);
    System.out.println("La plus grand nombre est :" +pgval);
    System.out.println("La plus petit nombre est :" +ppval);
    System.out.println("La moyenne est :" +moyval);
}
    
}
