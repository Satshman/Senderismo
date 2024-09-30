/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senderismo.Senderismo.entity.Reservation;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author santi
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class PaymentsDTO {
    private Long id;
    private int amount;
    private LocalDate paymentDate;
    private String paymentMethod;
    private String status;
    private ReservationDTO reservation;    
}
