/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_java_Yvan;

import java.util.Scanner;

/**
 *
 * @author Yvan fotso
 */
public class tableau2 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.print(" Entrez le nombre d'éléments nombre du tableau ");
    a = sc.nextInt();
    int TableauNombre[] = new int[a]; // Création d'un tableau de réels à 6 valeurs maxi 
    for(int index = 0; index!= a; index++){ // Cette boucle nous permet d'entrer les valeurs du tableau en fonction de la position 'index 
        System.out.print(" Entrez un nombre du tableau ");
        TableauNombre[index] = sc.nextInt(); 
}
    System.out.print("Les éléments du tableau sont: ");
    negatif(TableauNombre);
    affiche(TableauNombre);
    int position=recherche(TableauNombre, 3);
    System.out.print("la valeur de x se trouve à la position: " +position);
    }
    
    /*
    
    for(int nb : TableauNombre){ // Ici on cree une variable qui reçoit les eléments du tableau
        System.out.print(nb + " " );
        }
    
    ou alors on peut taper ce code apres [System.out.print("Les éléments du tableau sont: ");] : 
   
    for ( int i = 0; i < a; i++);{
   System.out.print(TableauNombre[i]+ " "); 
    }
    */
   

// Ecriture d'une méthode 
    
    public static void affiche(int[] TableauNombre){
       for(int nb : TableauNombre){ // Ici on cree une variable qui reçoit les eléments du tableau
        System.out.print(nb + " " );
        }
       
       /* OU    for (int index = 0; index < TableauNombre.length; index++){
   System.out.print(TableauNombre[index]+ " "); 
    }
               */
    }
    
    public static void negatif(int[] TableauNombre){ // méthode qui transforme les nombres négatifs en 0
        for (int index = 0; index < TableauNombre.length; index++){
         if(TableauNombre[index] < 0){
            TableauNombre[index] = 0; 
         } 
    }
  }
    
  public static int recherche(int[] TableauNombre, int nombre){ // Methode qui recherche une valeur définie dans un tableau et renvoie sa position
      for (int index = 0; index < TableauNombre.length; index++){
          if(TableauNombre[index] == nombre){
           return(index);
      }
    }
   return -1;
  } 
}
  