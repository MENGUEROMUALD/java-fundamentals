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
public class Main {
    public static void main(String[] args) {
        
        User user = new User();
        user.setName("Romuald");
        user.setAge(45); 
        user.setHeight(145);
        user.setGender("Male");
        User user2 = new User("Romuald", 45, 145, "Male");
       
        
        if (user.equals(user2)) {
            System.out.println(user2.getName()+" "+
                    user2.getAge()+" "
                    +user2.getHeight()+" "
                    +user2.getGender());
        }else{
            System.out.println(user.getName()+" "+user.getAge()+" "+user.getHeight()+" "+user.getGender());
            System.out.println(user2.getName()+" "+
                    user2.getAge()+" "
                    +user2.getHeight()+" "
                    +user2.getGender());
        }
        
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());  
        
    }
    
    
}
