package com.application.dependency_injection.servises;

import com.application.dependency_injection.domain.DepartmentRepository;
import com.application.dependency_injection.domain.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;



}
