package com.application.dependency_injection.domain.organisation;

import com.application.dependency_injection.domain.employee.Staff;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;

    @OneToOne
    @JoinColumn(name = "head_id")
    private Staff head;
}
