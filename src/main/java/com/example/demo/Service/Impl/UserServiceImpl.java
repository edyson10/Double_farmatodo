package com.example.demo.Service.Impl;

import com.example.demo.Converter.UserConverter;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Model.Entity.Usuario;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return userConverter.entityToModel(userRepository.save(userConverter.modelToEntidy(userDTO)));
    }

    @Override
    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream().map(userConverter::entityToModel).collect(Collectors.toList());
    }

    @Override
    public Optional<UserDTO> getUserById(UUID id) {
        Optional<Usuario> userEntityOptional = userRepository.findById(id);
        if (userEntityOptional.isPresent()) {
            return Optional.of(userConverter.entityToModel(userEntityOptional.get()));
        } else {
            throw new ResourceNotFoundException("There is no such user with this UUID");
        }
    }

    @Override
    public UserDTO updateUser(UUID id, UserDTO userDTO) {
        Optional<Usuario> userEntityOptional = userRepository.findById(id);
        if (userEntityOptional.isPresent()) {
            userEntityOptional.get().setNombres(userDTO.getNombres());
            userEntityOptional.get().setApellidos(userDTO.getApellidos());
            userEntityOptional.get().setFechaCreacion(userDTO.getFechaCreacion());
            userEntityOptional.get().setFechaActualizacion(userDTO.getFechaActualizacion());
            return userConverter.entityToModel(userRepository.save(userEntityOptional.get()));
        } else {
            throw new ResourceNotFoundException("There is no such user with this UUID");
        }
    }
}
