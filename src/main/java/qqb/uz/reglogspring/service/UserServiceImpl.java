package qqb.uz.reglogspring.service;


import org.springframework.stereotype.Service;
import qqb.uz.reglogspring.model.Role;
import qqb.uz.reglogspring.model.User;
import qqb.uz.reglogspring.repository.UserRepository;
import qqb.uz.reglogspring.web.dto.UserRegistrationDto;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getId(), registrationDto.getFirstName(), registrationDto.getLastName(),
                registrationDto.getEmail(),registrationDto.getPassword(),Arrays.asList(new Role("ROLE_User")));
        return userRepository.save(user);
    }



  /*  @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getId(),registrationDto.getFirstName(), registrationDto.getLastName(),
                registrationDto.getEmail(), Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }*/
}
