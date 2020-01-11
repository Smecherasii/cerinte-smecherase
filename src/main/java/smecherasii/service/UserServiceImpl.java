package smecherasii.service;

import org.springframework.stereotype.Service;

import smecherasii.domain.User;
import smecherasii.domain.UserType;
import smecherasii.dto.UserDto;
import smecherasii.exception.NotFoundException;
import smecherasii.mapper.CompanyMapper;
import smecherasii.mapper.StudentMapper;
import smecherasii.repository.CompanyRepository;
import smecherasii.repository.StudentRepository;
import smecherasii.repository.UserRepository;

import static smecherasii.exception.NotFoundException.USER_NOT_FOUND;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private StudentRepository studentRepository;

    private CompanyRepository companyRepository;

    private StudentMapper studentMapper;

    private CompanyMapper companyMapper;

    public UserServiceImpl(UserRepository userRepository, StudentRepository studentRepository,
                           CompanyRepository companyRepository, StudentMapper studentMapper,
                           CompanyMapper companyMapper) {
        this.userRepository = userRepository;
        this.studentRepository = studentRepository;
        this.companyRepository = companyRepository;
        this.studentMapper = studentMapper;
        this.companyMapper = companyMapper;
    }

    public UserDto login(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password)
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND));

        if (user.getUserType().equals(UserType.STUDENT)) {
            return studentMapper.toStudentDto(studentRepository.findById(user.getId())
                    .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND)));
        } else {
            return companyMapper.toCompanyDto(companyRepository.findById(user.getId())
                    .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND)));
        }

    }

}
