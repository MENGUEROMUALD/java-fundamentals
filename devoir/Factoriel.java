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
public class Factoriel {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("***************** FACTORIEL D'UN NOMBRE *****************");
        System.out.println("---------------------------------------------------------");
        
        do {
            System.out.println("Entrer un nombre positif svp");
            int nombre = clavier.nextInt();
            System.out.println(nombre+"! = "+Factoriel.factoriel(nombre));
        } while (true);
    }
    /*
    * Exercice 1: programme qui calcule le factoriel d'un nombre
    */
    public static int factoriel(int n){
        
        if (n <= 1) {
            return 1;
        }
        int result = n*factoriel(n-1);
        return result;
    }
    
}
