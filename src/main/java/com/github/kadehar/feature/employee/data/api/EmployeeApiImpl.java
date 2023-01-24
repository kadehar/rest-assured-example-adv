package com.github.kadehar.feature.employee.data.api;

import com.github.kadehar.base.config.Configuration;
import com.github.kadehar.base.utils.RestAssuredSpec;
import com.github.kadehar.feature.employee.data.api.model.EmployeeBody;
import com.github.kadehar.feature.employee.data.api.model.EmployeeRemoteData;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class EmployeeApiImpl implements EmployeeApi {
    @Override
    public EmployeeRemoteData createNewEmployee(EmployeeBody body) {
        return given()
                .spec(RestAssuredSpec.requestSpec)
                .body(body)
                .when()
                .post("create")
                .then()
                .log().body()
                .extract()
                .as(EmployeeRemoteData.class);
    }

    @Override
    public EmployeeRemoteData updateEmployee(Long id, EmployeeBody body) {
        return given()
                .spec(RestAssuredSpec.requestSpec)
                .body(body)
                .pathParam("id", id)
                .when()
                .put("update/{id}")
                .then()
                .log().body()
                .extract()
                .as(EmployeeRemoteData.class);
    }

    @Override
    public void deleteEmployee(Long id) {
        given()
                .spec(RestAssuredSpec.requestSpec)
                .baseUri(Configuration.Instance.baseUrl())
                .pathParam("id", id)
                .when()
                .delete("delete/{id}")
                .then()
                .log().body();
    }
}
