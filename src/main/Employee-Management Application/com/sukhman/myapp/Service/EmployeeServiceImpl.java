package com.sukhman.myapp.Service;

import com.sukhman.myapp.Domain.Employee;
import com.sukhman.myapp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public boolean createEmployee(Employee employee) {
        try {
            employeeRepository.save(employee);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Employee> searchEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        Employee emp = employeeRepository.save(employee);
        return emp.getId() > 0;
    }

    @Override
    public boolean updateEmployeeByname(String name) {
        return true;
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        try {
            employeeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
