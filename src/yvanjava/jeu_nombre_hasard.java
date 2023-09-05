/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yvanjava;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Yvan Fotso ... on génère un nombre au hasard entre 0 et 1000 et on demande à l'utilisateur de le trouver;
 */
public class jeu_nombre_hasard {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Random random = new Random();
        int a;
        int nombre, recommencer ;
        do{
            System.out.println("un nombre à été généré devinez le ");
             a = random.nextInt(1000);
             recommencer = 0;
             do{
             System.out.println("Entrez le nombre généré");
             nombre = sc.nextInt();
              if (nombre < a)
               System.out.println(" C'est petit ");
              else if (nombre > a)
               System.out.println(" C'est grand ");
           } while (nombre != a);
             System.out.println("Nombre trouvé");
              do{
              System.out.println("Voulez vous recommencer??? 1 pour OUI et 0 pour NON");
              recommencer = sc.nextInt();
               }while(recommencer !=1 && recommencer !=0);
        }while(recommencer == 1);
    }
    
}
