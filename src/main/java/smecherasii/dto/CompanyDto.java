package smecherasii.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto extends UserDto {

    public static final long serialVersionUID = 3L;

    private String description;

    private String location;

    private String name;

}
