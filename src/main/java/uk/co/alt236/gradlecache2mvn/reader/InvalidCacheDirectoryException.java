package uk.co.alt236.gradlecache2mvn.reader;

public class InvalidCacheDirectoryException extends RuntimeException {
    public InvalidCacheDirectoryException(final String message) {
        super(message);
    }
}
