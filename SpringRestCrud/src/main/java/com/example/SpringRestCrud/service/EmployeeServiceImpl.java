package com.example.SpringRestCrud.service;

import com.example.SpringRestCrud.dao.EmployeeDao;
import com.example.SpringRestCrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    //define field
    private EmployeeDao employeeDao;

    //constructor injection
    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDao.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDao.save(theEmployee);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDao.deleteById(theId);

    }
}
