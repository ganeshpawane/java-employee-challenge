package com.example.rqchallenge.repository;

import com.example.rqchallenge.model.Employee;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {

    private static List<Employee> employees = new ArrayList<>();

    @PostConstruct
    public void init() {
        Employee employee1 = new Employee("1", "Kapil Sharma", 45, 300000, "https://odishabytes.com/wp-content/uploads/2021/01/Kapil-sharma-1.jpg");
        Employee employee2 = new Employee("2", "Anil Kapoor", 60, 400000, "https://filmfare.wwmindia.com/content/2020/may/anilkapoorhealth11589281517.jpg");
        Employee employee3 = new Employee("3", "Ajay Devgan", 56, 500000, "https://tribune-reloaded.s3.amazonaws.com/media/images/ajay-bhai1593858900-0/ajay-bhai1593858900-0.jpg");
        Employee employee4 = new Employee("4", "Sanjay Dutt", 58, 350000, "https://filmfare.wwmindia.com/content/2020/aug/sanjayduttcovid11596905872.jpg");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public List<Employee> getEmployeesByNameSearch(String empName) {
        return employees.stream().filter(employee -> employee.getName().equalsIgnoreCase(empName)).collect(Collectors.toList());
    }

    public Employee getEmployeeById(String id) {
        return employees.stream().filter(employee -> employee.getId().equalsIgnoreCase(id)).findAny().orElse(null);
    }

    public Integer getHighestSalaryOfEmployees() {
        int highestSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > highestSalary) {
                highestSalary = employee.getSalary();
            }
        }
        return highestSalary;
    }

    public String deleteEmployeeById(String id) throws Exception {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employees.remove(employee);
        } else {
            return null;
        }
        return employee.getName();
    }

    public List<Employee> getTopTenHighestEarningEmployees() {
        return employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())).limit(2).collect(Collectors.toList());
    }

    public void save(Employee employee) {
        employees.add(employee);
    }
}
