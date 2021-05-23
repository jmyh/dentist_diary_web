package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.models.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {

}
