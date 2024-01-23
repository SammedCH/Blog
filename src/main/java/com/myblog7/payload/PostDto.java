package com.myblog7.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {
    private long id;

    @NotEmpty
    @Size(min = 4,message = "post description should be at least 4 characters")
    private String description;

    @NotEmpty
    @Size(min = 5,message = "post content should be at least 5 characters")
    private String content;

    @NotEmpty
    @Size(min = 2,message = "post title should be at least 2 characters")
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
