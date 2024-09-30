/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senderismo.Senderismo.entity.Activities;
import com.senderismo.Senderismo.entity.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author santi
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedbackDTO {
    private Long id;
    private String feedback;
    private int qualification;
    private LocalDate date;
    private ActivitiesDTO activities;
    private UserDTO user;
    
}
