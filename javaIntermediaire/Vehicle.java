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
public class Vehicle {
    private int doors;
    private int speed;
    public String color;
    
    public Vehicle(String colo){
        this.color = colo;
    }
    public void getColor(){
        System.out.println(color);
    }
    public void setColor(String color){
        this.color = color;
    }
    
   public static int Variable(int tab[]){
      return tab[0] + tab[1];    
   }
   
   public static int racineCarre(int nombre){
       int nbr = (int)Math.sqrt(nombre);
       return nbr;
   }
   
   public int getNombre(){
       Scanner clavier = new Scanner(System.in);
       System.out.println("Entrer un nombre svp");
       int nbrs = clavier.nextInt();
       return nbrs;
   }
   public void setNombre(int nombre){
             System.out.println(Math.pow(nombre, 2));
   }

}
