package com.application.dependency_injection.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {

    private Long departmentId;
    private String departmentName;
    private String[] departmentRooms;
    private int employeeCount;

}
