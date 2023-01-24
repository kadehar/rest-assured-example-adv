package com.github.kadehar.feature.employee.data.api;

import com.github.kadehar.feature.employee.data.api.model.EmployeeBody;
import com.github.kadehar.feature.employee.data.api.model.EmployeeRemote;
import com.github.kadehar.feature.employee.data.api.model.EmployeeRemoteData;

public class EmployeeRemoteSource {
    private final EmployeeApi employeeApi;

    public EmployeeRemoteSource(EmployeeApi employeeApi) {
        this.employeeApi = employeeApi;
    }

    public EmployeeRemoteData createNewEmployee(EmployeeBody body) {
        return employeeApi.createNewEmployee(body);
    }

    public EmployeeRemoteData updateEmployee(Long id, EmployeeBody body) {
        return employeeApi.updateEmployee(id, body);
    }

    public void deleteEmployee(Long id) {
        employeeApi.deleteEmployee(id);
    }
}
