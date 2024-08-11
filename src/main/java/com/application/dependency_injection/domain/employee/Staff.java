package com.application.dependency_injection.domain.employee;

import com.application.dependency_injection.domain.department.Department;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;
    private String address;
    private LocalDate birth;
    private String post;

    @ManyToMany(mappedBy = "staffMembers")
    private List<Department> departments;


}
