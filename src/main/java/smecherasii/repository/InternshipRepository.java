package smecherasii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smecherasii.domain.Company;
import smecherasii.domain.Internship;

import java.util.UUID;

/**
 * Created by Adriana on 1/13/2020.
 */
public interface InternshipRepository extends JpaRepository<Internship, UUID> {
}
