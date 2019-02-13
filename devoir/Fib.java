/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romylove.javaIntermediaire;

import java.util.Scanner;

/**
 *
 * la fonction fib(n) calcul la suite fibonacci d'un nombre
 * @param n est le nombre à calculer
 * F(0) = 0 et F(1) = 1
 */
public class Fib {
        public static long fib(int n){

           if (n == 0) {
                return 0;
            } 
           if (n <= 2) {
                return 1;
            }
            long item = fib(n -1)+ fib(n-2);
            return item;
       }  
 
        public static void main(String[] args) {

            do {
                Scanner clavier = new Scanner(System.in);
                   System.out.println("Entrer un nombre");
                   int nb = clavier.nextInt();
                System.out.println("F("+nb+") = "+fib(nb));
            } while (true);

        }
}