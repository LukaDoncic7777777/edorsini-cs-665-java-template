package edu.bu.met.cs665.Assignment1;

import java.util.Scanner;


/**
 * User choose to pay by cash
 */
public class PayCash implements PayMethod {
    private int payamount;

    public PayCash(int payamount){
        super();
        this.payamount = payamount;
    }
    /**
     * Get the payment amount
     * @return
     */
    public int getPayamount() {
        return payamount;
    }

    /**
     * Setter of payment amount
     * @param payamount
     */
    public void setPayamount(int payamount) {
        this.payamount = payamount;
    }

    /**
     * Intended for person who pay in cash
     * @param payamount
     */

    @Override
    public void collectMoney(int payamount) {
        System.out.println("Please insert your cash: ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money > payamount) {
            System.out.println("Thanks for your payment! Enjoy!");
            System.out.printf("Here is ur change $%d\n", (money - payamount));
            System.exit(0);
        }
        if (money == payamount){
            System.out.println("Thanks for your payment! Enjoy!");
            System.exit(0);
        }
        else {
            System.out.println("Invalid Cash Amount! Please Try Again!");
            collectMoney(payamount);
        }
    }


}
