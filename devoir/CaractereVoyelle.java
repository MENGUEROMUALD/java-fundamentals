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
public class CaractereVoyelle {
    static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) {
        /**
 * autre cas avec le do while
 */
        boolean fr = true;
       do {
                    System.out.println("Entrer un caractère svp !!!");
             String car = clavier.nextLine();
            switch(car.toLowerCase()){
            case "a":
                System.out.println("Vous avez entrer une voyelle");
                break;
            case "u":
                System.out.println("Vous avez entrer une voyelle");
                break;
            case "o":
                System.out.println("Vous avez entrer une voyelle");
                break;
            case "i":
                System.out.println("Vous avez entrer une voyelle");
                break;
            case "e":
                System.out.println("Vous avez entrer une voyelle");
                break;
            case "y":
                System.out.println("Vous avez entrer une voyelle");
                break;
            case "-1":
                System.out.println("Vous n'avez pas entrer une voyelle");
                fr = false;
                break;
            default :
                System.out.println("Vous n'avez pas entrer une voyelle");
                break;        

            }
          } while (fr);
        
    }
}
