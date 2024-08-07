package com.application.dependency_injection.domain;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Override
    public Employee getEmployee(Long id) {
        return null;
    }

    @Override
    public void editEmployee(Employee updatedEmployee) {

    }

    @Override
    public void removeDepartment(Long id) {

    }

    @Override
    public List<Department> getDepartments() {
        return List.of();
    }
}
