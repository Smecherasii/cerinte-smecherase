package smecherasii.service;

import smecherasii.dto.UserDto;

public interface UserService {

    UserDto login(String username, String password);

}
