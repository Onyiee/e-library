package com.library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book;

    @BeforeEach
    void setUp() {
        book = new Book();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testBookHasATitle(){
        book.setTitle("I Burn For You");
        assertNotNull(book.getTitle());
        assertEquals("I Burn For You", book.getTitle());
    }

    @Test
    void testBookHasAnAuthor(){
        Author author = new Author("Onyi", new Book());
        book.setAuthor(author);
        assertNotNull(book.getAuthor());
        assertEquals("Onyi", book.getAuthor().getFirstName());
    }


}


