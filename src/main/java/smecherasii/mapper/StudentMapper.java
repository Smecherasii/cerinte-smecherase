package smecherasii.mapper;

import org.mapstruct.Mapper;

import smecherasii.domain.Student;
import smecherasii.dto.StudentDto;

@Mapper(uses = {UserMapper.class})
public interface StudentMapper {

    StudentDto toStudentDto(Student student);

}
