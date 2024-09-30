/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senderismo.Senderismo.entity.Activities;
import com.senderismo.Senderismo.entity.Reservation;
import com.senderismo.Senderismo.entity.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author santi
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationDTO {   
    private Long id;
    private LocalDate reservationDate;
    private int numOfPeople;
    private String status;
    private UserDTO user;
    private ActivitiesDTO activities;
    
}
