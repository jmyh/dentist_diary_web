package project.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.forms.VisitForm;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visit")
public class Visit {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cost")
    private float cost;

    @Column(name="visit_date")
    private LocalDate visitDate;

    @Column(name = "healing")
    private String healing;

    @Column(name = "diagnosis")
    private String diagnosis;

    @ManyToOne(optional = false, fetch =FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    @JsonBackReference
    private Patient patient;

    public static Visit from(VisitForm form) {
        return Visit.builder()
                .cost(form.getCost())
                .healing(form.getHealing())
                .diagnosis(form.getDiagnosis())
                .visitDate(form.getVisitDate())
                .build();
    }
}
