package com.application.dependency_injection.domain.department;

import com.application.dependency_injection.domain.employee.Staff;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Entity
public class Department {
//TODO разобраться
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int staffCount;

    @ElementCollection
    private List<String> departmentRooms;

    @OneToOne
    @JoinColumn(name = "head_id")
    private Staff head; // Начальник отдела

    @ManyToMany
    @JoinTable(
            name = "department_staff",
            joinColumns = @JoinColumn(name = "department_id"),
            inverseJoinColumns = @JoinColumn(name = "staff_id")
    )
    private List<Staff> staffMembers;
}
