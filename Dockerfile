FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} aadhar.jar
EXPOSE 4000-4444
ENTRYPOINT ["java","-jar","aadhar.jar"]

## sudo docker run -p 8080:8080 -t docker-spring-boot:1.0
## sudo docker run -p 80:8080 -t docker-spring-boot:1.0
## sudo docker run -p 443:8443 -t docker-spring-boot:1.0
## mvn package
## FROM adoptopenjdk/openjdk11:alpine-jre
