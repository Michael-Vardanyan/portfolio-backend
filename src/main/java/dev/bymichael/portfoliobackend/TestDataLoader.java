package dev.bymichael.portfoliobackend;

import dev.bymichael.portfoliobackend.model.Project;
import dev.bymichael.portfoliobackend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDataLoader implements CommandLineRunner {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void run(String... args) throws Exception {
        projectRepository.deleteAll();

        projectRepository.save(new Project("1","Project 1", "Description of Project 1", "https://project1.com"));
        projectRepository.save(new Project("2","Project 2", "Description of Project 2", "https://project2.com"));
        projectRepository.save(new Project("3","Project 3", "Description of Project 3", "https://project3.com"));

        System.out.println("Test data loaded successfully!");
    }
}