package com.trebnikau.controller;

import com.trebnikau.entity.Employee;
import com.trebnikau.exception_handling.EmployeeIncorrectData;
import com.trebnikau.exception_handling.NoSUchEmployeeException;
import com.trebnikau.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> employees = employeeService.getEmployees();
        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") int employeeId){
        Employee employee = employeeService.getEmployee(employeeId);
        if (employee == null){
            throw new NoSUchEmployeeException("There is no employee with id = " + employeeId + " into DataBase");
        }
        return employee;
    }


}
