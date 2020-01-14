package smecherasii.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import smecherasii.domain.Internship;
import smecherasii.dto.InternshipDto;

import java.util.List;

/**
 * Created by Adriana on 1/13/2020.
 */
@Mapper
public interface InternshipMapper {
    List<InternshipDto> toInternshipsDto(List<Internship> internships);
    Internship toInternship(InternshipDto internshipDto);
}
