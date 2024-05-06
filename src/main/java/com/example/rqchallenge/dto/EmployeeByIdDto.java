package com.example.rqchallenge.dto;

import com.example.rqchallenge.model.Employee;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeByIdDto {
    private String status;
    @JsonProperty("data")
    private Employee employee;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "EmployeeByIdDto{" +
                "status='" + status + '\'' +
                ", employees=" + employee +
                '}';
    }
}
