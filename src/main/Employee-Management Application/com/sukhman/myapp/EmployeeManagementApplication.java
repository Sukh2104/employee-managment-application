package com.sukhman.myapp;

import com.sukhman.myapp.Domain.Employee;
import com.sukhman.myapp.Service.EmployeeService;
import com.sukhman.myapp.Service.EmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
