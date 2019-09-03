package com.cursor.bookservice.model;

import lombok.Data;

@Data
public class Book {
    private long id;
    private String title;
    private String genre;
    private String description;
    private double rate;
}

