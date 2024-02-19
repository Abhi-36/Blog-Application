package com.app.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>
{

}
