package project.forms;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientForm {
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthdate;
    private String address;
}
