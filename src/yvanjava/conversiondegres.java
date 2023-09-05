/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yvanjava;

import java.util.Scanner;

/**
 *
 * @author  Yva, Fotso
 */
public class conversiondegres {
    public static void main(String[]Args){
        int convert;
        double temp, converti;
        int RECOMMENCER ;
        System.out.println("CONVERTISSEUR DEGRE CELCIUS ET DEGRES FAHRENHEIT");
        System.out.println("-----------------------------------------------");
        do{
            do{
        System.out.println("Choisissez le mode de conversion");
        System.out.println("1- Convertisseur celcius - Fahrenheit");
        System.out.println("2- Convertisseur Fahrenheit - celcius");
        Scanner sc = new Scanner(System.in);
         convert = sc.nextInt(); 
            }while(convert != 1 && convert !=2);
        System.out.println("Température à convertir");
        Scanner sc = new Scanner(System.in);
        temp = sc.nextDouble();
        if(convert==1){
            converti = ((9/5)*temp) + 32 ;
            System.out.println(temp + "°C corrrespond à :" + converti + "°F");
        }else if(convert==2){
            converti = ((temp - 32)*5)/9 ;
            System.out.println(temp + "°F corrrespond à :" + converti + "°C");
    }
        do{
            System.out.println("Voulez vous recommencer? (1/0)");
                RECOMMENCER = sc.nextInt();
        }while(RECOMMENCER  !=1 && RECOMMENCER  !=0 );  
       }while(RECOMMENCER == 1);
        System.out.println("Au revoir et à la prochaine");
    }
    
}
