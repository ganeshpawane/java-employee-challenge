package com.example.rqchallenge.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {

    @JsonProperty("id")
    private String id;
    @JsonProperty("employee_name")
    private String name;
    @JsonProperty("employee_salary")
    private Integer age;
    @JsonProperty("employee_age")
    private Integer salary;
    @JsonProperty("profile_image")
    private String profile_image;

    public Employee(String id, String name, Integer age, Integer salary, String profile_image) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.profile_image = profile_image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary + '\'' +
                ", profile_image='" + profile_image + '\'' +
                '}';
    }
}
