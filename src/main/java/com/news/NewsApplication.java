package com.news;

import com.news.entities.Category;
import com.news.entities.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class NewsApplication  implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(NewsApplication.class, args);

		System.out.println("Da chay ok");

	}

	@GetMapping
	public String sayHello(){
		return "Hello";
	}

	@Override
	public  void run(String... arg) throws Exception{
		String sql = "SELECT sum(view_post) FROM categories";
//		Long totalEffortSeconds = jdbcTemplate.query(sql,Long.class);



	}

}
