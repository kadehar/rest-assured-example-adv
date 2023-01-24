package com.github.kadehar.feature.employee.data.api.model;

import com.google.gson.annotations.SerializedName;

public class EmployeeRemote {
    @SerializedName("id")
    private final Long id;
    @SerializedName("name")
    private final String name;
    @SerializedName("salary")
    private final String salary;
    @SerializedName("age")
    private final String age;

    public EmployeeRemote(Long id, String name, String salary, String age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Long id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String salary() {
        return salary;
    }

    public String age() {
        return age;
    }
}
