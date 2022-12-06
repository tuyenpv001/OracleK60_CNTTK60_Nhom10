package com.news.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "comments")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long comment_id;

    @Column(name = "email")
    private String email;

    @Column(name = "user_name")
    private String user_name;


    @Column(name = "description")
    private String description;


    @Column(name = "date_comment")
    private Date date_comment;


    @Column(name = "post_id")
    private int post_id;
}
