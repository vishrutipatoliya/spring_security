package com.unit.unittestdemo.controller;

import com.unit.unittestdemo.entities.Employee;
import com.unit.unittestdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAllEmp(){
       List<Employee> emplist= employeeService.getAllEmployee();
       return new ResponseEntity<>(emplist, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<Object> addEmp(@RequestBody Employee employee){
        Employee e = this.employeeService.addEmp(employee);
        return  new ResponseEntity<>(e,HttpStatus.OK);
    }
    @GetMapping("/getOne/{id}")
    public  ResponseEntity<Object> getOne(@PathVariable("id") int id){
        return new ResponseEntity<>(employeeService.getOne(id),HttpStatus.OK);


    }

    @DeleteMapping("/employee/{id}")

    public ResponseEntity<Object> deleteEmp(@PathVariable("id") int id){
        employeeService.deleteEmp(id);
        return new ResponseEntity<>("delete successfully",HttpStatus.OK);
    }


}
