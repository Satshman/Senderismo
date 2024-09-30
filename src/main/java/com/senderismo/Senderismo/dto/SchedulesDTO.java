/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senderismo.Senderismo.entity.Activities;
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
public class SchedulesDTO {
    
    private Long id;
    private LocalDate date;
    private int hour;
    private ActivitiesDTO activities;
}
