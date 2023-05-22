package com.carloslopes.joblisting.repository;

import com.carloslopes.joblisting.models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
