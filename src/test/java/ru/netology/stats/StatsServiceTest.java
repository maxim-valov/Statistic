package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(values);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSum() {
        StatsService service = new StatsService();
        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAverageSum(values);

        assertEquals(expected, actual);

    }


    @Test
    void calculateMaxMonth() {
        StatsService service = new StatsService();
        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.calculateMaxMonth(values);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMinMonth() {
        StatsService service = new StatsService();
        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.calculateMinMonth(values);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsLowAverage() {
        StatsService service = new StatsService();
        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateMonthsLowAverage(values);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsHigherAverage() {
        StatsService service = new StatsService();
        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateMonthsHigherAverage(values);

        assertEquals(expected, actual);
    }
}