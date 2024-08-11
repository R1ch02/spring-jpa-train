package com.application.dependency_injection.servises;

import com.application.dependency_injection.domain.department.Department;
import com.application.dependency_injection.domain.department.DepartmentRepository;
import com.application.dependency_injection.domain.employee.Staff;
import com.application.dependency_injection.domain.employee.StaffRepository;
import com.application.dependency_injection.domain.organisation.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService{

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private OrganisationRepository organisationRepository;


    // Staff methods

    public void addStaff(Staff staff) {
        staffRepository.save(staff);
    }

    public Optional<Staff> findStaffById(Long id) {
        return staffRepository.findById(id);
    }
    //TODO доработать
    public void editStaff(Staff updatedStaff) {
        staffRepository.save(updatedStaff);
    }

    public void deleteStaff(Long id) {
        staffRepository.deleteById(id);
    }

    public List<Staff> findAllStaff() {
        return staffRepository.findAll();
    }


    // Departments methods

    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    public Optional<Department> findDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }
    //TODO Доработать
    public void editDepartment(Department updatedDepartment) {
        departmentRepository.save(updatedDepartment);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }

    // Organisation methods


}
