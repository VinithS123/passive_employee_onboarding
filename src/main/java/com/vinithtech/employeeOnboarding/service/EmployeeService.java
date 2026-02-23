package com.vinithtech.employeeOnboarding.service;

import com.vinithtech.employeeDto.EmployeeDto;
import com.vinithtech.employeeOnboarding.entity.EmployeeEntity;
import com.vinithtech.employeeOnboarding.mapper.EmployeeMapper;
import com.vinithtech.employeeOnboarding.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeMapper employeeMapper;

    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employee = employeeMapper.toEmployeeEntity(employeeDto);
        return employeeMapper.toEmployeeDto(employeeRepository.save(employee));
    }

    public List<EmployeeDto> getAllEmployee() {
        return employeeMapper.toEmployeeDtoList(employeeRepository.findAll());
    }
}
