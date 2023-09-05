/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yvanjava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Lecture et ecriture dans un fichier spécifique 
 * @author Yvan Fotso
 */
public class lectureClass {
    public static void main (String[]args) throws FileNotFoundException, IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\ISMAT\\DEUXIEME ANNEE\\pragrammation evenementiel.txt",true));
        bw.newLine();
        bw.write("Bonjour je m'appelle Yvan et j'écris ce texte avec le java");
        bw.flush();
        bw.close();
    }
    
}
