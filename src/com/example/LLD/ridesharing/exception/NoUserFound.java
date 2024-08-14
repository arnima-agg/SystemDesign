package com.example.LLD.ridesharing.exception;

public class NoUserFound extends RuntimeException{
   public NoUserFound(String msg) {
       super(msg);
   }
}
