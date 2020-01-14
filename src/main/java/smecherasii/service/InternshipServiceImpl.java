package smecherasii.service;

import org.springframework.stereotype.Service;
import smecherasii.domain.Company;
import smecherasii.domain.Internship;
import smecherasii.dto.InternshipDto;
import smecherasii.mapper.InternshipMapper;
import smecherasii.repository.CompanyRepository;
import smecherasii.repository.InternshipRepository;

import java.util.List;

/**
 * Created by Adriana on 1/13/2020.
 */
@Service
public class InternshipServiceImpl implements InternshipService{
    public final InternshipRepository internshipRepository;
    public final CompanyRepository companyRepository;
    public final InternshipMapper internshipMapper;

    public InternshipServiceImpl(InternshipRepository internshipRepository, InternshipMapper internshipMapper, CompanyRepository companyRepository){
        this.internshipRepository = internshipRepository;
        this.internshipMapper = internshipMapper;
        this.companyRepository = companyRepository;
    }

    public List<Internship> getInternships(InternshipDto internshipDto){
        return this.internshipRepository.findAll();
    }

    @Override
    public void addInternship(InternshipDto internshipDto) {
        Internship internship = internshipMapper.toInternship(internshipDto);
        Company company = companyRepository.getOne(internshipDto.getCompanyId());
        internship.setCompany(company);
        this.internshipRepository.save(internship);
    }
}
