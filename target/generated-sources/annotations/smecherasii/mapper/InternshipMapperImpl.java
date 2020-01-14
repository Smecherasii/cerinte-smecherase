package smecherasii.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import smecherasii.domain.Application;
import smecherasii.domain.Internship;
import smecherasii.dto.InternshipDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-14T12:43:35+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_232 (AdoptOpenJDK)"
)
@Component
public class InternshipMapperImpl implements InternshipMapper {

    @Override
    public List<InternshipDto> toInternshipsDto(List<Internship> internships) {
        if ( internships == null ) {
            return null;
        }

        List<InternshipDto> list = new ArrayList<InternshipDto>( internships.size() );
        for ( Internship internship : internships ) {
            list.add( internshipToInternshipDto( internship ) );
        }

        return list;
    }

    @Override
    public Internship toInternship(InternshipDto internshipDto) {
        if ( internshipDto == null ) {
            return null;
        }

        Internship internship = new Internship();

        internship.setId( internshipDto.getId() );
        internship.setName( internshipDto.getName() );
        internship.setDomain( internshipDto.getDomain() );
        internship.setSalary( internshipDto.getSalary() );
        internship.setStartDate( internshipDto.getStartDate() );
        internship.setEndDate( internshipDto.getEndDate() );
        List<Application> list = internshipDto.getApplications();
        if ( list != null ) {
            internship.setApplications( new ArrayList<Application>( list ) );
        }

        return internship;
    }

    protected InternshipDto internshipToInternshipDto(Internship internship) {
        if ( internship == null ) {
            return null;
        }

        InternshipDto internshipDto = new InternshipDto();

        internshipDto.setId( internship.getId() );
        internshipDto.setName( internship.getName() );
        internshipDto.setDomain( internship.getDomain() );
        internshipDto.setSalary( internship.getSalary() );
        internshipDto.setStartDate( internship.getStartDate() );
        internshipDto.setEndDate( internship.getEndDate() );
        List<Application> list = internship.getApplications();
        if ( list != null ) {
            internshipDto.setApplications( new ArrayList<Application>( list ) );
        }

        return internshipDto;
    }
}
