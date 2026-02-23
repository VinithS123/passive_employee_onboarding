package com.vinithtech.employeeOnboarding.mapper;

import com.vinithtech.employeeDto.EmployeeDto;
import com.vinithtech.employeeOnboarding.entity.EmployeeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeEntity toEmployeeEntity(EmployeeDto employeeDto);

    List<EmployeeDto> toEmployeeDtoList(List<EmployeeEntity> employeeEntityList);

    EmployeeDto toEmployeeDto( EmployeeEntity employeeEntity);
}
