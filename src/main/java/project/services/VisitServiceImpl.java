package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.forms.VisitForm;
import project.models.Patient;
import project.models.Visit;
import project.repositories.PatientRepository;
import project.repositories.VisitRepository;

import java.util.List;

@Service
public class VisitServiceImpl implements VisitService {

    @Autowired
    private VisitRepository visitRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Visit> findAllForPatient(Long patientID) {
        return visitRepository.findByPatientId(patientID);
    }

    @Override
    public Visit updateOne(VisitForm visitForm, Long visitID) {
        Visit visit=Visit.from(visitForm);
        visit.setId(visitID);
        return visitRepository.save(visit);
    }

    @Override
    public void deleteOne(Long visitID) {
        visitRepository.deleteById(visitID);
    }

    @Override
    public Visit addOne(VisitForm visitForm, Long patientID) {
        Visit visit=Visit.from(visitForm);
        Patient patient=patientRepository.getOne(patientID);
        visit.setPatient(patient);
        return visitRepository.save(visit);
    }

}
