package com.cursor.bookdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class DataCLR implements CommandLineRunner {

    @Autowired
    BookDao bookDao;

    @Override
    public void run(String... args) {
        Stream.of("Anna Karenina", "Robinson Crusoe", "Brave New World")
                .forEach(b -> bookDao.save(new Book(b)));
    }
}
