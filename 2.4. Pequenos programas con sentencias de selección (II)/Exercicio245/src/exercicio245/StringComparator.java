/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio245;

/**
 * Clase del StringComparator que compara los textos y declara sus variables.
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class StringComparator {

    private String a = "pepino";
    private String b = "salchicha";
    private String c = "hamburguesa";

    /**
     * Metodo getter de la var a
     *
     * @return
     */
    public String getA() {
        return a;
    }

    /**
     * Metodo setter de la var a
     *
     * @param a
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * Metodo getter de la var b
     *
     * @return
     */
    public String getB() {
        return b;
    }

    /**
     * Metodo setter de la var b
     *
     * @param b
     */
    public void setB(String b) {
        this.b = b;
    }

    /**
     * Metodo getter de la var c
     *
     * @return
     */
    public String getC() {
        return c;
    }

    /**
     * Metodo setter de la var c
     *
     * @param c
     */
    public void setC(String c) {
        this.c = c;
    }

    /**
     *Metodo que compara las strings y me dice cual es la mayor si cumplen sus condiciones
     * @return
     */
    public String getBigger() {

        String bigger;

        if (a.length() > b.length() && (a.length() > c.length())) {
            bigger = a;
        } else if (b.length() > c.length()) {
            bigger = b;
        } else {
            bigger = c;
        }
        return bigger;
    }

    /**
     * Este es el metodo de la clase principal
     *
     * @param args aqui creo el objeto texto de la clase StringComparator para
     * que me muestre las variables.
     */
    public static void main(String[] args) {
        
        StringComparator texto = new StringComparator();
        System.out.println(texto.getBigger());

    }

}
