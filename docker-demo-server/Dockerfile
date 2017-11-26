FROM openjdk:8
EXPOSE 8080:8080
COPY target/docker-demo-server.jar docker-demo-server.jar
ENTRYPOINT ["java","-jar","docker-demo-server.jar"]