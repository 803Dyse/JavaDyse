/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio255;

/**
 * Esta es la clase principal
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class Exercicio255 {

    /**
     * Metodos de la clase principal
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int count = 0 ;
        while (count < 10) {
            if ((x % 2) != 0) {
                System.out.println(x);
                count++;
            } else {
            }
            x++;
        }
    }
}