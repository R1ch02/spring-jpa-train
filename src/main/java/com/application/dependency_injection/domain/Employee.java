package com.application.dependency_injection.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class Employee {

    private Long employeeId;
    private String employeeName;
    private String employeeSurname;
    private String employeePatron;
    private String employeeAddress;
    private Date employeeBirth;
    private String employeeDepartment;
    private String employeePost;
}
