package com.application.dependency_injection.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Department {

    private Long departmentId;
    private String departmentName;
    private String[] departmentRooms;
    private int employeeCount;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentRooms=" + Arrays.toString(departmentRooms) +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
