package com.github.kadehar.feature.employee.data.api.model;

public class EmployeeBody {
    private final String name;
    private final String age;
    private final String salary;

    public EmployeeBody(String name, Integer age, Double salary) {
        this(name, String.valueOf(age), String.valueOf(salary));
    }

    public EmployeeBody(String name, String age, String salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String name() {
        return name;
    }

    public String age() {
        return age;
    }

    public String salary() {
        return salary;
    }
}
