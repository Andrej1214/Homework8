package com.pavlov.rest_api.utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;

import java.util.List;

public final class ResponseBodyUtils {

    public static <T> List<T> getObjectsByJsonPath(ResponseBody responseBody, String jsonpath, Class<T> type) {
        return responseBody
                .jsonPath()
                .getList(jsonpath, type);
    }
    public static <T> T getObjectByJsonPath(ResponseBody responseBody, String jsonpath, Class<T> type) {
        return responseBody
                .jsonPath()
                .getObject(jsonpath, type);
    }
    public static String getStringByJsonValue(ResponseBody responseBody, String jsonPath) {
        return JsonPath.from(responseBody.asString())
                .getString(jsonPath);
    } 
}
