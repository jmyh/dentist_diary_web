package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import project.repositories.PatientRepository;

@Controller
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public String getUsersPage(ModelMap model) {
        model.addAttribute("patientsFromServer", patientRepository.findAll());
        return "patients";
    }
}
