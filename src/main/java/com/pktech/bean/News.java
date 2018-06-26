package com.pktech.bean;

import java.util.Date;

public class News {
	private int id;
	private String title;
	private String author;
	private String pageviews;
	private Date timestamp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPageviews() {
		return pageviews;
	}
	public void setPageviews(String pageviews) {
		this.pageviews = pageviews;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", author=" + author + ", pageviews=" + pageviews
				+ ", timestamp=" + timestamp + "]";
	}
	
}
