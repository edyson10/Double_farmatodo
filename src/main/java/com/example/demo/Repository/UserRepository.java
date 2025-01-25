package com.example.demo.Repository;

import com.example.demo.Model.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Usuario, UUID> {
}
