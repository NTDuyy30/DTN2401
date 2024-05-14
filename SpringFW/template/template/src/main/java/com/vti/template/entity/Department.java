package com.vti.template.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "department")
@NoArgsConstructor
@Getter
@Setter
public class Department {
    @Column(name = "departmentid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "departmentname", nullable = false, unique = true)
    private String name;
}
