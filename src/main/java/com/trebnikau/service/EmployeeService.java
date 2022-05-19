package com.trebnikau.service;

import com.trebnikau.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int employeeId);
    void deleteEmployee(int employeeId);
}
