package com.app.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>
{

}
