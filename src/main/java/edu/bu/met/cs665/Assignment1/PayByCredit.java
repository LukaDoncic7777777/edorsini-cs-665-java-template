package edu.bu.met.cs665.Assignment1;
import java.util.Scanner;
import static java.lang.System.exit;

public class PayByCredit implements PayMethod{

    /**
     * Start an object of PayByCredit
     */
    public PayByCredit(){};
    /**
     * Get the cardholder's name
     */
    private String name;
    /**
     * Get the password of the card
     */
    private String password;
    /**
     * Get the expiration year of the card
     */
    private String expiryear;

    /**
     * Allow user to pay by card
     * @param payamount
     */
    @Override
    public void collectMoney(int payamount) {
        Scanner c = new Scanner(System.in);
        Scanner f = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        System.out.print("Enter the CardHolder Name: ");
        name = c.nextLine();
        System.out.print("Enter the password: ");
        password = f.nextLine();
        System.out.print("Enter the expiration date of the card(FORMAT: MM/YYYY): ");
        expiryear = e.nextLine();
        if (name == null || password == null || expiryear == null){
            System.out.println("Cannot Process your card.");
            exit(0);
        }
        else {
            System.out.println("Data verification has been successful.");
            exit(0);
        }
    }


}
