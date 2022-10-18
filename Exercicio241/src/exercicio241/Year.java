/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio241;

/**
 *Esta e a clase year.
 * 
 * @author Bilo Alejandro Martins Gonzalez
 */
public class Year {

    private boolean leapYear;

    /**
     * Este metodo retorna el valor de la variable.
     * 
     * @return
     */
    public boolean isLeapYear() {
        return leapYear;
    }

    /**
     *Este es el metodo setter de leapyear
     * 
     * @param leapYear
     */
    public void setLeapYear(boolean leapYear) {
        this.leapYear = leapYear;
    }

    /**
     *
     * Metodo para indicar los meses del calendario
     * 
     * @param numberOfMonth
     */
    public void ShowDaysOfMonth(int numberOfMonth) {
        int numberOfDays;

        switch (numberOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                System.out.println("Este mes tiene " + numberOfDays + " dias.");
                break;

            case 9:
            case 6:
            case 4:
            case 11:
                numberOfDays = 30;
                System.out.println("Este mes tiene " + numberOfDays + " dias.");
                break;
                
            case 2:
                if (leapYear = true) {
                    numberOfDays = 29;
                    System.out.println("Este mes tiene " + numberOfDays + " dias.");
                } else {
                    numberOfDays = 28;
                    System.out.println("Este mes tiene " + numberOfDays + " dias.");
                }
        }
    }
}
