package smecherasii.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import smecherasii.domain.Student;
import smecherasii.dto.StudentDto;

@Mapper(uses = {UserMapper.class})
public interface StudentMapper {

    StudentDto toStudentDto(Student student);

    @Mapping(source = "userType", target = "userType")
    Student toStudent(StudentDto studentDto);

}
