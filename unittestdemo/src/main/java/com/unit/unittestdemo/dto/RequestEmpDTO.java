package com.unit.unittestdemo.dto;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;
import javax.validation.constraints.*;
public class RequestEmpDTO {
    @NotEmpty(message = "employeetname should not be empty")
    String employeeName;
    int employeeSalary;

}
