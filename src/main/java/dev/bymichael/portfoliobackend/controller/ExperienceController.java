package dev.bymichael.portfoliobackend.controller;

import dev.bymichael.portfoliobackend.model.Experience;
import dev.bymichael.portfoliobackend.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

    private final ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceController(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @GetMapping
    public List<Experience> getExperiences() {
        return experienceRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Experience> getExperienceById(@PathVariable String id) {
        return experienceRepository.findById(id);
    }
}
