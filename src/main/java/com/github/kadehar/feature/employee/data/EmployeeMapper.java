package com.github.kadehar.feature.employee.data;

import com.github.kadehar.base.utils.Mapper;
import com.github.kadehar.feature.employee.data.api.model.EmployeeRemote;
import com.github.kadehar.feature.employee.data.api.model.EmployeeRemoteData;
import com.github.kadehar.feature.employee.domain.model.Employee;
import com.github.kadehar.feature.employee.domain.model.EmployeeProfile;

public class EmployeeMapper implements Mapper<EmployeeRemoteData, Employee> {
    @Override
    public Employee toDomain(EmployeeRemoteData employeeRemoteData) {
        return new Employee(
                employeeRemoteData.remote().id(),
                new EmployeeProfile(
                        employeeRemoteData.remote().name(),
                        Integer.parseInt(employeeRemoteData.remote().age()),
                        Double.parseDouble(employeeRemoteData.remote().salary())
                )
        );
    }

    @Override
    public EmployeeRemoteData toRemote(Employee employee) {
        return new EmployeeRemoteData(
                new EmployeeRemote(
                        employee.id(),
                        employee.profile().name(),
                        String.valueOf(employee.profile().age()),
                        String.valueOf(employee.profile().salary())
                )
        );
    }
}
