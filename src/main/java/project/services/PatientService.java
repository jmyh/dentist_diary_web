package project.services;

import project.forms.PatientForm;
import project.models.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> findAll();

    Patient findOne(Long patientID);

    void deleteOne(Long patientID);

    Patient updateOne(PatientForm patient, Long patientID);

    void addOne(PatientForm patientForm);
}
