/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */

package exercicio244;



/**

 * Esta es la clase Wallet

 *

 * @author Bilo Alejandro Martins Gonzalez

 */

public class Wallet {



    /**

     *Variables money y card del metodo available.

     * @param money

     * @param card

     */

    public Wallet(double money, boolean card) {

        this.money = money;

        this.card = card;

    }



    private double money;

    private boolean card;



    /**

     * Metodo getter de la variable money

     * 

     * @return

     */

    public double getMoney() {

        return money;

    }



    /**

     * Metodo setter de la variable money

     * @param money

     */

    public void setMoney(double money) {

        this.money = money;

    }



    /**

     * Metodo getter de la variable card

     * 

     * @return

     */

    public boolean isCard() {

        return card;

    }



    /**

     *Metodo setter de la variable card

     * 

     * @param card

     */

    public void setCard(boolean card) {

        this.card = card;

    }



    /**

     * Metodo available donde definimos las strings de aviso.

     * 

     * @return

     */

    public String available() {

        String aviso = "Si teño efectivo.";

        String aviso2 = "Necesitas ir a un cajero";

        String aviso3 = "Vete a una sucursal";

        String result;

        

        if(money>100){

            result = aviso;

       

        } else if (money<0){

            result = aviso3;

        } else {

            result = aviso2;

        }

        return result;

    }



    /**

     * Metodos da clase principal

     *

     * @param args Este inicializa las variables de wallet y las muestra por pantalla.

     */

    public static void main(String[] args) {

        Wallet carteira1 = new Wallet(250.0, true);

        Wallet carteira2 = new Wallet(25.0, false);

        Wallet carteira3 = new Wallet(10.0, true);



        System.out.println(carteira1.available());

        System.out.println(carteira2.available());

        System.out.println(carteira3.available());

    }



}

