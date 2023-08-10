package com.bienvan.store.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
public class ProductDto {

    private Long id;

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @NotBlank(message = "Mô tả không được để trống")
    private String description;

    @Min(value = 1, message = "Giá phải lớn hơn hoặc bằng 1")
    private double price;

    private String image;

    @Min(value = 0, message = "Số lượng phải lớn hơn 0")
    private int quantity;

    private String color;

    private String brand;

    private Long user_id;

    private Long category_id;

    public ProductDto(Long id, String name,
            String description,
            double price, String image,
            int quantity, String color, String brand, Long user_id,
            Long category_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.quantity = quantity;
        this.color = color;
        this.brand = brand;
        this.user_id = user_id;
        this.category_id = category_id;
    }

}
