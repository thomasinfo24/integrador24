package com.example.integrador.repository;

import com.example.integrador.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Puedes definir métodos personalizados aquí si es necesario
}
