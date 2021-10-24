package project.services;

import project.forms.VisitForm;
import project.models.Visit;

import java.util.*;

interface VisitService {

    List<Visit> findAllForPatient(Long patientID);

    Visit updateOne(VisitForm visitForm,Long visitID);

    void deleteOne(Long visitID);

    Visit addOne(VisitForm visitForm, Long patientID);

}
