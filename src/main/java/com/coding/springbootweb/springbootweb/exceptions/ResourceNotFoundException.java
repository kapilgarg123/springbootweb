package com.coding.springbootweb.springbootweb.exceptions;


public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
