package org.example.woordenboek.flow.exceptions;

public class WordException extends RuntimeException{
    public WordException() {
        this(null, null);
    }

    public WordException(final String message) {
        this(message, null);
    }

    public WordException(final Throwable cause) {
        this(cause != null ? cause.getMessage() : null, cause);
    }

    public WordException(final String message, final Throwable cause) {
        super(message);
        if (cause != null) super.initCause(cause);
    }
}
