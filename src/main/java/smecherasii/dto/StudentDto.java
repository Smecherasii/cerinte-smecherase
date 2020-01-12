package smecherasii.dto;

import javax.validation.constraints.NotNull;

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

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

}
