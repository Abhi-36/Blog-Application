package com.app.pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Post")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class Post extends BaseEntity
{

	private String fieldTitle;
	private String content;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user1;
	
	@OneToMany(mappedBy = "post")
	private List<Comment> comment=new ArrayList<>();
	
	
	@ManyToOne
	@JoinColumn(name = "cat_id")
	private Category category;


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


	

	public Post(String fieldTitle, String content, Date date) {
		super();
		this.fieldTitle = fieldTitle;
		this.content = content;
		this.date = date;
		
	}


	@Override
	public String toString() {
		return "Post [fieldTitle=" + fieldTitle + ", content=" + content + ", date=" + date + "]";
	}


	public Post() {
		super();
	}
	


	
	
}
