package com.application.dependency_injection.domain;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository{


    @Override
    public Department getDepartment(Long id) {
        return null;
    }

    @Override
    public void editDepartment(Department updatedDepartment) {

    }

    @Override
    public void removeDepartment(Long id) {

    }

    @Override
    public List<Department> getDepartments() {
        return List.of();
    }
}
