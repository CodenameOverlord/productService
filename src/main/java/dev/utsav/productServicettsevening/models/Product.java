package dev.utsav.productServicettsevening.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String title;
    private double price;
    private String description;
    private Category category;
    private String imageUrl;
}
