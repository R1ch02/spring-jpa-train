package com.application.dependency_injection.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private final Map<Long, Employee> employeeMap= new HashMap<>();

    @Override
    public Employee getEmployee(Long id) {
        return employeeMap.get(id);
    }

    @Override
    public void editEmployee(Employee updatedEmployee) {
        employeeMap.put(updatedEmployee.getEmployeeId(), updatedEmployee);
    }

    @Override
    public void removeEmployee(Long id) {
        employeeMap.remove(id);
    }

    @Override
    public List<Employee> getEmployees() {
        return new ArrayList<>(employeeMap.values());
    }
}
