package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto 
{
//  private Long id;
  private String fieldTitle;
  private String email;
  private String password;
  private String about;
  
//public Long getId() {
//	return id;
//}
//public void setId(Long id) {
//	this.id = id;
// }
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
@Override
public String toString() {
	return "UserDto [ fieldTitle=" + fieldTitle + ", email=" + email + ", password=" + password
			+ ", about=" + about + "]";
}
public UserDto() {
	super();
}
public UserDto(Long id, String fieldTitle, String email, String password, String about) {
	super();
	//this.id = id;
	this.fieldTitle = fieldTitle;
	this.email = email;
	this.password = password;
	this.about = about;
}
  
  
  
  
}
