import lombok.Data;

import java.time.LocalDate;
@Data
public class Job {
    private LocalDate since;
    private String city;
    private double salary;
}
