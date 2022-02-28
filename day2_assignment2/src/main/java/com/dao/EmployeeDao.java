package com.dao;

import com.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {

    List<Employee> list = new ArrayList<>();

    public void adduser(Employee employee){

        this.list.add(employee);
    }

    public List<Employee> getEmployees() {
        return list;
    }

    public void delete(int id){
        Employee e = list.stream().filter(employee -> id==employee.getId()).findAny().orElse(null);
        list.remove(e);
    }

    public Employee getEmployee(int id){
        Employee e = list.stream().filter(employee -> id==employee.getId()).findAny().orElse(null);
        return e;
    }
    public void update(Employee e){
        int id = e.getId();
        Employee employee = list.stream().filter(emp -> id==emp.getId()).findAny().orElse(null);
        list.remove(employee);
        list.add(e);
    }

}
