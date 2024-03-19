package com.unisced.evaluation.project;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
public class ProjectsController {

    @GetMapping()
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from Projects");
    }

}
