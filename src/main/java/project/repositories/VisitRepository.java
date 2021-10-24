package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.models.Visit;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Long> {
    List<Visit> findByPatientId(Long patientId);
}
