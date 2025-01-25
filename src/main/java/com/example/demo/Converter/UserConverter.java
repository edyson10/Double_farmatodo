package com.example.demo.Converter;

import com.example.demo.Model.DTO.UserDTO;
import com.example.demo.Model.Entity.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UserConverter {

    public Usuario modelToEntidy(UserDTO model) {
        Usuario user = new Usuario();
        user.setId(model.getId());
        user.setNombres(model.getNombres());
        user.setApellidos(model.getApellidos());
        user.setFechaCreacion(model.getFechaCreacion());
        user.setFechaActualizacion(model.getFechaActualizacion());
        return user;
    }

    public UserDTO entityToModel(Usuario user){
        UserDTO model = new UserDTO();
        model.setId(user.getId());
        model.setNombres(user.getNombres());
        model.setApellidos(user.getApellidos());
        model.setFechaCreacion(user.getFechaCreacion());
        model.setFechaActualizacion(user.getFechaActualizacion());
        return model;
    }
}
