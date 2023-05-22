package com.carloslopes.joblisting.repository;

import com.carloslopes.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
