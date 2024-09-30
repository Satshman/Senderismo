/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 *
 * @author santi
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImplementDTO {
    private Long id;
    private String name;
    private String description;
    private int price;
    
}
