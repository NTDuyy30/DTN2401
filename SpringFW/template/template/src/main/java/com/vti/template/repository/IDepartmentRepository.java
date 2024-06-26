package com.vti.template.repository;

import com.vti.template.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
    Department findByName(String name);

//    Option 1
//    List<Department> findByNameContaining(String name);

//    Option 2
    @Query("FROM Department WHERE name LIKE CONCAT('%', ?1, '%')")
    List<Department> findByNameContaining(String name);

}
