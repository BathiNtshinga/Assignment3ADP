package org.ntshinga;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
    extraFood testExtraFood = new extraFood();

    @Before
    public void setUp() throws Exception {
        testExtraFood.setMenu("Chicken");
        testExtraFood.setType("Meat");
    }

    @After
    public void Test() throws Exception {
    }

    @Test
    public void getType() {
        assertEquals("Testing", testExtraFood.getType(), "Meat");
    }

    @Test
    public void getMenu() {
        assertEquals("Testing", testExtraFood.getMenu(), "Chicken");
    }
}