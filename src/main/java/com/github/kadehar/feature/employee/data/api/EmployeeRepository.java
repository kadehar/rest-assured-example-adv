package com.github.kadehar.feature.employee.data.api;

import com.github.kadehar.feature.employee.data.api.model.EmployeeBody;
import com.github.kadehar.feature.employee.domain.model.Employee;

public interface EmployeeRepository {
    Employee createNewEmployee(EmployeeBody body);
    Employee updateEmployee(Long id, EmployeeBody body);
    void deleteEmployee(Long id);
}
