/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.kruger.vaccination.dao;

import com.kruger.vaccination.model.Employee;
import com.kruger.vaccination.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author papic
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    List<User> findByRole(String rol);
    User findByUsername(String username);
    User findByEmployee(Employee employee);
    Boolean existsByEmployee(Employee employee);
}
