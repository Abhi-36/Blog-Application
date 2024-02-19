package com.app.services;

import java.util.List;

import com.app.dto.PostDto;
import com.app.dto.RoleDto;
import com.app.dto.UserDto;

public interface PostService 
{
	public PostDto createpost(PostDto post);
	  public  PostDto findByid(Long id);
	  public List<PostDto> getAllposts();
	  public PostDto updatepost(PostDto post,Long id);
	  public String deletepostBYid(Long id );
	  
}
