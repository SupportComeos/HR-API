package com.hikaad.utils;

import org.apache.log4j.Logger;

public class HikaadLogger {

    private static final Logger logger = Logger.getLogger(HikaadLogger.class);

    /**
     * Constructeur
     */
    private HikaadLogger() {
        // Do Nothing
    }

    /**
     * Write an information message in log file
     *
     * @param message       Message
     */
    public static void info(String message) {
        logger.info(message);
    }

    /**
     * Write an error information in log file
     *
     * @param message       Message
     */
    public static void error(String message) {
        logger.error(message);
    }

    /**
     * Write a warning information in log file
     *
     * @param message       Message
     */
    public static void warn(String message) {
        logger.warn(message);
    }

}