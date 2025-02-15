FROM openjdk:17-jdk-slim
ADD /build/libs/*.jar docker-test.jar
ENTRYPOINT ["java","-Djava.security.egd-file:/dev/./urandom","-jar","/docker-test.jar"]