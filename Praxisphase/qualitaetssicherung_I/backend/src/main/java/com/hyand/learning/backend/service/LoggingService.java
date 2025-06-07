package com.hyand.learning.backend.service;

import com.hyand.learning.backend.model.dto.LogTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

    @Service
    public class LoggingService {

        private static final Logger logger = LoggerFactory.getLogger(LoggingService.class);

        public void log(LogTO entry) {
            //logger.trace("Log-Eintrag empfangen: {}", entry);
            logger.info("Log-Eintrag empfangen: {}", entry);
            switch (entry.getStatus()) {
                case 400 -> logger.warn("Client Error (400): {}", entry);
                case 401, 403 -> logger.error("Auth Error ({}): {}", entry.getStatus(), entry);
                case 404 -> logger.info("Not Found (404): {}", entry);
                case 500 -> logger.error("Server Error (500): {}", entry);
                default -> logger.debug("Other Error: {}", entry);
            }


        }

        public void demoLogLevels() {
            logger.trace("TRACE-Level Beispiel");
            logger.debug("DEBUG-Level Beispiel");
            logger.info("INFO-Level Beispiel");
            logger.warn("WARN-Level Beispiel");
            logger.error("ERROR-Level Beispiel");
        }
    }

