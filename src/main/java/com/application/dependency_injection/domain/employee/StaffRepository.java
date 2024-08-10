package com.application.dependency_injection.domain.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Long> {

    void addStaff(Staff staff);
    Staff getStaff(Long id);
    void editStaff(Staff updatedStaff);
    void removeStaff(Long id);
    List<Staff> getAllStaff();
}
