package com.application.dependency_injection.servises;

import com.application.dependency_injection.domain.department.Department;
import com.application.dependency_injection.domain.department.DepartmentRepository;
import com.application.dependency_injection.domain.employee.Staff;
import com.application.dependency_injection.domain.employee.StaffRepository;
import com.application.dependency_injection.domain.organisation.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService{

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private OrganisationRepository organisationRepository;


    public void addStaff(Staff staff) {
        staffRepository.addStaff(staff);
    }

    public Staff getStaff(Long id) {
        return staffRepository.getStaff(id);
    }

    public void editStaff(Staff updatedStaff) {
        staffRepository.editStaff(updatedStaff);
    }

    public void removeStaff(Long id) {
        staffRepository.removeStaff(id);
    }

    public List<Staff> getAllStaff() {
        return staffRepository.getAllStaff();
    }




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
