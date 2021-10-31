package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.forms.PatientForm;
import project.forms.VisitForm;
import project.models.Patient;
import project.models.Visit;
import project.services.PatientServiceImpl;
import project.services.VisitServiceImpl;

import java.util.List;
@RestController
@RequestMapping("/api")
public class VisitController {

    @Autowired
    private VisitServiceImpl visitService;

    @GetMapping("/visits")
    public List<Visit> getAllVisitsForPatient(@RequestParam(value="patient_id") Long patientID) {
        return visitService.findAllForPatient(patientID);
    }

    @PostMapping("/visits")
    public ResponseEntity<Object> addVisit(@RequestBody VisitForm visitForm,@RequestParam(value="patient_id") Long patientID) {
        visitService.addOne(visitForm,patientID);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/visits")
    public ResponseEntity<Object> updateVisit(@RequestBody VisitForm visitForm, @RequestParam(value="id") Long visitID) {
        visitService.updateOne(visitForm, visitID);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/visits")
    public ResponseEntity<Object> delVisit(@RequestParam(value="id") Long visitID) {
        visitService.deleteOne(visitID);
        return ResponseEntity.ok().build();
    }
}
