package com.app.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.app.pojos.Category;
import com.app.pojos.Comment;
import com.app.pojos.User;

public class PostDto 
{
	private String fieldTitle;
	private String content;
	private Date date;
	private Long user1;
	
	private Long category;
	public String getFieldTitle() {
		return fieldTitle;
	}
	public void setFieldTitle(String fieldTitle) {
		this.fieldTitle = fieldTitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getUser1() {
		return user1;
	}
	public void setUser1(Long user1) {
		this.user1 = user1;
	}
	
	public Long getCategory() {
		return category;
	}
	public void setCategory(Long category) {
		this.category = category;
	}
	public PostDto(String fieldTitle, String content, Date date, Long user1, Long category) {
		super();
		this.fieldTitle = fieldTitle;
		this.content = content;
		this.date = date;
		this.user1=user1;
		this.category = category;
	}
	public PostDto() {
		super();
	}
	@Override
	public String toString() {
		return "PostDto [fieldTitle=" + fieldTitle + ", content=" + content + ", date=" + date + ", user1=" + user1
				+  ", category=" + category + "]";
	}
	
	
	
	
	
	
	
}

