package com.github.kadehar.feature.employee.data.api;

import com.github.kadehar.feature.employee.data.api.model.EmployeeBody;
import com.github.kadehar.feature.employee.data.api.model.EmployeeRemoteData;

public interface EmployeeApi {
    EmployeeRemoteData createNewEmployee(EmployeeBody body);
    EmployeeRemoteData updateEmployee(Long id, EmployeeBody body);
    void deleteEmployee(Long id);
}
