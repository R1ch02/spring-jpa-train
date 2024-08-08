package com.application.dependency_injection.servises;

import com.application.dependency_injection.domain.Department;
import com.application.dependency_injection.domain.DepartmentRepository;
import com.application.dependency_injection.domain.Employee;
import com.application.dependency_injection.domain.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.getEmployee(id);
    }

    public void editEmployee(Employee updatedEmployee) {
        employeeRepository.editEmployee(updatedEmployee);
    }

    public void removeEmployee(Long id) {
        employeeRepository.removeEmployee(id);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.getEmployees();
    }

    @Override
    public void addDepartment(Department department) {
        departmentRepository.addDepartment(department);
    }

    public Department getDepartment(Long id) {
        return departmentRepository.getDepartment(id);
    }

    public void editDepartment(Department updatedDepartment) {
        departmentRepository.editDepartment(updatedDepartment);
    }

    public void removeDepartment(Long id) {
        departmentRepository.removeDepartment(id);
    }

    public List<Department> getDepartments() {
        return departmentRepository.getDepartments();
    }
}
