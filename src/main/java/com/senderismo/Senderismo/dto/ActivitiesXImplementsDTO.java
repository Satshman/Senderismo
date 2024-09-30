/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senderismo.Senderismo.entity.Activities;
import com.senderismo.Senderismo.entity.Implement;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ActivitiesXImplementsDTO {
    private Long id;
    private ImplementDTO implement;
    private ActivitiesDTO activities;    
}
