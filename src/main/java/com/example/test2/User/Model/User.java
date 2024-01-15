package com.example.test2.User.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Data
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private Integer id;
    @Column(name="name")
    private String name;

    @Column(name="password")

    private String password;
    @Column(name="email")
    private String email;
    @Column(name="isAdmin")
    private Boolean isAdmin;
}
