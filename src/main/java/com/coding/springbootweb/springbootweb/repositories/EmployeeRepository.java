package com.coding.springbootweb.springbootweb.repositories;


import com.coding.springbootweb.springbootweb.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


}
