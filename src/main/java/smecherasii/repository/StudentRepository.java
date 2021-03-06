package smecherasii.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import smecherasii.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
}
