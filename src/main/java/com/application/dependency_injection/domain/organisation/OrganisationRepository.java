package com.application.dependency_injection.domain.organisation;

import com.application.dependency_injection.domain.employee.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation,Long> {


}
