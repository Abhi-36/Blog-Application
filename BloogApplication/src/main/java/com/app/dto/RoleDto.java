package com.app.dto;


public class RoleDto 
{
 private String rolename;

public RoleDto(String rolename) {
	super();
	this.rolename = rolename;
}

@Override
public String toString() {
	return "RoleDto [rolename=" + rolename + "]";
}

public String getRolename() {
	return rolename;
}



public void setRolename(String rolename) {
	this.rolename = rolename;
}

public RoleDto() 
{
	super();
}
 
 
}
