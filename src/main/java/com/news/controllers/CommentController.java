package com.news.controllers;


import com.news.dao.CommentRepository;
import com.news.entities.Comment;
import com.news.requestmodels.CommentRequest;
import com.news.services.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
        private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

//    @GetMapping("/")
//        public List<Comment> getAll(){
//            return this.commentRepository.findAll();
//        }

        @PostMapping("/")
            public void postComment(@RequestBody CommentRequest commentRequest) throws Exception{
            this.commentService.postComment(commentRequest);
        }
}
