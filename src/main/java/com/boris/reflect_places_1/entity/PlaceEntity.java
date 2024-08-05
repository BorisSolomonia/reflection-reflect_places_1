package com.boris.reflect_places_1.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "places")
public class PlaceEntity implements Place{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double lat;
    private double lng;
    @Column(name = "user_name")
    private String username;

    // Getters and Setters

    public PlaceEntity(String name, double lat, double lng, String username) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.username = username;
    }
}
