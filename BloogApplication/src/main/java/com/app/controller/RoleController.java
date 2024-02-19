package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.RoleDto;
import com.app.jparepository.RoleRepository;
import com.app.services.RoleService;

@RestController
@RequestMapping("/role")
@CrossOrigin(origins = {"*"})
public class RoleController
{
	@Autowired
	private RoleService roleservice;
@PostMapping("/addrole")
public ResponseEntity<RoleDto> addRole(@RequestBody RoleDto roledto)
{
	return ResponseEntity.ok(roleservice.createRole(roledto));
	
}
@GetMapping("/getrole/{id}")
public ResponseEntity<RoleDto> getrole(@PathVariable Long id)
{
	return ResponseEntity.ok(roleservice.getfindByid(id));
	
}
@PutMapping("/updaterole/{id}")
public ResponseEntity<RoleDto> updaterole(@RequestBody RoleDto roledto, @PathVariable Long id)
{
	return ResponseEntity.ok(roleservice.updateRole(roledto, id));
	
}
@DeleteMapping("/deleterole/{id}")
public ResponseEntity<String> delteuser(@PathVariable Long id)
{
	return ResponseEntity.ok(roleservice.deleteRole(id));

}

@GetMapping("/getallroles")
public ResponseEntity<List<RoleDto>> getallusers()
{
	return ResponseEntity.ok(roleservice.getAllRoles());
	
}

	
}
