package com.example.redditclone.exception;

public class CommunityWebAppException extends RuntimeException {
    public CommunityWebAppException(String message) {
        super(message);
    }
    
    public CommunityWebAppException(String message, Throwable cause) {
        super(message, cause);
    }
}
