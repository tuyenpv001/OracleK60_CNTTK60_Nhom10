package com.news.controllers;


import com.news.dao.NewsRepository;
import com.news.entities.News;
import com.news.requestmodels.NewsRequest;
import com.news.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(name = "/news")
public class NewsController {
//    private final NewsRepository newsRepository;
    @Autowired
    private NewsRepository newsRepository;
    private NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

//    @GetMapping("/")
//    public List<News> getAllNews(){
//        return this.newsRepository.findAll();
//    }


    @PostMapping("/")
    public void postNews(@RequestBody NewsRequest newsRequest) throws Exception {

        this.newsService.postNews(newsRequest);
    }

    @GetMapping(value = "/{id}")
    public String getNews(@PathVariable Long id) {




        return "Tinh";


    }

}
