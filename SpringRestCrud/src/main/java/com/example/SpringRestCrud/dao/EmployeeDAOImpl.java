package com.example.SpringRestCrud.dao;

import com.example.SpringRestCrud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDao{

    //define filed for entityManager
    private EntityManager entityManager;

    //set up constructor for injection EntityManager bcs it is automatically created by spring boot
    @Autowired
    public EmployeeDAOImpl (EntityManager entityManager){
        this.entityManager = entityManager;

    }
    @Override
    public List<Employee> findAll() {

        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee",Employee.class);

        //execute query and get result list
        List<Employee> employeeList =  theQuery.getResultList();

        //return results
        return employeeList;
    }

    @Override
    public Employee findById(int theId) {
        //get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        //return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        //save employee
        Employee savedEmployee = entityManager.merge(theEmployee);

        //return
        return savedEmployee;
    }


    @Override
    public void deleteById(int theId) {

        //find employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);

        //remove employee
        entityManager.remove(theEmployee);
    }
}
