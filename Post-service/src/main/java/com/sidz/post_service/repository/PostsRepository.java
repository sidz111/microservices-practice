package com.sidz.post_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sidz.post_service.entity.Posts;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer>{

}
