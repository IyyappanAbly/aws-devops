package com.deloitte.elasticbeanstalk.controller;

import com.deloitte.elasticbeanstalk.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    @GetMapping("/getBook")
    public ResponseEntity<Book>  getBook(){
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("The Sparrows");
        return new ResponseEntity<>(book, HttpStatus.OK);

    }

    @GetMapping("/")
    public ResponseEntity<String> applicationStatus(){
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

}
