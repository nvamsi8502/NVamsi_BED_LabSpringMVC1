package com.gl.SpringbootthymleafCrudWebApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.SpringbootthymleafCrudWebApplication.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
