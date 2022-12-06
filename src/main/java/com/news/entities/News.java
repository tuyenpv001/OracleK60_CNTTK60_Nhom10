package com.news.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "post")
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private  Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content_post")
    private  String content_post;


    @Column(name = "brief")
    private String brief;

    @Column(name = "urlimage")
    private String urlimage;

    @Column(name = "date_public")
    private Date date_public;

    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "tags")
    private String tags;

//    @ManyToOne
//    @JoinColumn(name = "category_id", nullable = false)
    @Column(name = "category_id")
    private int category_id;

//    @Column(name = "category_id")
//    private Long categoryId;

    @Column(name = "VIEW_POST")
    private int view_post;

    @Column(name = "status")
    private int status;

}
