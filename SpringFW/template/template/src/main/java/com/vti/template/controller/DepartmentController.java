package com.vti.template.controller;

import com.vti.template.entity.Department;
import com.vti.template.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable(name = "id") int id) {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/exists/{id}")
    public boolean isDepartmentExistsById(@PathVariable(name = "id") int id) {
        return departmentService.isDepartmentExistsById(id);
    }

    @PostMapping
    public void createDepartment(@RequestBody Department department) {
        departmentService.createDepartment(department);
    }

    @PutMapping
    public void updateDepartment(@RequestBody Department department) {
        departmentService.updateDepartment(department);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable(name = "id") int id) {
        departmentService.deleteDepartment(id);
    }
}
