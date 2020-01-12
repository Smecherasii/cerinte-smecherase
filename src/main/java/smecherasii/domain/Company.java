package smecherasii.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company extends User {

    @NotNull
    private String name;

    @NotNull
    private String location;

    @NotNull
    private String description;

    @OneToMany(mappedBy = "company")
    private List<Internship> internships;

}
