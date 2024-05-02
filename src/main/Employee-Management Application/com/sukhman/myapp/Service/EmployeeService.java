package com.sukhman.myapp.Service;

import com.sukhman.myapp.Domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public boolean createEmployee(Employee employee);
    List<Employee> searchEmployees();
    Optional<Employee> getEmployeeById(int id);
    public boolean updateEmployee(Employee employee);

    boolean updateEmployeeByname(String name);
    boolean deleteEmployeeById(int id);
}

