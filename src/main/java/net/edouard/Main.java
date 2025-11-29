package net.edouard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader lecture = new BufferedReader(new InputStreamReader(System.in));
        int vitesse = 0;
        int temps = 0;
        int distance = 0;

        // demander la saisir utilisateur
        System.out.println("Veuillez indiquer la vitesse en m/s:");
        vitesse = Integer.parseInt(lecture.readLine());
        System.out.println("Veuillez saisir le temps en secondes :");
        temps = lecture.read();

        // calculer la distance parcourue
        distance = vitesse * temps;

        // afficher la distance en m et en Km
        System.out.println("La distance parcourue est de :"+distance+" m");
        System.out.println("La distance en Km est de : "+distance/1000+" Km");
    }
}