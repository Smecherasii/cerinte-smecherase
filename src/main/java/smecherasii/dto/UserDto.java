package smecherasii.dto;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

    public static final long serialVersionUID = 1L;

    private UUID id;

    private String username;

    private String password;

    private String email;

}
