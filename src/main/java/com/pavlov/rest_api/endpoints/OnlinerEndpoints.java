package com.pavlov.rest_api.endpoints;

import com.pavlov.rest_api.propery_reader.PropertiesReader;

public class OnlinerEndpoints {
    public static String getCatalogProductsEndPoint() {
        return PropertiesReader.getEndpointProperty("products");
    }

    public static String getNamePrefixProductsEndPoint() {
        return PropertiesReader.getEndpointProperty("name_prefix");
    }
}
