package com.app.pojos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Role")

public class Role extends BaseEntity
{
private String rolename;

public Role(String rolename) {
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

public void setRolename(String rolename)
{
	this.rolename = rolename;
}

public Role() 
{
	super();
}
 
 
}
