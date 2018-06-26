package com.pktech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pktech.bean.News;
import com.pktech.service.NewsService;

@RestController
public class NewsController {
	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value="/news",method = RequestMethod.GET)
	public List<News> getNews(){
		
		return newsService.findAll();
	}
}
