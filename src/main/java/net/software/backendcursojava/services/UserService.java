package net.software.backendcursojava.services;

import org.springframework.stereotype.Service;

import net.software.backendcursojava.Shared.dto.UserDTO;

@Service
public class UserService implements UserServiceInterface {


    @Override
    public UserDTO createUser(UserDTO userDto) {
        // TODO logica de la creacion del usuario
        return null;
    }

    
    
}
