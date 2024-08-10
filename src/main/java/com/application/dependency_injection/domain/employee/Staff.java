package com.application.dependency_injection.domain.employee;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String address;
    private LocalDate birth;
    private String post;

    @ManyToMany(mappedBy = "staffMembers")
    private List<String> departments;


}
