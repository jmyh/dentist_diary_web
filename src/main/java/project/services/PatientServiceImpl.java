package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.Patient;
import project.repositories.PatientRepository;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;
    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient findOne(Long patientID) {
        return patientRepository.getOne(patientID);
    }

    @Override
    public void deleteOne(Long patientID) {
        patientRepository.deleteById(patientID);
    }

    @Override
    public Patient updateOne(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void addOne(Patient patient) {
        patientRepository.save(patient);
    }
}
