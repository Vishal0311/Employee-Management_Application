package com.Vishal.EmployeeManagementApplication.repository;

import com.Vishal.EmployeeManagementApplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
