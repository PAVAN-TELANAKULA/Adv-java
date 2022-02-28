package com.controller;

import com.dao.EmployeeDao;
import com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/register")
    public String form(){
        return "register";
    }

    @RequestMapping("addemployee")
    public String add(){
        return "redirect:register";
    }

    @RequestMapping(path = "/formprocess", method = RequestMethod.POST)
    public RedirectView processform(@ModelAttribute Employee employee, HttpServletRequest request){

        RedirectView redirectView=new RedirectView();

        this.employeeDao.adduser(employee);

        redirectView.setUrl(request.getContextPath()+"/");

        return redirectView;
    }

    @RequestMapping("viewemployee")
    public String getEmpList(Model m){

        List<Employee> list = this.employeeDao.getEmployees();
        m.addAttribute("employee" , list);

        return "success";
    }

    @RequestMapping(value = {"deleteemp/{id}"})
    public RedirectView delete(@PathVariable("id") int id,HttpServletRequest request){
        this.employeeDao.delete(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+"/");
        return redirectView;
    }

    @RequestMapping(value = {"editemp/{id}"})
    public String update(@PathVariable("id") int id,Model m){
        Employee employee = this.employeeDao.getEmployee(id);
        m.addAttribute("emp",employee);
        return "update";
    }
    @RequestMapping(value = {"/change"})
    public RedirectView change(@ModelAttribute Employee employee,HttpServletRequest request){
        this.employeeDao.update(employee);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+"/");
        return redirectView;
    }
}
