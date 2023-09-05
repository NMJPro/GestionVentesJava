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
public class addTab {
       public static void main(String[]Args){ 
    Scanner sc = new Scanner(System.in);
    int a,b, som;
    System.out.print(" Entrez le nombre d'éléments nombre du premier tableau  ");
    a = sc.nextInt();
    int tab1[] = new int[a]; // Création d'un tableau de réels à a valeurs 
    for(int index = 0; index!= a; index++){ // Cette boucle nous permet d'entrer les valeurs du tableau en fonction de la position 'index 
        System.out.print(" Entrez un nombre du tableau ");
        tab1[index] = sc.nextInt(); 
    }
    System.out.print(" Entrez le nombre d'éléments nombre du deuxième tableau  ");
    b = sc.nextInt();
    int tab2[] = new int[b];
    for(int index = 0; index!= b; index++){ // Cette boucle nous permet d'entrer les valeurs du tableau en fonction de la position 'index 
        System.out.print(" Entrez un nombre du tableau ");
        tab2[index] = sc.nextInt(); 
     }
    if (a==b){
    for(int index =0; index!=a && index!=b; index++){
       som = tab1[index] + tab2[index];
       System.out.println(" " +tab1[index] + "+" + tab2[index] + " = " + som +" ");
      }
    }
    else
       System.out.println("Les tableaux doitvent avoir la meme taille");
  }
 
}
