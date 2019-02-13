/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romylove.javaIntermediaire;

import java.util.Scanner;

/**
 *
 * @author operator.cam
 */
public class Factoriel {
    Scanner clavier = new Scanner(System.in);
    public void factoriel(){
        
        
      int somme = 1;
      boolean f = true;
      
        do {
            
            System.out.println("Entrer un nombre positif");
            int nombre = clavier.nextInt();
            int tab[] = new int [nombre];
          
                for (int i = 1; i <= tab.length; i++) {
                    somme *= i;
                }
                System.out.println(somme);

        } while (f);       
    }
    
 
  
}
