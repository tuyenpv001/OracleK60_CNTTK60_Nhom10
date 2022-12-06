package com.news.requestmodels;

import com.news.entities.Category;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
public class NewsRequest {


    private String title;


    private  String content_post;



    private String brief;


    private String urlimage;


    private Date date_public;

    private String tags;


    private int category_id;




    private int view_post;


    private int status;

}
