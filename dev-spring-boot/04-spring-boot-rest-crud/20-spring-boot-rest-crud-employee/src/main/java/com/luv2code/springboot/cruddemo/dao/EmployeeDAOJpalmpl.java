package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpalmpl implements EmployeeDAO {

    // define filed for entitymanager
    private EntityManager entityManager;

    // set up consructor injection
    @Autowired
    public EmployeeDAOJpalmpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        //return the results
        return employees;
    }

    @Override
    public Employee findById(int theId) {
        // get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // return employee
        return theEmployee;
    }

    //DAO does not handle the @Transactional annotation and is handled at the Service Layer
    @Override
    public Employee save(Employee theEmployee) {
        // save employee
        //if id == 0, then insert/save, else update
        Employee dbEmployee = entityManager.merge(theEmployee);

        // return employee, updated id from the database in the case of an insert
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
        // find the employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // remove employee
        entityManager.remove(theEmployee);
    }
}
