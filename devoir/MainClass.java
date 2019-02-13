/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romylove.javaIntermediaire;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author operator.cam
 */
public class MainClass {
    static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) { 
//        System.out.println("Entrer un premier intervale svp !!!");
//        int var1 = clavier.nextInt();
//        System.out.println("Entrer un deuxième intervale svp !!!");
//        int var2 = clavier.nextInt();
//        
//        if( var1 < 0 || var2< 0){
//            System.out.println("Désolé mais les intervales ne doivent pas etres négatifs");
//        }else if(var1 < var2){
//            int var3 = var2-var1;
//            for (int i = 2; i <= var3; i+=2) {
//                System.out.println("ces nombres paires sont : "+i);
//            }
//        }else if( var1 > var2){
//           int var3 = var1 - var2;
//            for (int i = 2; i <= var3; i++) {
//                System.out.println("ces nombres paires sont : "+i);
//            }
//        }else{
//            System.out.println("il n'y'a pas de nombre paire car les deux valeurs sont égaux");
//        }


//        int var;
//        
//        do {
//            System.out.println("Entrer un nombre svp !!!");
//            var = clavier.nextInt();
//            if (var < 0) {
//                System.out.println("Désolé mais nous ne faison pas la multiplication des nombres négatif");
//                System.out.println("Entrer un nombre svp !!!");
//            }else{
//            for (int i = 1; i <= 12; i++) {
//                System.out.println(var+" X "+i+" = "+ var*i);
//            }
//            }
//            
//        } while (var > 0 );
//        
        
        
/**
 * devoir de java 
 * exercice 1
 * ce programme permet de verifier si le caractère entrer
 * par l'utilisateur est une voyelle
 */
//
//    String[] caratere = {"a","o","e","u","i","y"};    
////    System.out.println("Entrer un caractère svp !!!");
//   
//    boolean cont = false;
//    boolean fr = true;
//    boolean go = true;
    
    /*
    * cas avec le if
    */
    
//        if (car != "") {
//            System.out.println("desoler");
//       }
//else{
//            for (int i = 0; i < caratere.length; i++) {
//           
//            if(caratere[i].equalsIgnoreCase(car)) {
//                cont = true;
//            }
//        }
//        if (cont) {
//            System.out.println("bien");
//        }else{
//            System.out.println("rien");
//        }
//        }

/*
* cas avec le while
*/

//while(fr){
//    System.out.println("Entrer un caractère svp !!!");
//     String car = clavier.nextLine();
//    switch(car.toLowerCase()){
//    case "a":
//        System.out.println("bien");
//        break;
//    case "u":
//        System.out.println("bien");
//        break;
//    case "o":
//        System.out.println("bien");
//        break;
//    case "i":
//        System.out.println("bien");
//        break;
//    case "e":
//        System.out.println("bien");
//        break;
//    case "y":
//        System.out.println("bien");
//        break;
//    case "-1":
//        System.out.println("desoler");
//        fr = false;
//        break;
//    default :
//        System.out.println("rien");
//        break;        
//        
//    }
//}
 

/**
 * autre cas avec le do while
 */
//        do {
//            System.out.println("Entrer un caractère svp !!!");
//     String car = clavier.nextLine();
//    switch(car.toLowerCase()){
//    case "a":
//        System.out.println("bien");
//        break;
//    case "u":
//        System.out.println("bien");
//        break;
//    case "o":
//        System.out.println("bien");
//        break;
//    case "i":
//        System.out.println("bien");
//        break;
//    case "e":
//        System.out.println("bien");
//        break;
//    case "y":
//        System.out.println("bien");
//        break;
//    case "-1":
//        System.out.println("desoler");
//        fr = false;
//        break;
//    default :
//        System.out.println("rien");
//        break;        
//        
//    }
//        } while (fr);
        
        
        
        
        /*
        * calculatrice
        * operation : addition,soustration, multiplication,division, exponentiation
        */
        
//        while(go){
//              System.out.println("Entrer un premier nombre");
//            double nbr1 = clavier.nextInt();
//            clavier.nextLine();
//        System.out.println("Quelle opération souhaité vous faire parmi celle ci-dessous?");
//      
//        
//        
//        System.out.println("+");
//        System.out.println("-");
//        System.out.println("/");
//        System.out.println("*");
//        System.out.println("Exp");
//          String op = clavier.nextLine();
//        switch(op){
//            case "+":
//            System.out.println("Entrer un deuxième nombre");
//            double nbr2 = clavier.nextInt();
//                if (nbr2 == 0) {
//                    System.out.println("desoler mais nous ne pouvons pas continuer");
//                    go = false;
//                    break;
//                }
//                double var = nbr1 + nbr2;
//                System.out.println(nbr1+" + "+nbr2+" = "+var);
//                break;
//            case "*":
//                System.out.println("Entrer un deuxième nombre");
//                double nbr3 = clavier.nextInt();
//                if (nbr3 == 0) {
//                    System.out.println("desoler mais nous ne pouvons pas continuer");
//                    go = false;
//                    break;
//                }
//                double var1 = nbr1 * nbr3;
//                 System.out.println(nbr1+" * "+nbr3+" = "+var1);
//                break;
//            case "-":
//                  System.out.println("Entrer un deuxième nombre");
//                  double nbr4 = clavier.nextInt();
//                  if (nbr4 == 0) {
//                    System.out.println("desoler mais nous ne pouvons pas continuer");
//                    go = false;
//                    break;
//                }
//                  if(nbr4 < 0){
//                      System.out.println("Désolé mais votre deuxième nombre être positif");
//                  }else if(nbr4 > nbr1){
//                      System.out.println("Le deuxième nombre doit etre inférieur au premier");
//                  }else{
//                      double var2 = nbr1 - nbr4;
//                      System.out.println(nbr1+" - "+nbr4+" = "+var2);
//                  }
//                break;
//            case "/":
//                System.out.println("Entrer un deuxième nombre");
//                double nbr5 = clavier.nextInt();
//                if (nbr5 == 0) {
//                    System.out.println("desoler mais nous ne pouvons pas continuer");
//                    go = false;
//                    break;
//                }
//                double var3 = nbr1/nbr5;
//                System.out.println(nbr1+" / "+nbr5+" = "+var3);                
//                break;
//            case "Exp":
//                System.out.println("Entrer votre exposant");
//                int expo = clavier.nextInt();
//                if (expo == 0) {
//                    System.out.println("desoler mais nous ne pouvons pas continuer");
//                    go = false;
//                    break;
//                }
//                double var4 = Math.pow(nbr1, expo);
//                System.out.println(nbr1+" Exposant "+expo+" = "+var4); 
//                break;
//                
//            }
//        }
        
        /*
        * programme qui ajoute les nombre jusqu'au nombre entré par l'utilisateur
        */
//        
        
//        boolean v = true;
        
//        do {
//            System.out.println("Entrer un nombre positif");
//            int nombre = clavier.nextInt();
//            int tab[] = new int [nombre];
//            int somme=0;
//            for (int i = 0; i <= tab.length; i++) {
//                
//            somme += i;
//            }
//             System.out.println(somme);
//        } while (v);
        
        
       
//
//            int somm = 0;
//        for (int i = 0; i <= 5; i++) {
//            somm += i;
//            System.out.println(somm);
//        }
//
//            Scanner clavier = new Scanner(System.in);
//            double result = 0,nbrA_convertir;
//            char mode_convertion = ' ',recommencer= ' ';
//            System.out.println("CONVERTISSEUR DEGRES CELSUS ET DEGRES FAHRENHEIT");
//            System.out.println("-------------------------------------------------------------");
//          
//         do {
//             do {
//                 mode_convertion = ' ';
//                 System.out.println("Choisissez ce que voulez-vous convertir :");
//                    System.out.println("1- Convertire les celsus en fahrenheit");
//                    System.out.println("2- Convertire les fahrenheit en celsus");
//                    mode_convertion = clavier.nextLine().charAt(0);
//                    if (mode_convertion != '1' && mode_convertion != '2') {
//                        System.out.println("Désoler mais vous n'avez pas fait le bon choix");
//                 }
//             } while (mode_convertion != '1' && mode_convertion != '2');
//             
//             System.out.println("Température à convertir : ");
//             nbrA_convertir = clavier.nextDouble();
//             clavier.nextLine();
//             if (mode_convertion == '1') {
//                 result = ((9/5)*nbrA_convertir)+32;
//                 System.out.println(nbrA_convertir + " °C correspond à : "+result+" F");
//             }else{
//                 result = ((nbrA_convertir - 32)*5)/9;
//                 System.out.println(nbrA_convertir + " °C correspond à : "+result+" C");
//             }
//           
//             do {
//                 System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");
//                 recommencer = clavier.nextLine().charAt(0);
//                 
//             } while (recommencer !='O' && recommencer != 'N');
//             
//                                    
//        } while (recommencer == 'O');
//         System.out.println("Au revoir !!!");
//        

/**
* factoriel d'un nombre : cas 1
*
**/
            boolean v = true;
//            int somme = 1;
//        do {
//            System.out.println("Entrer un nombre pour calculer son factoriel");
//            int facto = clavier.nextInt();
//            
//            
//            if (facto >= 0) {
//                if (facto != 0) {
//                for (int i = facto -1; i >= 1; i--) {
//                    facto*=i;
//                }
//                System.out.println("ton factoriel est : "+facto);
//            }else{
//                facto = 1;
//                System.out.println("ton factoriel est : "+facto);
//            }
//            }else{
//                System.out.println("vous avez entrer un mauvais nombre");
//            }
//            
//            
//             
//        } while (v);
        
        
//        Factoriel facto = new Factoriel();
//        
//        facto.factoriel();
//                fibonacci d'un nombre
        

        
        
        
    }
}
