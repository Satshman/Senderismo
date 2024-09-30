/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senderismo.Senderismo.entity.Reservation;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private String id;
    private String email;
    private String name;
    private String surname;
    private String phoneNumber;
    private String role;
    private List<ReservationDTO> reservation = new ArrayList<>();
}
