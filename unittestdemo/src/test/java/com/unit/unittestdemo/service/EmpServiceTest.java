package com.unit.unittestdemo.service;

import com.unit.unittestdemo.emprepository.EmpRepo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EmpServiceTest {
    @Mock
    private EmpRepo empRepository;
    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        this.employeeService = new EmployeeService(this.empRepository);

    }

    @Test
    void getAllEmployee() {
        employeeService.getAllEmployee();
        verify(empRepository).findAll();

    }


}
