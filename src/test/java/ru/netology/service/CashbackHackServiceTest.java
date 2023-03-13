package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateRequiredAmountIfFiveHundredSpent() {

        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void calculateRequiredAmountIfNineHundredAndNinetyNineSpent() {

        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void calculateRequiredAmountIfThousandSpent() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}