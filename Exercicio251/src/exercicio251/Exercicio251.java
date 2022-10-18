/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package exercicio251;

/**
 *
 *
 *
 * @author Bilo Alejandro Martins Gonzalez
 *
 */
public class Exercicio251 {

    /**
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        int x = 8;
        int f = x;

        while (x > 1) {
            f = f * (x - 1);
            x--;
            System.out.println(f);
        }
    }
}
