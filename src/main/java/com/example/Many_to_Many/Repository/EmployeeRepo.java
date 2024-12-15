package com.example.Many_to_Many.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Many_to_Many.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
