package smecherasii.mapper;

import org.mapstruct.Mapper;

import smecherasii.domain.Company;
import smecherasii.dto.CompanyDto;

@Mapper(uses = {UserMapper.class})
public interface CompanyMapper {

    CompanyDto toCompanyDto(Company company);

    Company toCompany(CompanyDto company);

}
