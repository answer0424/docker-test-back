package com.lec.spring.dockertest.docker;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class DockerController {
    private final DockerService dockerService;

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers () {
        List<DockerUser> users = dockerService.getAllUser();
        return ResponseEntity.ok(users);
    }
}
