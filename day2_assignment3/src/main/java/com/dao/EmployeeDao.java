package com.dao;

import com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void save(Employee employee){

        this.hibernateTemplate.saveOrUpdate(employee);
    }

    public List<Employee> getEmployee(){
        List<Employee> list = this.hibernateTemplate.loadAll(Employee.class);
        return list;
    }

    @Transactional
    public void delete(int id){

        Employee emp=  this.hibernateTemplate.load(Employee.class , id);
        this.hibernateTemplate.delete(emp);
    }

    @Transactional
    public Employee get(int id){
        return this.hibernateTemplate.get(Employee.class, id);
    }

}
