package com.example.demo.service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmp(){
        List<Employee> list = (List<Employee>) this.employeeRepository.findAll();
        return list;
    }

    public Employee getEmpById(int id){
        Employee employee= this.employeeRepository.findById(id).get();
        return employee;
    }

    public Employee addEmp(Employee employee){
        this.employeeRepository.save(employee);

        return employee;
    }

    public void deleteEmp(int id){
        this.employeeRepository.deleteById(id);
    }

    public void updateEmp(Employee employee, int id)
    {
        employee.setId(id);
        employeeRepository.save(employee);
    }

}
