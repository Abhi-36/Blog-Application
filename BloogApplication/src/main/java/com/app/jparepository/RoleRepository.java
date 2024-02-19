package com.app.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Role;

public interface RoleRepository extends JpaRepository<Role, Long>
{

}
