package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import project.forms.PatientForm;
import project.models.Patient;
import project.repositories.PatientRepository;
import project.services.PatientServiceImpl;

import java.util.List;

@RestController("/patients")
public class PatientController {

    @Autowired
    private PatientServiceImpl patientService;

    @GetMapping("/get_patients")
    public List<Patient> getAllPatients() {
        return patientService.findAll();
    }

    @PostMapping("/add_patient")
    public ResponseEntity<Object> addPatient(Patient patient) {
        patientService.addOne(patient);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update_patient")
    public Patient updatePatient(Patient patient) {
        return null;
    }

    @DeleteMapping("/delete_patient/{patient_id}")
    public ResponseEntity<Object> delPatient(@PathVariable("patient_id") Long patientID) {
        patientService.deleteOne(patientID);
        return ResponseEntity.ok().build();
    }
}
