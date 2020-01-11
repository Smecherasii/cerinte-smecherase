package smecherasii.mapper;

import org.mapstruct.Mapper;

import smecherasii.domain.User;
import smecherasii.dto.UserDto;

@Mapper
public interface UserMapper {

    UserDto toUserDto(User user);

}
