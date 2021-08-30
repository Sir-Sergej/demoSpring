package com.example.demospring.service;


import com.example.demospring.entites.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostService postService;

    private List<Post> getAllPosts() {
        return postRepository.findall();
    }
}
