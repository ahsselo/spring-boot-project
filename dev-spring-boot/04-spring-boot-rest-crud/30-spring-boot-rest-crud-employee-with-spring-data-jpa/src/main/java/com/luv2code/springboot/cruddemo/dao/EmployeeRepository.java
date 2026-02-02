package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//Entity Type is Employee and the Primary Key is Integer
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it, no need to write any code. We get all of these CRUD methods for free.

}
