package com.github.kadehar.feature.employee;

import com.github.kadehar.feature.employee.data.EmployeeMapper;
import com.github.kadehar.feature.employee.data.api.EmployeeApiImpl;
import com.github.kadehar.feature.employee.data.api.EmployeeRemoteSource;
import com.github.kadehar.feature.employee.data.api.EmployeeRepositoryImpl;
import com.github.kadehar.feature.employee.data.api.model.EmployeeBody;
import com.github.kadehar.feature.employee.domain.EmployeeInteractor;
import com.github.kadehar.feature.employee.domain.model.Employee;
import com.github.kadehar.utils.FakeData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest extends EmployeeBaseTest {

    @Test
    public void canCreateNewEmployee() {
        String name = FakeData.name();
        Integer age = FakeData.age();
        Double salary = FakeData.salary();

        EmployeeBody body = new EmployeeBody(name, age, salary);
        EmployeeMapper mapper = new EmployeeMapper();
        EmployeeRemoteSource remoteSource = new EmployeeRemoteSource(
                new EmployeeApiImpl()
        );
        EmployeeInteractor interactor = new EmployeeInteractor(
                new EmployeeRepositoryImpl(remoteSource, mapper)
        );

        Employee employee = interactor.createNewEmployee(body);

        assertEquals(name, employee.profile().name());
        assertEquals(age, employee.profile().age());
        assertEquals(salary, employee.profile().salary());
    }

    @Test
    public void canUpdateExistingEmployee() {
        String name = FakeData.name();
        Integer age = FakeData.age();
        Double salary = FakeData.salary();

        EmployeeBody body = new EmployeeBody(name, age, salary);
        EmployeeMapper mapper = new EmployeeMapper();
        EmployeeRemoteSource remoteSource = new EmployeeRemoteSource(
                new EmployeeApiImpl()
        );
        EmployeeInteractor interactor = new EmployeeInteractor(
                new EmployeeRepositoryImpl(remoteSource, mapper)
        );

        Employee employee = interactor.createNewEmployee(body);
        name = FakeData.name();
        body = new EmployeeBody(name, age, salary);

        employee = interactor.updateEmployee(employee.id(), body);

        assertEquals(name, employee.profile().name());
        assertEquals(age, employee.profile().age());
        assertEquals(salary, employee.profile().salary());
    }

    @Test
    public void canDeleteExistingEmployee() {
        String name = FakeData.name();
        Integer age = FakeData.age();
        Double salary = FakeData.salary();

        EmployeeBody body = new EmployeeBody(name, age, salary);
        EmployeeMapper mapper = new EmployeeMapper();
        EmployeeRemoteSource remoteSource = new EmployeeRemoteSource(
                new EmployeeApiImpl()
        );
        EmployeeInteractor interactor = new EmployeeInteractor(
                new EmployeeRepositoryImpl(remoteSource, mapper)
        );

        Employee employee = interactor.createNewEmployee(body);
        interactor.deleteEmployee(employee.id());
    }
}
