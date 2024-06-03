package com.example.SpringRestCrud.dao;

import com.example.SpringRestCrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDao  {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save (Employee theEmployee);

    void deleteById (int theId);


}
