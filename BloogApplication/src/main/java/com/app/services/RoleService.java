package com.app.services;

import java.util.List;

import com.app.dto.RoleDto;
import com.app.dto.UserDto;

public interface RoleService 
{
	  public  RoleDto createRole(RoleDto role);
	  public  RoleDto getfindByid(Long id);
	  public List<RoleDto> getAllRoles();
	  public RoleDto updateRole(RoleDto role,Long id);
	  public String deleteRole(Long id);
}
