package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.PostDto;
import com.app.services.PostService;

@RestController
@RequestMapping("/post")
@CrossOrigin(origins = {"*"})
public class PostController 
{
	@Autowired
	private PostService postservice;
  @PostMapping("/addpost")
  public ResponseEntity<PostDto> createpost(@RequestBody PostDto postdto)
  {
	return ResponseEntity.ok(postservice.createpost(postdto));
	  
  }
}
