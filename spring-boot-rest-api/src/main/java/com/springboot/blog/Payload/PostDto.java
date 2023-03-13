package com.springboot.blog.Payload;

import com.springboot.blog.Entity.Comment;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class PostDto {
    private Long id;
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    @NotEmpty
    @Size(min = 10, message = "Post content should have at least 10 characters")
    private String content;
    private Set<CommentDto> comments;
}
