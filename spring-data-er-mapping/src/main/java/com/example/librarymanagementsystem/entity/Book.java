package com.example.librarymanagementsystem.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String authpr;
    private boolean availablity;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private List<Page> pages;

    public Long getId() {
        return id;
    }

    public boolean getAvailablity() {
        return availablity;
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthpr() {
        return authpr;
    }

    public void setAuthpr(String authpr) {
        this.authpr = authpr;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authpr='" + authpr + '\'' +
                ", availablity=" + availablity +
                ", pages=" + pages +
                '}';
    }
}
