package smecherasii.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import smecherasii.domain.Company;
import smecherasii.dto.CompanyDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-12T00:07:25+0200",
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

        companyDto.setUsername( company.getUsername() );
        companyDto.setPassword( company.getPassword() );
        companyDto.setEmail( company.getEmail() );
        companyDto.setId( company.getId() );
        companyDto.setDescription( company.getDescription() );
        companyDto.setLocation( company.getLocation() );
        companyDto.setName( company.getName() );

        return companyDto;
    }
}
