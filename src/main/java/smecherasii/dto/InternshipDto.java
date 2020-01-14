package smecherasii.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import smecherasii.domain.Application;
import smecherasii.domain.Company;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * Created by Adriana on 1/13/2020.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InternshipDto implements Serializable{
    public static final long serialVersionUID = 1L;

    private UUID id;

    private String name;

    private String domain;

    private double salary;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    private List<Application> applications;

    private UUID companyId;
}
