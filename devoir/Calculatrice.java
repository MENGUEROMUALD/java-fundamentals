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
public class Calculatrice {
    public static void main(String[] args) {
                /*
        * calculatrice
        * operation : addition,soustration, multiplication,division, exponentiation
        */
        Scanner clavier = new Scanner(System.in);
        boolean go = true;
        while(go){
              System.out.println("Entrer un premier nombre");
            double nbr1 = clavier.nextInt();
            clavier.nextLine();
        System.out.println("Quelle opération souhaité vous faire parmi celle ci-dessous?");
        
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");
        System.out.println("*");
        System.out.println("Exp");
          String op = clavier.nextLine();
        switch(op){
            case "+":
            System.out.println("Entrer un deuxième nombre");
            double nbr2 = clavier.nextInt();
                if (nbr2 == 0) {
                    System.out.println("desoler mais nous ne pouvons pas continuer");
                    go = false;
                    break;
                }
                double var = nbr1 + nbr2;
                System.out.println(nbr1+" + "+nbr2+" = "+var);
                break;
            case "*":
                System.out.println("Entrer un deuxième nombre");
                double nbr3 = clavier.nextInt();
                if (nbr3 == 0) {
                    System.out.println("desoler mais nous ne pouvons pas continuer");
                    go = false;
                    break;
                }
                double var1 = nbr1 * nbr3;
                 System.out.println(nbr1+" * "+nbr3+" = "+var1);
                break;
            case "-":
                  System.out.println("Entrer un deuxième nombre");
                  double nbr4 = clavier.nextInt();
                  if (nbr4 == 0) {
                    System.out.println("desoler mais nous ne pouvons pas continuer");
                    go = false;
                    break;
                }
                  if(nbr4 < 0){
                      System.out.println("Désolé mais votre deuxième nombre être positif");
                  }else if(nbr4 > nbr1){
                      System.out.println("Le deuxième nombre doit etre inférieur au premier");
                  }else{
                      double var2 = nbr1 - nbr4;
                      System.out.println(nbr1+" - "+nbr4+" = "+var2);
                  }
                break;
            case "/":
                System.out.println("Entrer un deuxième nombre");
                double nbr5 = clavier.nextInt();
                if (nbr5 == 0) {
                    System.out.println("desoler mais nous ne pouvons pas continuer");
                    go = false;
                    break;
                }
                double var3 = nbr1/nbr5;
                System.out.println(nbr1+" / "+nbr5+" = "+var3);                
                break;
            case "Exp":
                System.out.println("Entrer votre exposant");
                int expo = clavier.nextInt();
                if (expo == 0) {
                    System.out.println("desoler mais nous ne pouvons pas continuer");
                    go = false;
                    break;
                }
                double var4 = Math.pow(nbr1, expo);
                System.out.println(nbr1+" Exposant "+expo+" = "+var4); 
                break;
                
            }
        }
    }
}
