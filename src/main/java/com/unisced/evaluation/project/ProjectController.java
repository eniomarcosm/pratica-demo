package com.unisced.evaluation.project;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
public class ProjectController {

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

    @GetMapping("/{id}")
    public ResponseEntity<Project> findProjectById(@PathVariable Integer id) {
        Optional<Project> project = projectService.findById(id);
        return project.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProject(@PathVariable Integer id, @RequestBody ProjectRequest request) {
        Optional<Project> existingProject = projectService.findById(id);
        if (existingProject.isPresent()) {
            projectService.update(id, request);
            return ResponseEntity.ok("Item actualizado com sucesso!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Integer id) {
        Optional<Project> existingProject = projectService.findById(id);
        if (existingProject.isPresent()) {
            projectService.delete(id);
            return ResponseEntity.ok("Item eliminado com sucesso!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }






}
