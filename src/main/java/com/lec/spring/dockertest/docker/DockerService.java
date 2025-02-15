package com.lec.spring.dockertest.docker;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DockerService {

    private final DockerRepository dockerRepository;

    public DockerService(DockerRepository dockerRepository) {
        this.dockerRepository = dockerRepository;
    }

    public List<DockerUser> getAllUser () {
        return dockerRepository.findAll();
    }
}
