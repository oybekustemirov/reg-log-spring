package qqb.uz.reglogspring.service;

import qqb.uz.reglogspring.model.User;
import qqb.uz.reglogspring.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
