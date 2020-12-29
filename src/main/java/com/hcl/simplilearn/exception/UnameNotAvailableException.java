package com.hcl.simplilearn.exception;

public class UnameNotAvailableException extends Exception {
    private static final long serialVersionUID = 1L;

    public UnameNotAvailableException() {
        super("User name is not available!");
    }
}
