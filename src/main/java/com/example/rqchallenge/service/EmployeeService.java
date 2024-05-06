package com.example.rqchallenge.service;

import com.example.rqchallenge.dto.CreateEmployeeDto;
import com.example.rqchallenge.dto.EmployeeByIdDto;
import com.example.rqchallenge.dto.EmployeeResponseDto;
import com.example.rqchallenge.model.Employee;

public interface EmployeeService {
    EmployeeResponseDto getAllEmployees();
    EmployeeResponseDto getEmployeesByNameSearch(String empName);
    EmployeeByIdDto getEmployeeById(String id);
    Integer getHighestSalaryOfEmployees();
    EmployeeResponseDto getTopTenHighestEarningEmployeeNames();
    Employee createEmployee(CreateEmployeeDto createEmployeeDto);
    String deleteEmployeeById(String id) throws Exception;
}
