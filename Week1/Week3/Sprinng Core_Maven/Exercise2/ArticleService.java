package com.knowledge;

public class ArticleService {
    private Author author;

    // Setter injection
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayAuthorInfo() {
        System.out.println("Author Name: " + author.getName());
        System.out.println("Expertise: " + author.getExpertise());
    }
}
