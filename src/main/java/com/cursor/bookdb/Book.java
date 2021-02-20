package com.cursor.bookdb;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private boolean inUse;

    public Book(String title) {
        this.title = title;
    }
}
