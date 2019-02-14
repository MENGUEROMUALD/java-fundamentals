/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devoirJava.sevenAcademy;

import java.util.Scanner;

/**
 *
 * @author operator.cam
 */
public class SommeNombre {
            /*
        * programme qui ajoute les nombre jusqu'au nombre entré par l'utilisateur
        */
    static Scanner clavier = new Scanner(System.in);
        
        public static void main(String[] args) {
                boolean v = true;
        
        do {
            System.out.println("Entrer un nombre positif");
            int nombre = clavier.nextInt();
            int tab[] = new int [nombre];
            int somme=0;
            for (int i = 0; i <= tab.length; i++) {
                
            somme += i;
            }
             System.out.println(somme);
        } while (v);
    }

}
