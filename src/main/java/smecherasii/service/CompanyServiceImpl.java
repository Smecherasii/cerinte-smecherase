package smecherasii.service;

import org.springframework.stereotype.Service;

import smecherasii.domain.Company;
import smecherasii.dto.CompanyDto;
import smecherasii.exception.InvalidDataException;
import smecherasii.mapper.CompanyMapper;
import smecherasii.repository.CompanyRepository;

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

}
