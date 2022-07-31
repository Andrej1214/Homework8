package com.pavlov.rest_api.propery_reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    private static final String ENDPOINTS_FILE = "/endpoint.properties";
    private static final Properties ENDPOINTS_PROPERTIES = new Properties();

    static {
        initProperties(ENDPOINTS_PROPERTIES, ENDPOINTS_FILE);
    }

    private static synchronized void initProperties(Properties properties, String fileName) {
        try (InputStream inputStream = PropertiesReader.class.getResourceAsStream(fileName)) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable load properties from file" + fileName);
        }
    }

    public static String getEndpointProperty(String property) {
        return ENDPOINTS_PROPERTIES.getProperty(property);
    }

}

