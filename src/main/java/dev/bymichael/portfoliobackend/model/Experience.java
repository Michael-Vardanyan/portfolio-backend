package dev.bymichael.portfoliobackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "experience")
@AllArgsConstructor
public class Experience {

    @Id
    private String id;

    private String year;

    private String role;

    private Company company;

    private String description;

    private String[] technologies;

    @Setter
    @Getter
    public static class Company {
        private String name;
        private String link;

    }

}
