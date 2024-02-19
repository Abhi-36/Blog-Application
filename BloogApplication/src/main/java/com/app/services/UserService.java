package com.app.services;

import java.util.List;
import java.util.Optional;

import com.app.dto.UserDto;
import com.app.pojos.User;

public interface UserService 
{
  public UserDto createUser(UserDto user);
  public  UserDto findByid(Long id);
  public List<UserDto> getAllUsers();
  public UserDto updateUser(UserDto user,Long id);
  public String deleteUSerBYid(Long id );
  
}
