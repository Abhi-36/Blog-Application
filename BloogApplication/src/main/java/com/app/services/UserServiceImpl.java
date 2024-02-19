package com.app.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.UserDto;
import com.app.exceptions.CustomException;
import com.app.jparepository.UserRepsitory;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
     
	@Autowired
	private UserRepsitory userRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public UserDto createUser(UserDto userdto) 
	{
		User user=this.dtoTOuser(userdto);
		
		User saveuser=userRepo.save(user);
		return this.userTOdto(saveuser);
	}

	private UserDto userTOdto(User saveuser) 
	{
		UserDto userdto1=this.mapper.map(saveuser, UserDto.class);
		return userdto1;
	}

	private User dtoTOuser(UserDto userdto)
	{
		User user1=this.mapper.map(userdto,User.class);
		
		return user1;
	}

	@Override
	public UserDto findByid(Long id) 
	{
		User user=userRepo.findById(id).orElseThrow(()-> new CustomException("id is wrong"));
		UserDto userdto1=userTOdto(user);
		return userdto1 ;
	  
	}

	
	@Override
	public UserDto updateUser(UserDto userdto, Long id) {
		User user1=userRepo.findById(id).orElseThrow(()-> new CustomException("ID is not found "));
		
		user1.setFieldTitle(userdto.getFieldTitle());
		user1.setEmail(userdto.getEmail());
		user1.setPassword(userdto.getPassword());
		user1.setAbout(userdto.getAbout());
		
		User updateuser=userRepo.save(user1);
		UserDto userdto1=userTOdto(updateuser);
		return userdto1;
	}

	@Override
	public String deleteUSerBYid(Long id) 
	{
	  User user=userRepo.findById(id).orElseThrow(()-> new CustomException("user is not found"));
	  userRepo.delete(user);
		return "user is deleted";
	}

	@Override
	public List<UserDto> getAllUsers() {
		
			List<User> user=userRepo.findAll();
			List<UserDto> userdto=user.stream().map(users->userTOdto(users)).collect(Collectors.toList());
			return userdto;
		

	}

}
