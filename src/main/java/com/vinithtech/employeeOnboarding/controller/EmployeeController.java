package com.vinithtech.employeeOnboarding.controller;

import com.vinithtech.employeeApi.EmployeesApi;
import com.vinithtech.employeeDto.EmployeeDto;
import com.vinithtech.employeeOnboarding.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class EmployeeController implements EmployeesApi {

    private final EmployeeService employeeService;

    @Override
    public ResponseEntity<EmployeeDto> addEmployee(EmployeeDto employeeDto) {

        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.addEmployee(employeeDto));

    }

    @Override
    //Returns employee
    public ResponseEntity<List<EmployeeDto>> getAllEmployee() {
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }
}
