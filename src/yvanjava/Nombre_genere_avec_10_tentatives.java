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
 * @author Yvan Fotso ... on génère un nombre au hasard entre 0 et 1000 et on demande à l'utilisateur de le trouver en 10 tentatives;
 */
public class Nombre_genere_avec_10_tentatives {
    public static void main(String[]args){  
        Scanner sc= new Scanner(System.in);
        Random random = new Random();
        int a;
        int nombre, tentatives , recommencer = 0; 
         do{
             tentatives=0;
             a = random.nextInt(1000);
             System.out.println("un nombre à été généré devinez le en 10 tentatives ou moins");
             do{
               System.out.println("Entrez le nombre généré");
               nombre = sc.nextInt();
               tentatives++;
                if (nombre < a)
                  System.out.println(" C'est petit ");
                else if (nombre > a)
                  System.out.println(" C'est grand ");
            } while (nombre != a && tentatives < 10);
             if  (tentatives >= 10 )
              System.out.println("Vous avez dépassé le nombre de tentatives recquis");
             else if (tentatives <= 10 )
              System.out.println("Nombre trouvé en " + tentatives + " tentatives");
             do{
             System.out.println("Voulez vous recommencer?? 1 pour oui et 0 pour non");
             recommencer = sc.nextInt();
             }while (recommencer != 1 && recommencer !=0 );
        }while(recommencer == 1);  
    }     
}

