package smecherasii.domain;


import javax.persistence.ManyToOne;

public class Application extends BaseEntity {

    private Student student;

    @ManyToOne
    private Internship internship;

//    private String cv;

    private String additionalInformation;

}
