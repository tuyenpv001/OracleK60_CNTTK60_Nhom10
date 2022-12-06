package com.news.requestmodels;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;


@Data
public class CommentRequest {

    private String email;
    private String user_name;

    private String description;

    private Date date_comment;

    private int post_id;
}
