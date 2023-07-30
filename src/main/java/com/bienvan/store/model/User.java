package com.bienvan.store.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email(message = "Email không hợp lệ")
    @NotBlank(message = "Email không được để trống")
    private String email;
    
    @NotEmpty(message = "Thiếu password") 
    private String password;

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @NotBlank(message = "Vui lòng chọn giới tính")
    private String gender;

    @NotBlank(message = "Vui lòng chọn vai trò")
    private String role;

    // Ví dụ quan hệ nhiều-1 (một User có nhiều Product)
   
    @OneToMany(mappedBy = "user")
    private List<Product> products;

    @OneToMany(mappedBy = "userId")
    private List<Order> orders;

}