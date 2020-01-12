package smecherasii.service;

import org.springframework.stereotype.Service;

import smecherasii.domain.Student;
import smecherasii.dto.StudentDto;
import smecherasii.exception.InvalidDataException;
import smecherasii.mapper.StudentMapper;
import smecherasii.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public void save(StudentDto studentDto) {
        Student student = studentMapper.toStudent(studentDto);

        try {
            studentRepository.save(student);
        } catch (Exception ex) {
            throw new InvalidDataException(InvalidDataException.INVALID_STUDENT_DATA);
        }
    }

}
