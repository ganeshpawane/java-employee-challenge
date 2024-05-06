package com.example.rqchallenge.controller;

import com.example.rqchallenge.dto.CreateEmployeeDto;
import com.example.rqchallenge.dto.EmployeeByIdDto;
import com.example.rqchallenge.dto.EmployeeResponseDto;
import com.example.rqchallenge.model.Employee;
import com.example.rqchallenge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class IEmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public ResponseEntity<EmployeeResponseDto> getAllEmployees() throws IOException {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EmployeeResponseDto> getEmployeesByNameSearch(String searchString) {
        return new ResponseEntity<>(employeeService.getEmployeesByNameSearch(searchString), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EmployeeByIdDto> getEmployeeById(String id) {
        return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Integer> getHighestSalaryOfEmployees() {
        return new ResponseEntity<>(employeeService.getHighestSalaryOfEmployees(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EmployeeResponseDto> getTopTenHighestEarningEmployeeNames() {
        return new ResponseEntity<>(employeeService.getTopTenHighestEarningEmployeeNames(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Employee> createEmployee(CreateEmployeeDto createEmployeeDto) {
        return new ResponseEntity<>(employeeService.createEmployee(createEmployeeDto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteEmployeeById(String id) throws Exception {
        return new ResponseEntity<>(employeeService.deleteEmployeeById(id), HttpStatus.OK);
    }
}
