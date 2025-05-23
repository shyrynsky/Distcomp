package com.example.discussion.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tbl_marker")
public class Marker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 32)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "markers",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<News> news;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}