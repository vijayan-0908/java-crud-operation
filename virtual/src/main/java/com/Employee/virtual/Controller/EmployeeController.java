package com.Employee.virtual.Controller;


import com.Employee.virtual.jpa.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeController {
    @GetMapping("/")
    public String showForm(){
        return "index";
    }


}
