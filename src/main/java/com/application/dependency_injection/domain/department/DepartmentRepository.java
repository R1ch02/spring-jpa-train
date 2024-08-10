package com.application.dependency_injection.domain.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    void addDepartment(Department department);
    Department getDepartment(Long id);
    void editDepartment(Department updatedDepartment);
    void removeDepartment(Long id);
    List<Department> getDepartments();

}
