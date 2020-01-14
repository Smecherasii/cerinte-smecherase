package smecherasii.service;

import org.springframework.stereotype.Service;

import smecherasii.domain.Company;
import smecherasii.dto.CompanyDto;
import smecherasii.dto.UserDto;
import smecherasii.exception.InvalidDataException;
import smecherasii.mapper.CompanyMapper;
import smecherasii.repository.CompanyRepository;

import java.util.UUID;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    private final CompanyMapper companyMapper;

    public CompanyServiceImpl(CompanyRepository companyRepository, CompanyMapper companyMapper) {
        this.companyRepository = companyRepository;
        this.companyMapper = companyMapper;
    }

    @Override
    public void save(CompanyDto companyDto) {
        Company company = companyMapper.toCompany(companyDto);

        try {
            companyRepository.save(company);
        } catch (Exception ex) {
            throw new InvalidDataException(InvalidDataException.INVALID_COMPANY_DATA);
        }
    }

    @Override
    public UserDto findBy(UUID companyId) {
        Company company = companyRepository.findById(companyId).get();
        UserDto userDto = new UserDto();
        userDto.setUsername(company.getUsername());
        userDto.setPassword(company.getPassword());
        userDto.setEmail(company.getEmail());
        userDto.setUserType(company.getUserType());

        return userDto;
    }

}
