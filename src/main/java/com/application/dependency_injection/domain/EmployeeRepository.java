package com.application.dependency_injection.domain;

import java.util.List;

public interface EmployeeRepository {

    Employee getEmployee(Long id);
    void editEmployee(Employee updatedEmployee);
    void removeDepartment(Long id);
    List<Department> getDepartments();
}
