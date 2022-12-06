package com.news.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "first_name")
    private String fName;

    @Column(name = "last_name")
    private String lName;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "password_user")
    private String password;


    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private Long phone;


    @Column(name = "date_register")
    private Date dateRegister;

    @Column(name = "type_user")
    private String typeUser;

    @Column(name = "birthday")
    private Date birthDay;

    @Column(name = "status")
    private int status;

}
