package com.vti.template.entity;

import lombok.*;

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

    @Column(name = "TotalMember")
    private byte totalMember;
}
