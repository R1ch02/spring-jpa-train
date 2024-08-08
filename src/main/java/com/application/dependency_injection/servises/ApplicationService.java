package com.application.dependency_injection.servises;

import com.application.dependency_injection.domain.Department;
import com.application.dependency_injection.domain.Employee;

import java.util.List;

public interface ApplicationService {

    void addEmployee(Employee employee);
    Employee getEmployee(Long id);
    void editEmployee(Employee updatedEmployee);
    void removeEmployee(Long id);
    List<Employee> getEmployees();

    void addDepartment(Department department);
    Department getDepartment(Long id);
    void editDepartment(Department updatedDepartment);
    void removeDepartment(Long id);
    List<Department> getDepartments();


}
