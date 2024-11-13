package com.Employee.EmployeeDept_ManagementApi.repository;

import com.Employee.EmployeeDept_ManagementApi.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
