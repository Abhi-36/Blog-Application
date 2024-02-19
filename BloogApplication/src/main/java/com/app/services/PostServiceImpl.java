package com.app.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.PostDto;
import com.app.jparepository.PostRepository;
import com.app.pojos.Post;

@Service
@Transactional
public class PostServiceImpl implements PostService
{

	@Autowired
	private PostRepository postrepo;
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public PostDto createpost(PostDto postdto) 
	{
		Post post=postdtoTopost(postdto);
		postrepo.save(post);
		PostDto postdto1=postTodtopost(post);
		return postdto1 ;
	}

	@Override
	public PostDto findByid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostDto> getAllposts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDto updatepost(PostDto post, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletepostBYid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Post postdtoTopost(PostDto postdto)
	{
		Post post=mapper.map(postdto, Post.class);
		return post;
		
	}

	private PostDto postTodtopost(Post post)
	{
		PostDto postdto=mapper.map(post, PostDto.class);
		return postdto;
		
	}

}
