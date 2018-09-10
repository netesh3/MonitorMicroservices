package com.emp.service.app.empserviceapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeServiceController {
    private static final Map<Integer,Employee> emp  = new HashMap<Integer,Employee>(){
        private static final long serialVersionUID = -3970206781360313502L;
        {
            put(111,new Employee(111,"Employee1"));
            put(222,new Employee(222,"Employee2"));
        }
    };

    @RequestMapping(value="/emp/{id}",method = RequestMethod.GET)
    public Employee getEmpData(@PathVariable("id") int id){
        System.out.println("Emp Details:-");
        Employee eDetails = emp.get(id);
        if (eDetails == null)
            eDetails = new Employee(0, "N/A");
        return eDetails;
    }
}
