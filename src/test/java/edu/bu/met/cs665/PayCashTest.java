package edu.bu.met.cs665;

import edu.bu.met.cs665.Assignment1.PayCash;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PayCashTest {
    public PayCashTest(){}
    @Test
    public void testgetPayamount() {
        PayCash c = new PayCash(6);
        assertEquals(6, c.getPayamount());
    }

    @Test
    public void testSetPayamount() {
        PayCash cashpayer = new PayCash(6);
        cashpayer.setPayamount(6);
        assertEquals(6, cashpayer.getPayamount());
    }
}