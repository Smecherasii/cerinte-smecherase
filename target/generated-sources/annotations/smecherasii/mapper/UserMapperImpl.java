package smecherasii.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import smecherasii.domain.User;
import smecherasii.dto.UserDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-14T11:15:39+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_232 (AdoptOpenJDK)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );
        userDto.setEmail( user.getEmail() );
        userDto.setUserType( user.getUserType() );

        return userDto;
    }
}
