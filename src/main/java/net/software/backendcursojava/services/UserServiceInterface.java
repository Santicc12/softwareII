package net.software.backendcursojava.services;


import org.springframework.security.core.userdetails.UserDetailsService;

import net.software.backendcursojava.Shared.dto.UserDTO;

public interface UserServiceInterface extends UserDetailsService {
    
     public UserDTO createUser(UserDTO userDto);
        
}
