package project.forms;

import lombok.Data;

import java.time.LocalDate;

@Data
public class VisitForm {
    private float cost;
    private LocalDate visitDate;
    private String healing;
    private String diagnosis;
}
