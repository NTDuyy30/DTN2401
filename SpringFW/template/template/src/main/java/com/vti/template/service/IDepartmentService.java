package com.vti.template.service;

import com.vti.template.entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> getAllDepartments();

    Department getDepartmentById(int id);

    void createDepartment(Department department);

    void updateDepartment(Department department);

    void deleteDepartment(int id);

    boolean isDepartmentExistsById(int id);
}
