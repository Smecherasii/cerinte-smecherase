package smecherasii.service;

import smecherasii.domain.Internship;
import smecherasii.dto.InternshipDto;

import java.util.List;

/**
 * Created by Adriana on 1/13/2020.
 */
public interface InternshipService {
    List<Internship> getInternships(InternshipDto internshipDto);
}
