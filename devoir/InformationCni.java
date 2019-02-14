/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devoirJava.sevenAcademy;

/**
 *
 * @author operator.cam
 */
public class InformationCni {
    public static void main(String[] args) {
        String nom = "MENGUE LOKO";
        String prenom = "ROMUALD ARISTIDE";
        String dateNaisse = "19/06/1993";
        String lieux = "Douala";
        String nomPere = "LOKO NYAMSI I JACAB HILLE";
        String nomMere = "NYAMWE SUZANNE";
        String profession = "ELEVE";
        String adresse = "DLA PK 13";
        double taille = 1.8;
        char sexe = 'M';
        long NumCni = 115367603;
        String dateDelivrance = "13/07/2013";
        String dateEXpiration = "13/07/2023";
        String autoriteAdmin = "Martin MBARGA - NGUELE";
        
        System.out.println("INFORMATION DE VOTRE CNI");
        System.out.println("--------------------------");
        
        System.out.println("NOM : "+nom);
        System.out.println("PRENOM : "+prenom);
        System.out.println("Né le : "+dateNaisse);
        System.out.println("A : "+lieux);
        System.out.println("Père : "+nomPere);
        System.out.println("Mère : "+nomMere);
        System.out.println("Profession "+profession);
        System.out.println("Adresse : "+adresse);
        System.out.println("Taille : "+taille+"M");
        System.out.println("Sexe : "+sexe);
        System.out.println("N° : "+NumCni);
        System.out.println("Date de délivrance : "+dateDelivrance);
        System.out.println("Signé par : "+autoriteAdmin);
        System.out.println("Date expiration : "+dateEXpiration);
        
    }
}
