package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        logger.trace("This is a TRACE message - most detailed, rarely used");
        logger.debug("This is a DEBUG message - useful during development");
        logger.info("This is an INFO message - general application flow");

        logger.warn("This is a WARN message - low disk space: {}MB remaining", 120);

        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            logger.error("An ERROR occurred while dividing numbers: {}", e.getMessage());
        }

        String user = "Shenivi";
        int attemptCount = 3;
        logger.warn("Login attempt {} failed for user: {}", attemptCount, user);

        try {
            riskyOperation();
        } catch (Exception e) {
            logger.error("Unexpected failure in riskyOperation()", e);
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static void riskyOperation() throws Exception {
        throw new Exception("Simulated failure for logging demo");
    }
}