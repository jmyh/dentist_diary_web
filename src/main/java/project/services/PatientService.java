package project.services;

import project.models.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> findAll();

    Patient findOne(Long patientID);

    void deleteOne(Long patientID);

    Patient updateOne(Patient patient);

    void addOne(Patient patient);
}
