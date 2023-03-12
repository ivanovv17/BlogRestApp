package com.springboot.blog.Payload;

import com.springboot.blog.Entity.Comment;
import jakarta.persistence.Column;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class PostDto {
    private Long id;
    private String title;
    private String description;
    private String content;
    private Set<CommentDto> comments;
}
