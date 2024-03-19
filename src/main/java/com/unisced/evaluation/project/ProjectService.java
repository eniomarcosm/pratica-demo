package com.unisced.evaluation.project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectsRepository projectsRepository;
    public void save(ProjectRequest request) {
        var project = Project.builder()
                .projectName(request.getProjectName())
                .description(request.getDescription())
                .endDate(request.getEndDate())
                .startDate(request.getStartDate())
                .status(request.getStatus())
                .build();
        System.out.println(project);
        projectsRepository.save(project);   }



    public List<Project> findAll() {
        return projectsRepository.findAll();
    }
}
