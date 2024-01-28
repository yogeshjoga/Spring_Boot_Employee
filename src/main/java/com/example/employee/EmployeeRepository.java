// Write your code here

package com.example.employee;

import java.util.ArrayList;

public interface EmployeeRepository {

    ArrayList<Employee> getEmployees();

    Employee addEmployee(Employee employee);

    Employee getEmployee(int employeeId);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);

}