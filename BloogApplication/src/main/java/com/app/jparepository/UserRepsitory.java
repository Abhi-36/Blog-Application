package com.app.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.User;

public interface UserRepsitory extends JpaRepository<User, Long>
{

}
