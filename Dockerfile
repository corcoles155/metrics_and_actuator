FROM openjdk:8-jdk-alpine
COPY target/metrics_and_actuator-1.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]