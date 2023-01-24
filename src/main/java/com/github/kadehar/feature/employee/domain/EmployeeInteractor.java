package com.github.kadehar.feature.employee.domain;

import com.github.kadehar.feature.employee.data.api.EmployeeRepository;
import com.github.kadehar.feature.employee.data.api.model.EmployeeBody;
import com.github.kadehar.feature.employee.domain.model.Employee;

public class EmployeeInteractor {
    private final EmployeeRepository repository;

    public EmployeeInteractor(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee createNewEmployee(EmployeeBody body) {
        return repository.createNewEmployee(body);
    }

    public Employee updateEmployee(Long id, EmployeeBody body) {
        return repository.updateEmployee(id, body);
    }

    public void deleteEmployee(Long id) {
        repository.deleteEmployee(id);
    }
}
