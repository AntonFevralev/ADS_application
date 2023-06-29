package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class ExtendedAdDTO {
    Integer adId;
    String authorFirstName;
    String authorLastName;
    String description;
    String email;
    String image;
    String phone;
    Integer price;
    String title;

}
