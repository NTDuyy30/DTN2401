package com.vti.testing.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Department")
@NoArgsConstructor
@Getter
@Setter
public class Department {
    @Id // PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    @Column(name = "DepartmentID")
    private int id;

    @Column(name = "DepartmentName", nullable = false, unique = true)
    private String name;

    @Column(name = "TotalMember")
    private int totalMember;
}
