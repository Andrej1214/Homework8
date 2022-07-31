package com.pavlov.rest_api.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private int id;
    private String key;
    private String name;
    private String full_name;

    public Product() {
    }

    public Product(int id, String key, String name, String full_name) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.full_name = full_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (!key.equals(product.key)) return false;
        if (!name.equals(product.name)) return false;
        return full_name.equals(product.full_name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + key.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + full_name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", key='").append(key).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", full_name='").append(full_name).append('\'');
        sb.append("}\n");
        return sb.toString();
    }
}
