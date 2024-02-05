package com.Employee.virtual.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {
    Employee(){

    }
    @Id
    @GeneratedValue
    private int id;
    @Size(min=2,message = "Name Should have atleast 2 character")
    private String name;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 99, message = "Age should not be greater than 99")
    private int age;
    @Size(min=2 , message = "Role should Content atleast 2 character")
    private String role;
    @Email(message = "Please enter valid email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Employee(int id, String name, String email, int age, String role) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
        this.email = email;
    }
}
