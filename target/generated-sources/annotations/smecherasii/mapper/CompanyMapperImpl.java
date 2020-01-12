package smecherasii.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import smecherasii.domain.Company;
import smecherasii.dto.CompanyDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-12T16:32:16+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public CompanyDto toCompanyDto(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDto companyDto = new CompanyDto();

        companyDto.setId( company.getId() );
        companyDto.setUsername( company.getUsername() );
        companyDto.setPassword( company.getPassword() );
        companyDto.setEmail( company.getEmail() );
        companyDto.setUserType( company.getUserType() );
        companyDto.setDescription( company.getDescription() );
        companyDto.setLocation( company.getLocation() );
        companyDto.setName( company.getName() );

        return companyDto;
    }

    @Override
    public Company toCompany(CompanyDto company) {
        if ( company == null ) {
            return null;
        }

        Company company1 = new Company();

        company1.setId( company.getId() );
        company1.setUsername( company.getUsername() );
        company1.setEmail( company.getEmail() );
        company1.setPassword( company.getPassword() );
        company1.setUserType( company.getUserType() );
        company1.setName( company.getName() );
        company1.setLocation( company.getLocation() );
        company1.setDescription( company.getDescription() );

        return company1;
    }
}
