package com.library;

import java.time.LocalDate;

public class BookRequest {
    private String bookTitle;
    private String authorName;
    private boolean status;
    private LocalDate publishDate;

    public BookRequest(String bookTitle, String authorName){
        this.bookTitle= bookTitle;
        this.authorName = authorName;
        status = false;
    }

    public BookRequest(String bookTitle, String authorName,LocalDate publishDate){
        this.bookTitle= bookTitle;
        this.authorName = authorName;
        status = false;
        this.publishDate = publishDate;
    }
}
