package ru.netology.unitTestCI;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void shouldThrowsExceptionIfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();

        assertThrows(IllegalArgumentException.class, () ->  service.remain(0));
    }
    @Test
    void shouldReturnExceptionIfAmountLessThanZero() {
        CashbackHackService service = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> service.remain(-5));
    }
   /* @ParameterizedTest
    @CsvFileSource(resources = "/BonusData.csv", numLinesToSkip = 1)
    void shouldCalculateBonus(int amount, int expected, String message) {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual, message);
    }*/

}