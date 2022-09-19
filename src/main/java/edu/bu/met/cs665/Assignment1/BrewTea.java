package edu.bu.met.cs665.Assignment1;
import edu.bu.met.cs665.Main;

import java.util.Scanner;

public class BrewTea extends Main {
    /**
     * Create a BrewTea object using blacktea, greentea, yellowtea price
     * @param blacktea
     * @param greentea
     * @param yellowtea
     */
    public BrewTea(int blacktea, int greentea, int yellowtea){
        super();
        this.blacktea = blacktea;
        this.greentea = greentea;
        this.yellowtea = yellowtea;
    }

    /**
     * getter of Blacktea
     * @return
     */
    public int getBlacktea() {
        return blacktea;
    }

    /**
     * Setter of Black Tea
     * @param blacktea
     */
    public void setBlacktea(int blacktea) {
        this.blacktea = blacktea;
    }
    /**
     * getter of Greentea
     * @return
     */
    public int getGreentea() {
        return greentea;
    }

    /**
     * Setter of Green Tea
     * @param greentea
     */
    public void setGreentea(int greentea) {
        this.greentea = greentea;
    }
    /**
     * getter of Yellowtea
     * @return
     */
    public int getYellowtea() {
        return yellowtea;
    }

    /**
     * Setter of Yellowtea
     * @param yellowtea
     */
    public void setYellowtea(int yellowtea) {
        this.yellowtea = yellowtea;
    }

    /**
     * This is the base price for blacktea
     */
    private int blacktea = 3;
    /**
     * This is the base price for greentea
     */
    private int greentea = 3;
    /**
     * This is the base price for yellowtea
     */
    private int yellowtea = 4;
    /**
     * Price which keep track of the amount user need to pay
     */
    private int payamount;
    /**
     * Choose between which tea user prefer
     */
    public void Tea_Choice() {
        System.out.println("Enter your choice: 1)Black Tea 2)Green Tea 3)Yellow Tea");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        do {
            switch (choice) {
                case 1:
                    payamount = blacktea;
                    Bill a = new Bill();
                    a.PayBill(payamount);
                case 2:
                    payamount = greentea;
                    Bill b = new Bill();
                    b.PayBill(payamount);
                case 3:
                    payamount = yellowtea;
                    Bill c = new Bill();
                    c.PayBill(payamount);
                default:
                    break;
            }
        }while(choice != 4);
    }



}
