package com.Employee.virtual.Employee;

import com.Employee.virtual.jpa.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeResources {
    @Autowired
    private EmployeeRepository repo;

    @GetMapping("/employee")
    public List<Employee> findAll(){
        return repo.findAll();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        Optional<Employee> person = repo.findById(id);
        return person;
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee person){
        return repo.save(person);
    }

    @PutMapping("/employee/{id}")
    public Employee UpdateEmployee(@PathVariable int id,@RequestBody Employee peron){
        Employee emp = new Employee(id, peron.getName(), peron.getEmail(), peron.getAge(),peron.getRole());
        return repo.save(emp);
    }
    @DeleteMapping("/employee/{id}")
    public String deleteUserById(@PathVariable int id){
        repo.deleteById(id);
        return "Delete user by id "+id;
    }
}
