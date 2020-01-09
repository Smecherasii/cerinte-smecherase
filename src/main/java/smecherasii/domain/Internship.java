package smecherasii.domain;

import java.time.LocalDate;

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
public class Internship extends BaseEntity {

    @ManyToOne(optional = false)
    private Company company;

    private String domain;

    private double salary;

    private LocalDate startDate;

    private LocalDate endDate;
}