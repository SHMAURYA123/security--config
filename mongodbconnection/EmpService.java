package com.example.mongodbconnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;

    public String addEmployee(Employee employee) {
       empRepository.save(employee);
       return "Employee added in db successfully";
    }
}
