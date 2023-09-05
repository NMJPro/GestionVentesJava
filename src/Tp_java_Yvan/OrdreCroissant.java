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
 * Ce programme prends en entrée trois nombres et les affiche par
 * ordre croissant
 */
public class OrdreCroissant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre ");
        int a = sc.nextInt();
        System.out.print("Entrez un second nombre ");
        int b = sc.nextInt();
        System.out.print("Entrez un troisième nombre ");
        int c = sc.nextInt();
        if (a < b && b < c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        if (b < a && a < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        if (b < c && c < a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        if (b > a && a > c) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        if (a < b && b > c) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        if (a > b && b > c) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        if (a == b && b == c) {
            System.out.println("Les nombres sont égaux ");
        }
    }

}
