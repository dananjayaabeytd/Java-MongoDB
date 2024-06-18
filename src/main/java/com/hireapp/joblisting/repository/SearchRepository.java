package com.hireapp.joblisting.repository;

import com.hireapp.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findbyText(String text);
}
