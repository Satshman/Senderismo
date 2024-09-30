/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.repo;

import com.senderismo.Senderismo.entity.Activities;
import jakarta.persistence.Query;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, Long> {

    @Query("SELECT DISTINCT r.activitiesType FROM Activities r")
    List<String> findDistinctActivitiesTypes();
    
    @Query("SELECT r FROM Activities r WHERE r.activitiesType LIKE :ActivitiesType AND r.id NOT IN (SELECT bk.activities.id FROM Reservation bk)")
    List<Activities> findAvailableActivitiesByDatesAndTypes(LocalDate date, String ActivitiesType);
    
    @Query("SELECT r FROM Activities r WHERE r.id NOT IN (SELECT b.activities.id FROM Reservation b)")
    List<Activities> getAllAvailableActivities();
}

