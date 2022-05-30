package com.pankiba.manytomany.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pankiba.manytomany.domain.Employee;
import com.pankiba.manytomany.repository.EmployeeRepository;
import com.pankiba.manytomany.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Transactional
	@Override
	public List<Employee> saveEmployees(List<Employee> employees) {
		return employeeRepository.saveAll(employees);
	}

	@Transactional
	@Override
	public Employee findEmployeeById(Long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Transactional
	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

}
