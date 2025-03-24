package com.coding.springbootweb.springbootweb.dto;

import com.coding.springbootweb.springbootweb.annotations.EmployeeRoleValidation;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDTO {

    private Long id;

    @NotBlank(message = "Name of the employee cannot be empty")
    @Size(min = 3, max = 20, message = "Name of the employee should be between 3 and 20 characters")
    private String name;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Age cannot be empty")
    @Max(value = 80, message = "Age should be less than 80")
    @Min(value = 18, message = "Age should be greater than 18")
    private Integer age;

    @NotBlank(message = "Role cannot be empty")
//    @Pattern(regexp = "^(ADMIN|USER)$", message = "Role should be either ADMIN or USER")
    @EmployeeRoleValidation(message = "Role should be either ADMIN or USER")
    private String role;

    @NotNull(message = "Salary cannot be empty")
    @Positive(message = "Salary should be positive")
    @Digits(integer = 6, fraction = 2, message = "Salary should be in valid format XXXXXX.YY")
    @DecimalMin(value = "1000.99", message = "Salary should be greater than 1000")
    @DecimalMax(value = "100000.99", message = "Salary should be less than 1000000")
    private Double salary;

    @PastOrPresent( message = "Date of joining cannot be in future")
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private Boolean isActive;

}
