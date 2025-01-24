package dev.bymichael.portfoliobackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "projects")
@AllArgsConstructor
public class Project {
    @Id
    private String id;
    private String title;
    private String description;
    private String link;
}
