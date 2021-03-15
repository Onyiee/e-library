package com.library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Tayo", "Solarin");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void customerCanMakeRequests(){
        customer.makeRequests("SampleBookTitle","SampleAuthorName");
        customer.makeRequests("SampleBookTitle", "SampleAuthorName", LocalDate.now());
        assertEquals(2,customer.getRequests().size());
    }
}