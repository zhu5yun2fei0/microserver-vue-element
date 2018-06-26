package com.pktech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pktech.bean.News;
import com.pktech.dao.NewsDao;
import com.pktech.service.NewsService;

@Service
@Transactional(readOnly = false)
public class NewsServiceImpl implements NewsService{
	@Autowired
	private NewsDao newsdao;

	@Override
	public List<News> findAll() {
		return newsdao.findAll();
	}

}
