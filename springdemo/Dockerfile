FROM openjdk:8-jdk-alpine
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./app.jar
COPY jacocoagent.jar .
EXPOSE 9090 6300
ENTRYPOINT ["java", "-javaagent:jacocoagent.jar=includes=*,output=tcpserver,address=*,port=6300,append=true","-jar", "app.jar"]