package com.controller;

import com.dao.EmployeeDao;
import com.model.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class FormController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/signup")
    public String form(){
        return "employee";
    }

    @RequestMapping(path = "/formprocess", method = RequestMethod.POST)
    public RedirectView processform(@ModelAttribute Employee employee,HttpServletRequest request){

        RedirectView redirectView=new RedirectView();

        this.employeeService.createEmployee(employee);

        redirectView.setUrl(request.getContextPath()+"/");

        return redirectView;
    }

    @RequestMapping("viewemployee")
    public String getEmpList(Model m){

        List<Employee> list = this.employeeService.loadEmployee();
        m.addAttribute("employee" , list);

        return "viewemployee";
    }

    @RequestMapping("update/{id}")
    public String updateEmp(@PathVariable("id") int id, Model model){
        Employee employee=this.employeeService.updateEmp(id);
        model.addAttribute("employee",employee);
        return "update";
    }

    @RequestMapping("deleteemp/{id}")
    public RedirectView deleteEmp(@PathVariable("id") int id, HttpServletRequest request){

        this.employeeService.deleteEmp(id);

        RedirectView redirectView=new RedirectView();
        redirectView.setUrl(request.getContextPath()+ "/");
        return redirectView;
    }
}
