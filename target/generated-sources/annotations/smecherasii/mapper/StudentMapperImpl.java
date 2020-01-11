package smecherasii.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import smecherasii.domain.Student;
import smecherasii.dto.StudentDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-12T00:07:25+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto toStudentDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setUsername( student.getUsername() );
        studentDto.setPassword( student.getPassword() );
        studentDto.setEmail( student.getEmail() );
        studentDto.setId( student.getId() );
        studentDto.setFirstName( student.getFirstName() );
        studentDto.setLastName( student.getLastName() );

        return studentDto;
    }
}
