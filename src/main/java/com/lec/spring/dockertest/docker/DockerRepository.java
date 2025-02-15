package com.lec.spring.dockertest.docker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DockerRepository extends JpaRepository<DockerUser, Long> {

}
