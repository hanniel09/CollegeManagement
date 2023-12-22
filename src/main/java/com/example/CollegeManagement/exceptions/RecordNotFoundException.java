package com.example.CollegeManagement.exceptions;

public class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException(Long id){
        super("not found record with id: " + id);
    }
}
