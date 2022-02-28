package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        List<Employee> list= this.employeeService.getAllEmp();
        return list;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        Employee employee=this.employeeService.getEmpById(id);
        return employee;
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee){
        this.employeeService.addEmp(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        this.employeeService.deleteEmp(id);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id){
        this.employeeService.updateEmp(employee, id);
    }
}
