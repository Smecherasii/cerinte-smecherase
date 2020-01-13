package smecherasii.service;

import org.springframework.stereotype.Service;
import smecherasii.domain.Internship;
import smecherasii.dto.InternshipDto;
import smecherasii.mapper.InternshipMapper;
import smecherasii.repository.InternshipRepository;

import java.util.List;

/**
 * Created by Adriana on 1/13/2020.
 */
@Service
public class InternshipServiceImpl implements InternshipService{
    public final InternshipRepository internshipRepository;

    public final InternshipMapper internshipMapper;

    public InternshipServiceImpl(InternshipRepository internshipRepository, InternshipMapper internshipMapper){
        this.internshipRepository = internshipRepository;
        this.internshipMapper = internshipMapper;
    }

    public List<Internship> getInternships(InternshipDto internshipDto){
        return this.internshipRepository.findAll();
    };
}
