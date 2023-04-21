package com.unit.unittestdemo.service;

import com.unit.unittestdemo.emprepository.EmpRepo;
import com.unit.unittestdemo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeService {
    @Autowired
     EmpRepo empRepo;

        public List<Employee> getAllEmployee(){
            List<Employee> list = empRepo.findAll();
            return list;
        }
        public Employee addEmp(Employee employee){


         return empRepo.save(employee);
        }

    public Employee getOne(int id) {
        Employee employee = empRepo.findById(id).get();
        return employee;
    }

    public void deleteEmp(int id) {
            empRepo.deleteById(id);
    }

    public EmployeeService(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }
}
