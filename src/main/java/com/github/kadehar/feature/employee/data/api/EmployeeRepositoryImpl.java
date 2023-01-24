package com.github.kadehar.feature.employee.data.api;

import com.github.kadehar.feature.employee.data.EmployeeMapper;
import com.github.kadehar.feature.employee.data.api.model.EmployeeBody;
import com.github.kadehar.feature.employee.domain.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final EmployeeRemoteSource employeeRemoteSource;
    private final EmployeeMapper mapper;

    public EmployeeRepositoryImpl(EmployeeRemoteSource employeeRemoteSource, EmployeeMapper mapper) {
        this.employeeRemoteSource = employeeRemoteSource;
        this.mapper = mapper;
    }

    @Override
    public Employee createNewEmployee(EmployeeBody body) {
        return mapper.toDomain(employeeRemoteSource.createNewEmployee(body));
    }

    @Override
    public Employee updateEmployee(Long id, EmployeeBody body) {
        return mapper.toDomain(employeeRemoteSource.updateEmployee(id, body));
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRemoteSource.deleteEmployee(id);
    }
}
