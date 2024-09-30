/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "activities")
public class Activities {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String duration;
    private String difficulty;
    private int capability;
    private int price;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organizers_id")
    private Organizers organizers;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ubication_id")
    private Ubication ubication;
    
    @Override
    public String toString() {
        return "Activities{"+
                "id=" + id +
                "name=" + name +
                "description=" + description +
                "duration=" + duration + 
                "difficulty=" + difficulty +
                "capability=" + capability +
                "price=" + price +"\'" +
                "}";
    }
    
}
