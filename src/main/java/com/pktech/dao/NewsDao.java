package com.pktech.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pktech.bean.News;

@Mapper
public interface NewsDao {
	public List<News> findAll();
}
