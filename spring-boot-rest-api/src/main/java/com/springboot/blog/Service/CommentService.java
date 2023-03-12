package com.springboot.blog.Service;


import com.springboot.blog.Payload.CommentDto;

public interface CommentService {

    CommentDto createComment(long id, CommentDto commentDto);
}
