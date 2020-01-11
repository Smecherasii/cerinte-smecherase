package smecherasii.domain;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Application extends BaseEntity {

    @ManyToOne(optional = false)
    private Student student;

    @ManyToOne(optional = false)
    private Internship internship;

    //TODO(Team) facem sau nu cv?
//    private String cv;

    private String additionalInformation;

}
