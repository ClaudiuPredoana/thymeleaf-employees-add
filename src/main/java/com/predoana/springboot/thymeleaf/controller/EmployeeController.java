package com.predoana.springboot.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.predoana.springboot.thymeleaf.entity.Employee;
import com.predoana.springboot.thymeleaf.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}

	//add mapping for "/list"

	@GetMapping("/list")
	public String listEmployee(Model theModel) {

		// get employees form db
		List<Employee> theEmployees = employeeService.findAll();

		//add to the string model
		theModel.addAttribute("employees", theEmployees);

		return "/employees/list-employees";

	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		//create model attribute to bind form data
		Employee theEmployee = new Employee();

		theModel.addAttribute("employee", theEmployee);

		return "employees/employee-form";
	}
}
