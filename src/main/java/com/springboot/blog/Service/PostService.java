package com.springboot.blog.Service;

import com.springboot.blog.Entity.Post;
import com.springboot.blog.Payload.PostDto;
import com.springboot.blog.Payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostByID(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
    List<PostDto> getPostsByCategoryId(Long categoryId);

}
