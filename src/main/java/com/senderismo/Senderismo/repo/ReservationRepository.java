/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.repo;

import com.senderismo.Senderismo.entity.Reservation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author santi
 */
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
    
    List<Reservation> findByActivities(Long, activitiesId);
    
    List<Reservation> findByReservationConfirmationCode(String confirmationCode);
    
    List<Reservation> findByUserId(Long, userId);
}
