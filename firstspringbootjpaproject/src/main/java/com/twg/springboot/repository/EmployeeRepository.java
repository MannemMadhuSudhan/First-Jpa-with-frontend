package com.twg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.twg.springboot.entity.Employee;

//@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
