package com.unisced.evaluation.project;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
public class ProjectsController {

    private final ProjectService projectService;

    @PostMapping
    public ResponseEntity<?> save(
            @RequestBody ProjectRequest request
    ){
        System.out.println(request);
        projectService.save(request);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<Project>> findAllProjects(){
        return ResponseEntity.ok(projectService.findAll());
    }

}
