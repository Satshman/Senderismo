/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senderismo.Senderismo.repo;

import com.senderismo.Senderismo.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author santi
 */
public interface UserRepository extends JpaRepository <User, Long>{
    
    boolean existsByEmail(String email);
    
    Optional<User> findByEmail(String email);
}
