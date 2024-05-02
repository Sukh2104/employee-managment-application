package com.sukhman.myapp.Repository;

import com.sukhman.myapp.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
