package com.next.poc.cloudspringcontract;

import com.next.poc.cloudspringcontract.dto.Book;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRest {

    @PostMapping("/api/books")
    public Book getCustomerData(@RequestBody Book book) {
        return book;
    }
}