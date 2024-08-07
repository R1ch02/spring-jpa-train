package com.application.dependency_injection.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository{

    private final Map<Long, Department> departmentMap = new HashMap<>();


    @Override
    public Department getDepartment(Long id) {
        return departmentMap.get(id);
    }

    @Override
    public void editDepartment(Department updatedDepartment) {
        departmentMap.put(updatedDepartment.getDepartmentId(), updatedDepartment);
    }

    @Override
    public void removeDepartment(Long id) {
        departmentMap.remove(id);
    }

    @Override
    public List<Department> getDepartments() {
        return new ArrayList<>(departmentMap.values());
    }
}
