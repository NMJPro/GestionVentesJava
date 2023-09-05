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
public class tabcroiss {
    @SuppressWarnings("empty-statement")
    public static void main(String[]Args){
            Scanner sc = new Scanner(System.in);
            int nb; 
            int index;
            int inter;
    System.out.print(" Entrez le nombre d'éléments nombre du premier tableau  ");
    nb = sc.nextInt();
    int tab[] = new int[nb]; // Création d'un tableau de réels à a valeurs 
    for(index = 0; index!= nb; index++){ // Cette boucle nous permet d'entrer les valeurs du tableau en fonction de la position 'index 
        System.out.print(" Entrez un nombre du tableau ");
        tab[index] = sc.nextInt(); 
    }
    System.out.println(tab[index]);
    do{
     for(index=0; index!=nb; index++){
        if(tab[index+1] < tab[index]){
            inter = tab[index+1];
            tab[index] = tab[index+1] ;
            tab[index+1] = inter;
        }
     }
    }while(index < nb-1);
  for(int nbre : tab){ // Ici on cree une variable qui reçoit les eléments du tableau
        System.out.print(nb + " " );
        }
   }
}
