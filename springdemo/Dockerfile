FROM openjdk:8-jdk-alpine
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./app.jar
COPY jacocoagent.jar jacococli.jar ./
EXPOSE 9090
ENTRYPOINT java $JACOCO_OPS -jar app.jar