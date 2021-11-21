FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
EXPOSE 8090
ADD ${JAR_FILE} docker-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/docker-0.0.1-SNAPSHOT.jar"]
CMD ["--spring.profiles.active=qa"]