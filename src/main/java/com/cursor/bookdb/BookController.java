package com.cursor.bookdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookDao bookDao;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookDao.findById(id).orElse(null);
    }

    @GetMapping("/books/in-use/{id}")
    public Book changeMarkBookAsInUse(@PathVariable("id") Long id) {
        Book book = bookDao.getOne(id);
        book.setInUse(!book.isInUse());
        return bookDao.save(book);
    }
}
