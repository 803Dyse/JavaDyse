/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio243;

/**
 * Esta é a clase main
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class Exercicio243 {

    /**
     * metodo da clase main
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 25;
        int cost = 0;
        String card = "paro";
        String secondcard = "unicard";

        if (age < 30) {
            if ("unicard".equals(card) || "paro".equals(card)) {
                cost = 40;

            }
            if ("unicard".equals(secondcard) && "paro".equals(card)) {
                cost = 35;
            } else {
                cost = 50;
            }

        } else if (age > 55) {
            if ("xubicard".equals(card) || "paro".equals(card)) {
                cost = 45;
            } else {
                cost = 50;
            }
        } else {
            if ("familianumerosa".equals(card)) {
                cost = 65;
            } else {
                cost = 75;
            }
        }
        System.out.println("O prezo do cuarto no hotel custa " + cost);
    }
}
