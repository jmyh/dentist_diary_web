package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.forms.PatientForm;
import project.models.Patient;
import project.services.PatientServiceImpl;

import java.util.List;
@RestController
public class PatientController {

    @Autowired
    private PatientServiceImpl patientService;

    @GetMapping("/patients")
    public List<Patient> getAllPatients() {
        return patientService.findAll();
    }

    @PostMapping("/patients")
    public ResponseEntity<Object> addPatient(@RequestBody PatientForm patientForm) {
        patientService.addOne(patientForm);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/patients")
    public Patient updatePatient(@RequestBody PatientForm patientForm, @RequestParam(value="id") Long patientID) {
        return patientService.updateOne(patientForm, patientID);
    }

    @DeleteMapping("/patients")
    public ResponseEntity<Object> delPatient(@RequestParam(value="id") Long patientID) {
        patientService.deleteOne(patientID);
        return ResponseEntity.ok().build();
    }
}
