package smecherasii.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto extends UserDto {

    public static final long serialVersionUID = 2L;

    private String firstName;

    private String lastName;

}
