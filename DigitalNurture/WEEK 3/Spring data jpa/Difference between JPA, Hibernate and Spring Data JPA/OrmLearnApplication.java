package com.cognizant.ormlearn;

import java.util.List;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;
    private static EmployeeService employeeService;

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);
        employeeService = context.getBean(EmployeeService.class);

        LOGGER.info("Inside main");

        testGetAllCountries();
        testAddEmployee();
        testGetAllEmployees();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start: Get All Countries");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End: Get All Countries");
    }

    private static void testAddEmployee() {
        LOGGER.info("Start: Add Employee");
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Malar");

        employeeService.addEmployee(emp);
        LOGGER.info("End: Add Employee");
    }

    private static void testGetAllEmployees() {
        LOGGER.info("Start: Get All Employees");
        List<Employee> employees = employeeService.getAll();
        LOGGER.debug("employees={}", employees);
        LOGGER.info("End: Get All Employees");
    }
}
