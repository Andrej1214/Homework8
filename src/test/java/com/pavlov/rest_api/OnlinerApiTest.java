package com.pavlov.rest_api;

import com.pavlov.rest_api.bean.Product;
import com.pavlov.rest_api.service.ProductsService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class OnlinerApiTest {
    @Test
    public void testApiProducts() {
        List<Product> products = new ProductsService().getProductsItems();
        assertThat(products.stream().noneMatch(x -> x.getName().isEmpty()))
                .as("There is an empty element in the product's list").isTrue();
    }

    @Test
    public void checkNotEmptyNamePrefix() {
        List<String> listNamePrefix = new ProductsService().getProductsNamePrefixItems();
        assertThat(listNamePrefix.stream().allMatch(x -> x.contains("Соус")))
                .as("Not all elements contains name_prefix with value 'Соус' ").isTrue();
    }
}
