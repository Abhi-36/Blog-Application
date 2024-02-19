package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "User")

public class User extends BaseEntity 
{
  //@Column(length = 10,nullable = false)
  private String fieldTitle;
  //@Column(unique = true,nullable = false)
  private String email;
  //@Column(length = 10,nullable = false)
  private String password;
  @Column(length = 10)
  private String about;
  
  
  
  
  public String getFieldTitle() {
	return fieldTitle;
}

public void setFieldTitle(String fieldTitle) {
	this.fieldTitle = fieldTitle;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getAbout() {
	return about;
}

public void setAbout(String about) {
	this.about = about;
}

public List<Post> getPost() {
	return post;
}

public void setPost(List<Post> post) {
	this.post = post;
}

public List<Comment> getComment() {
	return comment;
}

public void setComment(List<Comment> comment) {
	this.comment = comment;
}



public User() {
	super();
}



public User(String fieldTitle, String email, String password, String about, List<Post> post, List<Comment> comment) {
	super();
	this.fieldTitle = fieldTitle;
	this.email = email;
	this.password = password;
	this.about = about;
	this.post = post;
	this.comment = comment;
}



@Override
public String toString() {
	return "User [fieldTitle=" + fieldTitle + ", email=" + email + ", password=" + password + ", about=" + about
			+ ", post=" + post + ", comment=" + comment + "]";
}



@OneToMany(mappedBy = "user1")
  private List<Post> post=new ArrayList<>();
  
  @OneToMany(mappedBy = "users")
  private List<Comment> comment=new ArrayList<>();
  
  
  
	
}
