package com.app.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Post;

public interface PostRepository extends JpaRepository<Post, Long>
{

}
