import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String json = Files.readString(Paths.get("data/person.json"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        Person vasily = mapper.readValue(json, Person.class);
        System.out.println(vasily.getName());
        System.out.println(vasily.getJob().getSince());
    }
}
