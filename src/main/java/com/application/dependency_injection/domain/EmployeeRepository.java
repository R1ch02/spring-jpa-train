package com.application.dependency_injection.domain;

import java.util.List;

public interface EmployeeRepository {

    Employee getEmployee(Long id);
    void editEmployee(Employee updatedEmployee);
    void removeEmployee(Long id);
    List<Employee> getEmployees();
}
