package com.example.rqchallenge.controller;

import com.example.rqchallenge.dto.CreateEmployeeDto;
import com.example.rqchallenge.dto.EmployeeByIdDto;
import com.example.rqchallenge.dto.EmployeeResponseDto;
import com.example.rqchallenge.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

public interface IEmployeeController {

    @GetMapping("/employees")
    ResponseEntity<EmployeeResponseDto> getAllEmployees() throws IOException;

    @GetMapping("/search/{searchString}")
    ResponseEntity<EmployeeResponseDto> getEmployeesByNameSearch(@PathVariable String searchString);

    @GetMapping("/employee/{id}")
    ResponseEntity<EmployeeByIdDto> getEmployeeById(@PathVariable String id);

    @GetMapping("/highestSalary")
    ResponseEntity<Integer> getHighestSalaryOfEmployees();

    @GetMapping("/topTenHighestEarningEmployeeNames")
    ResponseEntity<EmployeeResponseDto> getTopTenHighestEarningEmployeeNames();

    @PostMapping()
    ResponseEntity<Employee> createEmployee(@RequestBody CreateEmployeeDto createEmployeeDto);

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteEmployeeById(@PathVariable String id) throws Exception;

}
