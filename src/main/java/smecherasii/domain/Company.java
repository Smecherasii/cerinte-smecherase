package smecherasii.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

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

    private String name;

    private String location;

    private String description;

    @OneToMany(mappedBy = "company")
    private List<Internship> internships;

}
