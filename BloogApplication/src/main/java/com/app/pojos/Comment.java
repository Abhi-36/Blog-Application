package com.app.pojos;



import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Comment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Comment extends BaseEntity
{
private String comment;

@ManyToOne
@JoinColumn(name="post_id")
private Post post;

@ManyToOne
@JoinColumn(name="user_id")
private User users;

	
}
