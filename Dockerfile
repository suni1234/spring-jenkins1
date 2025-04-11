FROM openjdk:17
EXPOSE 8080
ADD target/spring-jenkins-docker-integration.jar spring-jenkins-docker-integration
ENTRYPOINT ["java","-jar","/spring-jenkins-docker-integration" ]