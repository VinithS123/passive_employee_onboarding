package com.vinithtech.employeeOnboarding.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "employee_details")
public class EmployeeEntity {

    @Id
    private int customerId;

    private String customerName;

    private String role;

    private String department;

    private float salary;

}
