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
public class Student extends User {

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "student")
    private List<Application> applications;

}
