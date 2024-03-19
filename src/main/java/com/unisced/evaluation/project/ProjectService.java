package com.unisced.evaluation.project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectsRepository;
    public void save(ProjectRequest request) {
        var project = Project.builder()
                .projectName(request.getProjectName())
                .description(request.getDescription())
                .endDate(request.getEndDate())
                .startDate(request.getStartDate())
                .status(request.getStatus())
                .build();
        projectsRepository.save(project);
    }

    public List<Project> findAll() {
        return projectsRepository.findAll();
    }

    public Optional<Project> findById(Integer id) {
        return projectsRepository.findById(id);
    }

    public void delete(Integer id) {
       projectsRepository.deleteById(id);
    }


    public void update(Integer id, ProjectRequest request) {
        projectsRepository.findById(id).ifPresent(project -> {
            project.setProjectName(request.getProjectName());
            project.setDescription(request.getDescription());
            project.setEndDate(request.getEndDate());
            project.setStartDate(request.getStartDate());
            project.setStatus(request.getStatus());
            projectsRepository.save(project);
        });
    }

}
