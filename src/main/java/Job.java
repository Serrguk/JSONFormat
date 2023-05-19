import lombok.Data;

import java.time.LocalDate;
@Data
public class Job {
    private LocalDate since;
    private String city;
    private double salary;

    public String getSince() {
        String formatterMonth = String.valueOf(since.getMonth().getValue());
        if (since.getMonth().getValue() < 10) {
            formatterMonth = 0 + String.valueOf(since.getMonth().getValue());
        }
        return since.getDayOfMonth() + "-"+ formatterMonth + "-" + since.getYear();
    }
}

