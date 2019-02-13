/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romylove.javaIntermediaire;

/**
 *
 * @author operator.cam
 */
public class EmailPassword {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       
        if (!(email.matches("(.*)@(.*)."))) {
            System.out.println("Adresse email invalide");
        }else{
             this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        
        if (password.length() < 6 || password.length() >10) {
            System.out.println("Le mot de passe trop court");
        }else{
            this.password = password;
        }
    }

}
