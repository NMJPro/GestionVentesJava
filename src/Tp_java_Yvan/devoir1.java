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
 * Les jours de la semaine selon un numéro donné
 */
public class devoir1 {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTREZ UN NOMBRE REPRESENTANT UN JOUR DE LA SEMAINE ");
    int jour= sc.nextInt();
    if(jour == 1){
        System.out.println("Lundi");
    }
    else if(jour == 2){
       System.out.println("Mardi");   
      }  
     else if(jour == 3){
       System.out.println("Mercredi");   
      }  
    else if(jour == 4){
       System.out.println("Jeudi");   
      }  
      else if(jour == 5){
       System.out.println("Vendredi");   
      }  
    else if(jour == 6){
       System.out.println("Samedi");   
      }  
    else if(jour == 7){
       System.out.println("Dimanche");   
      }  
        else {
       System.out.println("Entrez un jour valide");     
    }
}
    
}
