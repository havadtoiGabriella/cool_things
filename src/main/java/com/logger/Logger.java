package com.logger;

import org.apache.logging.log4j.LogManager;

public class Logger {

    private final org.apache.logging.log4j.Logger logger;

    public Logger(final Class<?> clazz) {
        logger = LogManager.getLogger(clazz);
    }

    public void info(final String message) {
        logger.info(message);
    }

    public void debug(final String message) {
        logger.debug(message);
    }
}
