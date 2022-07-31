package com.pavlov.rest_api.service;

import com.google.common.collect.ImmutableMap;
import com.pavlov.rest_api.bean.Product;
import com.pavlov.rest_api.endpoints.OnlinerEndpoints;
import com.pavlov.rest_api.utils.GetRequestUtils;
import com.pavlov.rest_api.utils.ResponseBodyUtils;
import io.restassured.response.ResponseBody;

import java.util.List;
import java.util.Map;

public class ProductsService {
    private final static String PRODUCTS_JSON_PATH = "products";
    private final static String NAME_PREFIX_PRODUCTS_JSON_PATH = "products.name_prefix";

    public List<Product> getProductsItems() {
        ResponseBody responseBody = GetRequestUtils.makeRequestAndGetResponseBody(
                OnlinerEndpoints.getCatalogProductsEndPoint(),
                configureHeaders(),
                null);
        return ResponseBodyUtils.getObjectsByJsonPath(responseBody, PRODUCTS_JSON_PATH, Product.class);
    }

    public List<String> getProductsNamePrefixItems() {
        ResponseBody responseBody = GetRequestUtils.makeRequestAndGetResponseBody(
                OnlinerEndpoints.getNamePrefixProductsEndPoint(),
                configureHeaders(),
                null);
        return ResponseBodyUtils.getObjectsByJsonPath(responseBody, NAME_PREFIX_PRODUCTS_JSON_PATH, String.class);
    }

    public static Map<String, Object> configureHeaders() {
        return ImmutableMap.of("Host", "catalog.onliner.by");
    }

}
