package com.example.rqchallenge.service.impl;

import com.example.rqchallenge.repository.EmployeeRepository;
import com.example.rqchallenge.dto.CreateEmployeeDto;
import com.example.rqchallenge.dto.EmployeeByIdDto;
import com.example.rqchallenge.dto.EmployeeResponseDto;
import com.example.rqchallenge.model.Employee;
import com.example.rqchallenge.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.example.rqchallenge.config.EmployeeConstant.SUCCESS;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponseDto getAllEmployees() {
        LOGGER.info("Get all employees...");
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setEmployees(employeeRepository.getAllEmployees());
        employeeResponseDto.setStatus(SUCCESS);
        LOGGER.info("Response : " + employeeResponseDto);
        return employeeResponseDto;
    }

    @Override
    public EmployeeResponseDto getEmployeesByNameSearch(String empName) {
        LOGGER.info("Get employees by name search...");
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setEmployees(employeeRepository.getEmployeesByNameSearch(empName));
        employeeResponseDto.setStatus(SUCCESS);
        LOGGER.info("Response : " + employeeResponseDto);
        return employeeResponseDto;
    }

    @Override
    public EmployeeByIdDto getEmployeeById(String id) {
        LOGGER.info("Get employee by id...");
        EmployeeByIdDto employeeByIdDto = new EmployeeByIdDto();
        employeeByIdDto.setEmployee(employeeRepository.getEmployeeById(id));
        employeeByIdDto.setStatus(SUCCESS);
        LOGGER.info("Response : " + employeeByIdDto);
        return employeeByIdDto;
    }

    @Override
    public Integer getHighestSalaryOfEmployees() {
        LOGGER.info("Get highest salary of employees...");
        return employeeRepository.getHighestSalaryOfEmployees();
    }

    @Override
    public EmployeeResponseDto getTopTenHighestEarningEmployeeNames() {
        LOGGER.info("Get highest salary of employees...");
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setEmployees(employeeRepository.getTopTenHighestEarningEmployees());
        employeeResponseDto.setStatus(SUCCESS);
        LOGGER.info("Response : " + employeeResponseDto);
        return employeeResponseDto;

    }

    @Override
    public Employee createEmployee(CreateEmployeeDto createEmployeeDto) {
        LOGGER.info("Create new employee...");
        String id = UUID.randomUUID().toString();
        Employee employee = new Employee(id, createEmployeeDto.getName(), createEmployeeDto.getAge(),
                createEmployeeDto.getSalary(), "");
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public String deleteEmployeeById(String id) throws Exception {
        LOGGER.info("Delete employee by id...");
        return employeeRepository.deleteEmployeeById(id);
    }
}
