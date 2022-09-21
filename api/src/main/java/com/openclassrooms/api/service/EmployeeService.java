package com.openclassrooms.api.service;

import com.openclassrooms.api.model.Employee;
import com.openclassrooms.api.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository er;

    public Optional<Employee> getEmployee(final Long id){
        return er.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return er.findAll();
    }

    public void deleteEmployees(final Long id){
        er.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = er.save(employee);
        return savedEmployee;
    }

}
