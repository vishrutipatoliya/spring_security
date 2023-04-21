package com.unit.unittestdemo.emprepository;

import com.unit.unittestdemo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
