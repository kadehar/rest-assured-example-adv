package com.github.kadehar.utils;

import com.github.javafaker.Faker;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.concurrent.ThreadLocalRandom;

public class FakeData {
    public static String name() {
        return new Faker().name().fullName();
    }

    public static Integer age() {
        return ThreadLocalRandom.current().nextInt(18, 71);
    }

    public static Double salary() {
        return formatSalary(ThreadLocalRandom.current().nextDouble(25000.00, 57000.00));
    }

    private static Double formatSalary(Double salary) {
        DecimalFormat df = new DecimalFormat("##.##");
        String tmp = df.format(salary);
        NumberFormat numberFormat = NumberFormat.getInstance();
        double result;
        try {
            result = numberFormat.parse(tmp).doubleValue();
        } catch (ParseException e) {
            result = 0.0;
        }
        return result;
    }
}
