package edu.bu.met.cs665.Assignment1;

import edu.bu.met.cs665.Main;

import java.util.Scanner;

/**
 * This includes the class of Brewing Coffee
 */
public class BrewCoffee extends Main {
    /**
     * This is the price of Espresso
     */
    static private int Espresso = 3;
    /**
     * This is the price of Americano
     */
    static private int Americano = 3;
    /**
     * This is the price of Latte
     */
    static private int Latte_Macchiato = 4;
    /**
     * Base price of each drink;
     */
    private int payamount;

    /**
     * Choose which type of coffee do user want
     */
    public void Coffee_Choice() {
        System.out.println("Enter your choice: 1)Espresso 2)Americano 3)Latte Macchiato");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        /**
         * Switching between different types of drink
         */

        switch (choice) {
            case 1:
                payamount = Espresso;
                AddCodiment(payamount);
            case 2:
                payamount = Americano;
                AddCodiment(payamount);
            case 3:
                payamount = Latte_Macchiato;
                AddCodiment(payamount);
                break;
            default:
                break;
        }
    }

    /**
     * Decide whether user need codiment or not
     */
    private void AddCodiment(int payamount){
        int limit = 3;
        System.out.println("Do you need to add milk or sugar? Enter: (Y/y)Add Codiment, (N/n)Skip this Step!");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        /**
         * Choose how much sugar or milk to add into the Coffee
         */
        switch (c) {
            case 'y':
            case 'Y':
                System.out.println("How much sugar do you need? Enter a scale from 0 to 3: ");
                Scanner s = new Scanner(System.in);
                int sugarChoice = s.nextInt();
                if (sugarChoice > 0){
                    payamount += sugarChoice;
                }
                System.out.println("How much milk do you need? Enter a scale from 0 to 3: ");
                Scanner m = new Scanner(System.in);
                int milkChoice = m.nextInt();
                if (milkChoice > 0){
                    payamount += milkChoice;
                }
                if (sugarChoice > limit || milkChoice > limit){
                    System.out.println("Please enter valid scale!");
                    break;
                }
                else{
                    Bill b = new Bill();
                    b.PayBill(payamount);
                }
            case 'n':
            case 'N':
                Bill d = new Bill();
                d.PayBill(payamount);
            default:
                break;
        }
    }
}
