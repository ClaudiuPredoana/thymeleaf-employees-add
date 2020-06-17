package com.predoana.springboot.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.predoana.springboot.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
