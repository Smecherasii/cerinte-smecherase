package smecherasii.service;

import smecherasii.domain.Company;
import smecherasii.dto.CompanyDto;
import smecherasii.dto.UserDto;

import java.util.UUID;

public interface CompanyService {

    void save(CompanyDto companyDto);
    UserDto findBy(UUID companyId);

}
