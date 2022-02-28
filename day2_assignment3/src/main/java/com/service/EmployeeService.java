package com.service;

import com.dao.EmployeeDao;
import com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public void createEmployee(Employee employee){
        this.employeeDao.save(employee);
    }

    public List<Employee> loadEmployee(){
        List<Employee> list = this.employeeDao.getEmployee();
        return list;
    }

    public void deleteEmp(int id){
        this.employeeDao.delete(id);
    }

    public Employee updateEmp(int id){
        Employee employee = this.employeeDao.get(id);
        return employee;
    }
}
