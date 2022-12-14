package com.news.dao;

import com.news.entities.News;
import jakarta.persistence.NamedQueries;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@EnableJpaRepositories
public interface NewsRepository extends JpaRepository<News, Long> {


    Page<News> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);

//    @Query("select sum(view_post) from post")
//    Long countByViewPost();

}
