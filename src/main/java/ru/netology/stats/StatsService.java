package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] values) {
        long sum = 0;
        for (long value : values) {
            sum += value;
        }

        return sum;
    }

    public long calculateAverageSum(long[] values) {
        long sum = 0;
        for (long value : values) {
            sum += value;
        }
        long average = sum / values.length;

        return average;
    }

    public long calculateMaxMonth(long[] values) {
        long maxMonth = 0;
        long maxSales = values[0];
        for (int i = 0; i < values.length; i++) {
            if (maxSales <= values[i]) {
                maxSales = values[i];
                maxMonth = i + 1;
            }

        }

        return maxMonth;
    }

    public long calculateMinMonth(long[] values) {
        long minMonth = 0;
        long minSales = values[0];
        for (int i = 0; i < values.length; i++) {
            if (minSales >= values[i]) {
                minSales = values[i];
                minMonth = i + 1;
            }
        }

        return minMonth;
    }

    public long calculateMonthsLowAverage(long[] values) {
        long monthsLow = 0;
        long average = calculateAverageSum(values);

        for (long value : values) {

            if (value < average) {
                monthsLow += 1;
            }
        }
        return monthsLow;
    }

    public long calculateMonthsHigherAverage(long[] values) {
        long monthHigher = 0;
        long average = calculateAverageSum(values);

        for (long value : values) {

            if (value > average) {
                monthHigher += 1;
            }
        }
        return monthHigher;
    }
}