package com.trebnikau.dao;

import com.trebnikau.entity.Employee;

import java.util.List;


public interface EmployeeDAO {

    List<Employee> getEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int employeeId);
    void deleteEmployee(int employeeId);
}
