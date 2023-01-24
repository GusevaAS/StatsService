package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sumResult = 0;
        for (long sale : sales) {
            sumResult += sale;
        }
        return sumResult;
    }

    public long mediumSales(long[] sales) {
        long average = 0;
        if (sales.length > 0) {
            long sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesBelowAverageMonths(long[] sales) {
        int result = 0;
        long average = mediumSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                result++;
            }
        }
        return result;
    }

    public int salesUnderAverageMonths(long[] sales) {
        int result = 0;
        long average = mediumSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                result++;
            }
        }
        return result;
    }
}
