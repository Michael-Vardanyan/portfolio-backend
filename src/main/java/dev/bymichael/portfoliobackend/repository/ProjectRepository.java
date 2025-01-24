package dev.bymichael.portfoliobackend.repository;

import dev.bymichael.portfoliobackend.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
