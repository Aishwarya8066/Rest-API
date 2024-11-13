package com.Employee.EmployeeDept_ManagementApi.repository;

import com.Employee.EmployeeDept_ManagementApi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
