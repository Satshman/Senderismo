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
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author santi
 */
@Data
@Entity
@Table(name = "schedulesxreservation")
public class SchedulesXReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activities_id")
    private Activities activities;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedules_id")
    private Schedules schedules;
    
    
    @Override
    public String toString() {
        return "SchedulesXReservation{"+
                "id=" + id + "\'" +
                "}";
    }
    
}
