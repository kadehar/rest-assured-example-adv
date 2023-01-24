package com.github.kadehar.feature.employee;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.mapper.ObjectMapperType;
import org.junit.jupiter.api.BeforeAll;

public class EmployeeBaseTest {
    @BeforeAll
    public static void setUp() {
        RestAssured.filters(new AllureRestAssured());
        RestAssured.config().objectMapperConfig(
                new ObjectMapperConfig(ObjectMapperType.GSON)
        );
    }
}
