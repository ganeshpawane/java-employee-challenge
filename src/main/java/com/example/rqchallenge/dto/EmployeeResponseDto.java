package com.example.rqchallenge.dto;

import com.example.rqchallenge.model.Employee;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponseDto {
    private String status;
    @JsonProperty("data")
    private List<Employee> employees;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "EmployeeResponseDto{" +
                "status='" + status + '\'' +
                ", employees=" + employees +
                '}';
    }
}
