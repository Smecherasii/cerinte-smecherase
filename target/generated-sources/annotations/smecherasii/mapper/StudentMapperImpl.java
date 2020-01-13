package smecherasii.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import smecherasii.domain.Student;
import smecherasii.dto.StudentDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-13T23:44:02+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto toStudentDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId( student.getId() );
        studentDto.setUsername( student.getUsername() );
        studentDto.setPassword( student.getPassword() );
        studentDto.setEmail( student.getEmail() );
        studentDto.setUserType( student.getUserType() );
        studentDto.setFirstName( student.getFirstName() );
        studentDto.setLastName( student.getLastName() );

        return studentDto;
    }

    @Override
    public Student toStudent(StudentDto studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student student = new Student();

        student.setUserType( studentDto.getUserType() );
        student.setId( studentDto.getId() );
        student.setUsername( studentDto.getUsername() );
        student.setEmail( studentDto.getEmail() );
        student.setPassword( studentDto.getPassword() );
        student.setFirstName( studentDto.getFirstName() );
        student.setLastName( studentDto.getLastName() );

        return student;
    }
}
