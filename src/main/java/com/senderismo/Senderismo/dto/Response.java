/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senderismo.Senderismo.entity.User;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Response {
    
    private int statusCode;
    private String message;
    private String token;
    private String role;
    private String expirationTime;
    private String status;
    private UserDTO user;
    private ActivitiesDTO activities;
    private ReservationDTO reservation;
    private ActivitiesXCategoriesDTO activitiesxcategories;
    private ActivitiesXImplementsDTO activitiesximplements;
    private CategoriesDTO categories;
    private FeedbackDTO feedback;
    private FeedbackXUsersDTO feedbackxusers;
    private ImplementDTO implement;
    private OrganizersDTO organizers;
    private PaymentsDTO payments;
    private SchedulesDTO schedules;
    private SchedulesXReservationDTO schedulesxreservation;
    private UbicationDTO ubication;
    private List<UserDTO> userList;
    private List<ActivitiesDTO> activitiesList;
    private List<ReservationDTO> reservationList;        
    private List<ActivitiesXCategoriesDTO> activitiesxcategoriesList;
    private List<ActivitiesXImplementsDTO> activitiesximplementsList;
    private List<CategoriesDTO> categoriesList;
    private List<FeedbackDTO> feedbackList;
    private List<FeedbackXUsersDTO> feedbackxusersList;    
    private List<ImplementDTO> implementList;
    private List<OrganizersDTO> organizersList;
    private List<PaymentsDTO> paymentsList;
    private List<SchedulesDTO> schedulesList;    
    private List<UbicationDTO> ubicationList;
}
