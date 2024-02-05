package com.Employee.virtual.Service;

import com.Employee.virtual.Employee.Employee;
import com.Employee.virtual.jpa.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> GetAllEmployee(){
        return repo.findAll();
    }

}
