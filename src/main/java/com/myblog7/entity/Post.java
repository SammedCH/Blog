package com.myblog7.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="posts",uniqueConstraints ={@UniqueConstraint(columnNames = {"title"})})

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id",nullable = false)
    private long id;

   @Column(name = "description",nullable = false)
   private String description;

   @Column(name = "content",nullable = false)
   private String content;

   @Column(name = "title",nullable = false)
   private String title;

   @OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
   private List<Comment> comments;

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
