/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yvanjava;

import java.util.Scanner; 
/**
 *
 * @author hp1
 */
public class Random {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = 0; 
    Random r = new Random();
    a= Math.abs(a);
    a= 10 + a%91;
    System.out.print(a);
    }

}
