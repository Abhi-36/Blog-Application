package com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.RoleDto;
import com.app.exceptions.CustomException;
import com.app.jparepository.RoleRepository;
import com.app.pojos.Role;

@Service
@Transactional
public class RoleServiceImpl implements RoleService
{
	@Autowired
	private RoleRepository rolerepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public RoleDto createRole(RoleDto role) 
	{
		Role role1=roledtoToRole(role);
		rolerepo.save(role1);
		RoleDto roledto=roleTodtoRole(role1);
		
		return roledto;
	}
	
	private Role roledtoToRole(RoleDto roledto)
	{
		Role role=mapper.map(roledto, Role.class);
		return role;
		
	}
	private RoleDto roleTodtoRole(Role role)
	{
		RoleDto roledto1=mapper.map(role, RoleDto.class);
		return roledto1;
		
	}

	@Override
	public RoleDto getfindByid(Long id)
	{
		Role role=rolerepo.findById(id).orElseThrow(()-> new CustomException("id is not sound"));
		RoleDto roledto1=roleTodtoRole(role);
		return roledto1;
	}

	@Override
	public List<RoleDto> getAllRoles() 
	{
	  List<Role> role=rolerepo.findAll();	
	  List<RoleDto> roledto=role.stream().map(roles->roleTodtoRole(roles)).collect(Collectors.toList());
		return roledto;
	}

	@Override
	public RoleDto updateRole(RoleDto roledto, Long id) 
	{
		Role role=rolerepo.findById(id).orElseThrow(()-> new CustomException("Id is not found"));
	    role.setRolename(roledto.getRolename());
		Role updaterole=rolerepo.save(role);
		RoleDto roledto1=roleTodtoRole(updaterole);
		return roledto1;
	}

	@Override
	public String deleteRole(Long id) 
	{
	    Role role=rolerepo.findById(id).orElseThrow(()-> new CustomException("id is wrong in role"));
		rolerepo.delete(role);
	    return "user is deleted";
	}

	

}
