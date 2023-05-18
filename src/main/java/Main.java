import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String json = Files.readString(Paths.get("data/person.json"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        Person vasily = mapper.readValue(json, Person.class);
        System.out.println(vasily.getName());
        System.out.println(vasily.getJob().getSince());

        vasily.setChildren(List.of("Ольга", "Олег"));

        Car car = new Car();
        car.setLicencePlate("O777OO124");
        vasily.setCar(car);

        String newJson = mapper.writeValueAsString(vasily);
        try (FileWriter writer = new FileWriter("data/personMod.json")){
            writer.write(newJson);
        }
    }
}
