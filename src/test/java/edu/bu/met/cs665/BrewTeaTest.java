package edu.bu.met.cs665;

import edu.bu.met.cs665.Assignment1.BrewTea;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BrewTeaTest {
    public BrewTeaTest(){}
    @Test
    public void testgetBlacktea() {
        BrewTea c = new BrewTea(3, 3,4);
        assertEquals(3, c.getBlacktea());
    }

    @Test
    public void testsetBlacktea() {
        BrewTea c = new BrewTea(3, 3,4);
        c.setBlacktea(5);
        assertEquals(5, c.getBlacktea());
    }

    @Test
    public void testgetGreentea() {
        BrewTea c = new BrewTea(3, 3,4);
        assertEquals(3, c.getGreentea());
    }

    @Test
    public void testsetGreentea() {
        BrewTea c = new BrewTea(3, 3,4);
        c.setGreentea(6);
        assertEquals(6, c.getGreentea());
    }

    @Test
    public void testgetYellowtea() {
        BrewTea c = new BrewTea(3, 3,4);
        assertEquals(4, c.getYellowtea());
    }

    @Test
    public void testsetYellowtea() {
        BrewTea c = new BrewTea(3, 3,4);
        c.setYellowtea(6);
        assertEquals(6, c.getYellowtea());
    }
}