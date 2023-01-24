package com.github.kadehar.feature.employee.domain.model;

public class Employee {
    private final Long id;
    private final EmployeeProfile profile;

    public Employee(Long id, EmployeeProfile profile) {
        this.id = id;
        this.profile = profile;
    }

    public Long id() {
        return id;
    }

    public EmployeeProfile profile() {
        return profile;
    }
}
