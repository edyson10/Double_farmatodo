package com.example.demo.Service;

import com.example.demo.Model.DTO.UserDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    UserDTO createUser(UserDTO usuario);

    List<UserDTO> getUsers();

    Optional<UserDTO> getUserById(UUID id);

    UserDTO updateUser(UUID id, UserDTO user);
}
