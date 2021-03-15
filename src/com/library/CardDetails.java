package com.library;

import java.time.LocalDate;

public class CardDetails {
    private String name;
    private String cardNumber;
    private LocalDate expiryDate;
    public CardDetails(String name, String cardNumber, LocalDate expiryDate){
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
