package dev.bymichael.portfoliobackend.controller;

import dev.bymichael.portfoliobackend.model.Project;
import dev.bymichael.portfoliobackend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProjectController {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }
    @GetMapping("/project/{projectId}")
    public Optional<Project> getProjectById(@PathVariable String projectId) {
        return projectRepository.findById(projectId);
    }
}