package com.predoana.springboot.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.predoana.springboot.thymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //add method to sort by last name

    public List<Employee> findAllByOrderByLastNameAsc();
}
