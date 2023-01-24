package com.github.kadehar.base.utils;

import com.github.kadehar.base.config.Configuration;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.with;

public class RestAssuredSpec {
    public static final RequestSpecification requestSpec =
            with()
                    .baseUri(Configuration.Instance.baseUrl())
                    .config(
                            RestAssuredConfig.config()
                                    .objectMapperConfig(
                                            new ObjectMapperConfig(ObjectMapperType.GSON)
                                    )
                    )
                    .contentType(ContentType.JSON)
                    .log().uri()
                    .log().body();
}
