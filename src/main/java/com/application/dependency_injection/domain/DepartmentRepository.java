package com.application.dependency_injection.domain;

import java.util.List;

public interface DepartmentRepository {
    Department getDepartment(Long id);
    void editDepartment(Department updatedDepartment);
    void removeDepartment(Long id);
    List<Department> getDepartments();

}
