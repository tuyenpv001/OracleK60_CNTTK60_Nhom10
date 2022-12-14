package com.news.controllers;


import com.news.dao.NewsRepository;
import com.news.entities.News;
import com.news.requestmodels.NewsRequest;
import com.news.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(name = "/news")
public class NewsController {
//    private final NewsRepository newsRepository;
    @Autowired
    private NewsRepository newsRepository;
    private NewsService newsService;

    public NewsController(NewsService newsService, NewsRepository  newsRepository) {
        this.newsService = newsService;
        this.newsRepository = newsRepository;
    }

    @GetMapping("/")
    public List<News> getAllNews(){
        return this.newsRepository.findAll();
    }


    @PostMapping("/")
    public void postNews(@RequestBody NewsRequest newsRequest) throws Exception {

        this.newsService.postNews(newsRequest);
    }

    @PutMapping(value = "/increase")
    public void getNews(@RequestParam Long id) throws Exception{
        this.newsService.increaseNews(id);

    }

//    @GetMapping(name = "/count")
//    public Long getCountView() {
//        return this.newsRepository.countByViewPost();
//    }


}
