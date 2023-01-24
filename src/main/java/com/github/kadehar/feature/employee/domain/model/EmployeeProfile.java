package com.github.kadehar.feature.employee.domain.model;

public class EmployeeProfile {
    private final String name;
    private final Integer age;
    private final Double salary;

    public EmployeeProfile(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String name() {
        return name;
    }

    public Integer age() {
        return age;
    }

    public Double salary() {
        return salary;
    }
}
