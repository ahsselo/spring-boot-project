package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    //finds a list of employees
    List<Employee> findAll();

    //three new methods that we are going to add for our DAO interface
    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
