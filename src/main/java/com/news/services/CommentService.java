package com.news.services;


import com.news.dao.CommentRepository;
import com.news.entities.Category;
import com.news.entities.Comment;
import com.news.requestmodels.CategoryRequest;
import com.news.requestmodels.CommentRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CommentService {
    private CommentRepository commentRepository;


    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void postComment(CommentRequest commentRequest){
        Comment comment = new Comment();
        comment.setEmail(commentRequest.getEmail());
        comment.setUser_name((commentRequest.getUser_name()));
        comment.setPost_id(commentRequest.getPost_id());
        comment.setDescription(commentRequest.getDescription());
        comment.setDate_comment(commentRequest.getDate_comment());

        this.commentRepository.save(comment);
    }
}
