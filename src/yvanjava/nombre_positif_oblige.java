/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yvanjava;


import java.util.Scanner;

/**
 *
 * @author Yvan Fotso
 */
public class nombre_positif_oblige {
    public static void main(String[]args){
        
        // Ici on exécute une boucle qui demandera d'entrer un nombre tant que le nombre entré sera négatif
        
        int a;
        int b = 0;
        Scanner sc= new Scanner(System.in);
       do {
          System.out.println("Entrez un nobre positif");
          a = sc.nextInt();
         } while(a < 0);
       
     /* Ici on lit une suite de nombres jusqu'a arriver a un nombre négatif puis on affiche la somme des nombres positifs lus
       avec le nombre de nombres lus et la moyenne avec la boucle do-while 
       */
       int s=0, i=0, moy;
       do{
           System.out.println("Entrez un nombre");
          a = sc.nextInt();
          s= s+a;
          i++;
       } while(a>=0);
       s=s-a;
       i--;
       moy = i==0? 0: s/i ;
       System.out.println( "La somme est : " +s + "  Le nombre de variables lues est" +i +"  La moyenne est:" +moy);
        
    /* Ici on lit une suite de nombres jusq'a arriver a un nombre négatif puis on affiche la somme des nombres positifs lus
       avec le nombre de nombres lus et la moyenne avec la boucle while 
       */
    while(b>=0){
    System.out.println("Entrez un nombre");
          b = sc.nextInt();
          s= s+b;
          i++;
    } 
     i--;
       moy = i==0? 0: s/i ;
       System.out.println( "La somme est : " +s + "  Le nombre de variables lues est" +i +"  La moyenne est:" +moy);
       
   }
}

