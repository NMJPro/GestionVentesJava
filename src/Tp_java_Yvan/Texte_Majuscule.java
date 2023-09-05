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
 * 
 */
public class Texte_Majuscule {
     public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Entrez une phrase ");
        String phrase=sc.nextLine().toUpperCase();
        System.out.print(phrase);
}

}


