import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class Job {
    private LocalDate since;
    private String city;
    private double salary;

    public String getSince() {
        return since.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}

