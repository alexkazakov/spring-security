package com.saritasa.spring.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created with IntelliJ IDEA.
 * User: ak
 * Date: 11.02.13
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public class Product {
    private String name;
    private float price;

    @JsonCreator
    public Product(@JsonProperty("name") String name,
                   @JsonProperty("price") float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
