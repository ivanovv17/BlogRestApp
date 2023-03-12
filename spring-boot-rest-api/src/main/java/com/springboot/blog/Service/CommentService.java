package com.springboot.blog.Service;


import com.springboot.blog.Payload.CommentDto;

import java.util.List;


public interface CommentService {

    CommentDto createComment(CommentDto commentDto, long id);

    List<CommentDto> getAllCommentsByPostId(long id);
    CommentDto getCommentById(long postId, long commentId);
    CommentDto updateComment(CommentDto commentDto, long postId, long commentId);
    void deleteComment(long postId, long commentId);
}
