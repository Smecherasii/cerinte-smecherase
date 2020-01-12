package smecherasii.dto;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import smecherasii.domain.UserType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class UserDto implements Serializable {

    public static final long serialVersionUID = 1L;

    private UUID id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String email;

    @Enumerated(EnumType.STRING)
    private UserType userType;

}
