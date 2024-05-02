package com.sukhman.myapp.Controller;

import com.sukhman.myapp.Domain.Employee;
import com.sukhman.myapp.Service.EmployeeService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<Objects> createEmployee(@RequestBody Employee employee) {
        boolean status = employeeService.createEmployee(employee);
        if (!status) {
            return new ResponseEntity("Success", HttpStatus.CREATED);
        } else {
            return new ResponseEntity("Please correct request data ", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Employee>> searchEmployee() {

        List<Employee>  searchEmployees=employeeService.searchEmployees();
      if(searchEmployees.size()>0) {
          return new ResponseEntity(searchEmployees, HttpStatus.OK);
      }else{
          return new ResponseEntity("Data Not Found!!!!", HttpStatus.NOT_FOUND);
      }
    }

    @GetMapping("/{id}")
    Optional<Employee> getEmployee(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee employee) {
        boolean flag = employeeService.updateEmployee(employee);
        if (flag) {
            return "Successfully updated..";
        } else {
            return "Failed!!";
        }
    }

    @PutMapping("/{name}")
    public String updateStudent(@PathVariable String name) {
        boolean flag = employeeService.updateEmployeeByname(name);
        if (flag) {
            return "Successfully job done.......";
        } else {
            return "Sorry Failed!!!!!";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        boolean result = employeeService.deleteEmployeeById(id);
        if (result) {
            return "Successfully deleted..";
        } else {
            return "Failed!!!";
        }
    }
}