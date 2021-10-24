package project.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.forms.PatientForm;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;  //отчество

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "address")
    private String address;

    @OneToMany (mappedBy="patient", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Visit> visits;


    public static Patient from(PatientForm form) {
        return Patient.builder()
                .name(form.getName())
                .surname(form.getSurname())
                .patronymic(form.getPatronymic())
                .birthdate(form.getBirthdate())
                .address(form.getAddress())
                .build();
    }
}