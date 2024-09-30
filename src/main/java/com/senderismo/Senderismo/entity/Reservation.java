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
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "reservation date is required")
    private LocalDate reservationDate;
    @Min(value = 1, message = "Number of People must not be less that 1")
    private int numOfPeople;
    
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activities_id")
    private Activities activities;
    

    public void setNumOfPeople(int numOfPeople){
        this.numOfPeople = numOfPeople;
    }
    
    @Override
    public String toString() {
        return "Reservation{"+
                "id=" + id +
                "reservationDate=" + reservationDate +
                "numOfPeople=" + numOfPeople +
                "status=" + status + "\'" +
                "}";
    }
}
