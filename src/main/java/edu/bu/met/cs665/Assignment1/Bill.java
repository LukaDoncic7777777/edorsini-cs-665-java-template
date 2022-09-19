package edu.bu.met.cs665.Assignment1;

import java.util.Scanner;

public class Bill {
    /**
     * This is the function for paying the bill
     * @param payamount
     */
    public void PayBill(int payamount){
        System.out.printf("How do you want to pay for your bill? Cash or Card? \n");
        Scanner a = new Scanner(System.in);
        String choice = a.nextLine();
        if (choice.toLowerCase().equals("cash")){
            PayCash c = new PayCash(payamount);
            c.collectMoney(payamount);
        }
        if (choice.toLowerCase().equals("card")){
            PayByCredit b = new PayByCredit();
            b.collectMoney(payamount);
        }
        else {
            System.out.printf("Invalid input!");
        }
    }
}
