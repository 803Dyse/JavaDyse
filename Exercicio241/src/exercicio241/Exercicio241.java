/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio241;

/**
 * Esta es la clase principal
 * 
 * @author Bilo Alejandro Martins Gonzalez
 */
public class Exercicio241 {

    /**
     *  Metodo de la clase principal
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Year calendario = new Year();
        calendario.setLeapYear(false);
        calendario.ShowDaysOfMonth(4);
    }
    
}
